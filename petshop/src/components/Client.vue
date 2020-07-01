<template>
  <div class="client">
    <h1 class="register"> Clientes </h1>
<p class="register">Quantidade de clientes: {{clients.length}}</p>

<form @submit.prevent="saveAndUpdateClient" class="register">
<div class="">
  <input type="text" v-model="client.login" placeholder="digite o seu login">
</div>
<div>
  <input type="text" v-model="client.pass" placeholder="digite a sua senha">
</div>
<div>
  <input type="text" v-model="client.email" placeholder="digite o seu e-mail">
</div>
<div>
  <input type="text" v-model="client.address" placeholder="digite o seu endereço">
</div>
<div>
  <input type="text" v-model="client.phone" placeholder="digite o seu telefone">
</div>
<button class="waves-effect waves-light btn-small">Salvar</button>
<button v-show="client.id" @click="cancelUpdate" class="waves-effect waves-light btn-small">cancelar</button>
</form>

<form @submit.prevent="findById">
<div>
<input type="text" v-model="client.id" placeholder="Digite o código que deseja buscar">
</div>
<button class="waves-effect waves-light btn-small">Buscar</button>
</form>

<div v-show="findClient.id">
<h1>Cliente encontrado</h1>
<p>
    Código: {{findClient.id}} <br>
    Login: {{findClient.login}} <br>
    Password: {{findClient.email}} <br>
    Endereço: {{findClient.address}} <br>
    Telefone: {{findClient.phone}} <br>
</p>

<table v-show="clients.length > 0">
  <thead>
    <tr>
      <th>Id</th>
      <th>Login</th>
      <th>Password</th>
      <th>E-mail</th>
      <th>Endereço</th>
      <th>Telefone</th>
      <th>Excluir</th>
      <th>Alterar</th>
    </tr>
  </thead>
  <tfoot>
    <tr>
      <th>Id</th>
      <th>Login</th>
      <th>Password</th>
      <th>E-mail</th>
      <th>Endereço</th>
      <th>Telefone</th>
      <th>Excluir</th>
      <th>Alterar</th>
    </tr>
  </tfoot>

    <tbody>
      <tr v-for="client in clients" :key="client.id">
        <td>{{client.id}}</td>
        <td>{{client.login}}</td>
        <td>{{client.pass}}</td>
        <td>{{client.email}}</td>
        <td>{{client.address}}</td>
        <td>{{client.phone}}</td>
        <td>
        <button type="button" @click="deleteClient(client)" class="waves-effect waves-light btn-small">Excluir</button>
      </td>
      <td>
        <button type="button" @click="updateClient(client)" class="waves-effect waves-light btn-small">Alterar</button>
      </td>
      </tr>

    </tbody>
</table>
</div>

  <img src="../assets/dog.png">


</div>
</template>

<script>
import ClientServices from '../services/clientservices'
export default {
  data() {
    return {
      client: {
        id: '',
        login: '',
        pass: '',
        email: '',
        address: '',
        phone: ''
      },
      findClient: {
        id: '',
        login: '',
        pass: '',
        email: '',
        address: '',
        phone: ''
      },
      clients: []
    }
  },
  name: 'Client',
  props: {
  },
 mounted() {
   this.listClients();
 },
 methods: {
   listClients() {
     ClientServices.findAll().then(response => {
      this.clients = response.data;
    });
  },
  saveAndUpdateClient() {
    if(!this.client.id) {
      ClientServices.save(this.client).then(response => {
        this.listClients();
        this.client = {};
        alert("Cliente adicionado com sucesso!");
        return response;
      });
    } else {

   ClientServices.update(this.client).then(response => {
     this.listClients();
     this.client = {};
     alert("Cliente atualizado com sucesso!");
     return response;
   });
    }
  },
  deleteClient(client) {
    if(confirm("Deseja excluir o cliente?")) {
      ClientServices.delete(client).then(response => {
        this.listClients();
        alert("Cliente excluído com sucesso!");
        return response;
      });
    }
  },
  findById() {
    ClientServices.findById(this.client).then(response => {
      this.findClient = response.data;
    });
  },
  updateClient(client) {
    this.client = client;
  },
  cancelUpdate() {
    this.client = {};
    alert("Alteração cancelada");
  }
  }
}
</script>

<style scoped>
.register {
  margin-top: 90px;
}


</style>
