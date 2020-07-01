<template>
  <div class="home">

    <h1> Bolota Mania Pet Shop
<img src="../assets/cat.png" id="cat">
    </h1>
    <h1 id="banho">Banho e tosa</h1>
    <img src="../assets/dogbanho.png" id="dog">
    <p id="price">Os melhores preços para banho e tosa, aqui seu melhor amigo é tratado com luxo!</p>
  </div>
</template>

<script>
export default {
  name: 'Home',
  props: {
  }
}
</script>


<style scoped>
.home {
}
h1 {
  margin-top: 30px;
  text-align: center;
  font-family: cursive;
  color: #808080;
}

#dog {
  width: 422px;
  height: 324px;
  margin-top: 90px;
  margin-right: 80px;
}
#shear {
  width: 211px;
  height: 162px;
  margin-top: 0px;
  margin-left: 200px;
}


#cat {
  width: 100px;
  height: 80px;
}
#banho {
  position: absolute;
  margin-left: 550px;
}

#price {
  font-family: inherit;
  font-size: 30px;
  color: #808080;
}
</style>
