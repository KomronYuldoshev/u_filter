import Vue from 'vue'
import VueRouter from 'vue-router'


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'first__page',
    component: () => import('../views/FirstPage')
  },
  {
    path: '/product',
    name: 'first__page',
    component: () => import('../views/SecondPage')
  },
  {
    path: '/kompaniya',
    name: 'companiya',
    component: () => import('../views/Companiya')
  },
]

const router = new VueRouter({
  routes
})

export default router