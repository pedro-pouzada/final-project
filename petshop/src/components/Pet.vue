<template>
  <div class="pet">

    <h1> Pets </h1>

    <p class="register">Quantidade de pets: {{pets.length}}</p>

    <form @submit.prevent="saveAndUpdatePet" class="register">
    <div class="">
      <input type="text" v-model="pet.name" placeholder="digite o nome do seu pet">
    </div>
    <div>
      <input type="text" v-model="pet.typePet" placeholder="digite o tipo do seu pet">
    </div>
    <div>
      <input type="text" v-model="pet.age" placeholder="digite a idade do seu pet">
    </div>
    <div>
      <input type="text" v-model="pet.weight" placeholder="digite o peso do seu pet">
    </div>
    <button class="waves-effect waves-light btn-small">Salvar</button>
    <button v-show="pet.id" @click="cancelUpdate" class="waves-effect waves-light btn-small">cancelar</button>
    </form>

    <form @submit.prevent="findById">
    <div>
    <input type="text" v-model="pet.id" placeholder="Digite o código do pet que deseja buscar">
    </div>
    <button class="waves-effect waves-light btn-small">Buscar</button>
    </form>

    <div v-show="findPet.id">
    <h1>Pet encontrado</h1>
    <p>
        Código: {{findPet.id}} <br>
        Nome: {{findPet.name}} <br>
        Tipo do Pets: {{findPet.typePet}} <br>
        Idade: {{findPet.age}} <br>
        Peso: {{findPet.weight}} <br>
    </p>

    <table v-show="pets.length > 0">
      <thead>
        <tr>
          <th>Id</th>
          <th>Nome</th>
          <th>Tipo do pet</th>
          <th>Idade</th>
          <th>Peso</th>
          <th>Excluir</th>
          <th>Alterar</th>
        </tr>
      </thead>
      <tfoot>
        <tr>
          <th>Id</th>
          <th>Nome</th>
          <th>Tipo do pet</th>
          <th>Idade</th>
          <th>Peso</th>
          <th>Excluir</th>
          <th>Alterar</th>
        </tr>
      </tfoot>

        <tbody>
          <tr v-for="pet in pets" :key="pet.id">
            <td>{{pet.id}}</td>
            <td>{{pet.name}}</td>
            <td>{{pet.typePet}}</td>
            <td>{{pet.age}}</td>
            <td>{{pet.weight}}</td>
            <td>
            <button type="button" @click="deletePet(pet)" class="waves-effect waves-light btn-small">Excluir</button>
          </td>
          <td>
            <button type="button" @click="updatePet(pet)" class="waves-effect waves-light btn-small">Alterar</button>
          </td>
          </tr>

        </tbody>
    </table>
    </div>

  </div>
</template>

<script>
import PetServices from '../services/petservices'
export default {
  data() {
    return {
      pet: {
        id: '',
        name: '',
        typePet: '',
        age: '',
        weight: ''
      },
      findPet: {
        id: '',
        name: '',
        typePet: '',
        age: '',
        weight: ''
      },
      pets: []
    }
  },
  name: 'Pet',
  props: {
  },
 mounted() {
   this.listPets();
 },
 methods: {
   listPets() {
     PetServices.findAll().then(response => {
      this.pets = response.data;
    });
  },
  saveAndUpdatePet() {
    if(!this.pet.id) {
      PetServices.save(this.pet).then(response => {
        this.listPets();
        this.pet = {};
        alert("Pet adicionado com sucesso!");
        return response;
      });
    } else {

   PetServices.update(this.pet).then(response => {
     this.listPets();
     this.pet = {};
     alert("Pet atualizado com sucesso!");
     return response;
   });
    }
  },
  deletePet(pet) {
    if(confirm("Deseja excluir o pet?")) {
      PetServices.delete(pet).then(response => {
        this.listPets();
        alert("Pet excluído com sucesso!");
        return response;
      });
    }
  },
  findById() {
    PetServices.findById(this.pet).then(response => {
      this.findPet = response.data;
    });
  },
  updatePet(pet) {
    this.pet = pet;
  },
  cancelUpdate() {
    this.pet = {};
    alert("Alteração cancelada");
  }
  }
}
</script>


<style scoped>

</style>
