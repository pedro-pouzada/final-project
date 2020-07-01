<template>
  <div class="about">

    <h1> Sobre nós </h1>

    <h2 id="bittencourt">Iuri Bittencourt Brites</h2>
    <p id="email">Idade: 19 <br>
      E-mail: iuribittencourt79@gmail.com <br>
      Cidade: Canoas</p>
    <a href="https://github.com/iuribittencourt"><button class="waves-effect waves-light btn-small" id="git">GitHub</button></a>
    <img src="../assets/iuri.png" id="iuri">

    <h2 id="rafael">Pedro Rafael Pouzada Mendel Teixeira</h2>
    <p id="email">Idade: 19<br>
      E-mail: rafaelteixeirask29@gmail.com <br>
                  Cidade: Canoas</p>
    <a href="https://github.com/pedro-pouzada"><button class="waves-effect waves-light btn-small" id="git">GitHub</button></a>
    <img src="../assets/pedro.png" id="pedro">



  </div>
</template>

<script>
export default {
  name: 'About',
  props: {
  }
}
</script>


<style scoped>

#iuri {
  margin-top: 100px;
  margin-right: 700px;
  width: 278;
  height: 307;
}
#bittencourt {
  position: absolute;
  margin-left: 600px;
  margin-top: 100px;
  font-family: cursive;
  color: #000000;
}

#email {
  font-family: sans-serif;
    margin-left: 600px;
    margin-top: 200px;
    position: absolute;
    font-size: 30px;
    color: #000000;
}
#git {
  margin-left: 100px;
  margin-top: 400px;
  position: absolute;
  width: 100px;
  height: 50px;
}

#pedro {
  margin-top: 30px;
  margin-right: 850px;
}
#rafael {
  margin-top: 20px;
  margin-left: 500px;
  position: absolute;
  color: #000000;
  font-family: cursive;
}

</style>
