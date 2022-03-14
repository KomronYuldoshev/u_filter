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
    name: 'product',
    component: () => import('../views/SecondPage')
  },
  // {
  //   path: '/product',
  //   name: 'left',
  //   component: () => import('../components/SecondPage/LeftMenu')
  // },
  {
    path: '/kompaniya',
    name: 'companiya',
    component: () => import('../views/Companiya')
  },
  {
    path: '/sertificat',
    name: 'sertificat',
    component: () => import('../views/Sertificat')
  },
  {
    path: '/contact',
    name: 'contact',
    component: () => import('../views/Contact')
  },
]

const router = new VueRouter({
  routes
})

export default router
