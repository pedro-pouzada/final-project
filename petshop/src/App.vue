<template>
  <div id="app">
  <nav>
    <div class="nav-wrapper blue darken-1">
      <a href="/home" class="brand-logo" id="home">Home</a>
      <a href="/client" class="brand-logo" id="client">Clientes</a>
      <a href="/about" class="brand-logo" id="sobre">Sobre nós</a>
      <a href="/pet" class="brand-logo" id="pets">Pets</a>
    </div>
  </nav>




    <router-view></router-view>


</div>
</template>

<script>

export default {
  name: 'App',
  components: {
  }
}

</script>

<style>
a {
  margin: 12px;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 44px;
}

#pet {
  margin-left: -8px;
}
#home {
  margin-left: -300px;
}
#client {
  margin-left: -200px;
}
#pets {
  margin-left: -50px;
}
#sobre {
  margin-left: 50px;
}

body {
}
</style>
