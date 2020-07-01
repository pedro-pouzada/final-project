import Vue from 'vue'
import App from './App.vue'
import VueRouter from 'vue-router'

import Home from './components/Home.vue'
import About from './components/About.vue'
import Client from './components/Client.vue'
import Pet from './components/Pet.vue'

Vue.config.productionTip = false

Vue.use(VueRouter);

const router = new VueRouter({
  mode: 'history',
  routes: [
    {
      path: '/',
      redirect: '/home',
      component: Home
    },
    {
      path: '/home',
      component: Home
    },
    {
      path: '/about',
      component: About
    },
    {
      path: '/client',
      component: Client
    },
    {
      path: '/pet',
      component: Pet
    }
  ]
})

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
