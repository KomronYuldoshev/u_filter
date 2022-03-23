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
    component: () => import('../views/SecondPageFil')
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
  {
    path: '/product/a',
    name: 'product',
    meta: {
      title:"Воздушные фильтры",
      img:"/img/servise1.6357e047.svg",
      info1:"Воздушный фильтр улавливает пыль из воздуха, всасываемого двигателем и помогает поддерживать надлежащую мощность двигателя, крутящий момент и низкий расход топлива.",
      info2:"Если бы не фильтр, загрязненный воздух с уличной пылью и цветочной пыльцой попадал бы непосредственно в камеру сгорания. Загрязняющие вещества в двигателе оказывают такое действие, как наждачная бумага и вызывают повреждение поршневых колец, вкладышей подшипников и цилиндров."
    },
    component: () => import('../views/SecondPageFil'),
  },
  {
    path: '/product/b',
    name: 'product',
    meta: {
      title:"Cалонный фильтры",
      img:"/img/servise2.04615d05.svg",
      info1:"Салонный фильтр очищает воздух в салоне автомобиля, которым дышат пассажиры и водитель. Работа салонного воздушного фильтра очень важна, поскольку загрязненный воздух значительно влияет на наше здоровье и концентрацию во время вождения. Загрязненный воздух является очень серьезной угрозой. Согласно официальным данным Европейского агентства по окружающей среде:",
      info2:"Из-за загрязненного воздуха только в Европе ежегодно преждевременно умирают более 460 000 человек.",
      info3:"Проблема чрезмерно загрязненного воздуха касается 80% жителей всех городских районов Европы"
    },
    component: () => import('../views/SecondPageFil')
  },
  {
    path: '/product/c',
    name: 'product',
    meta: {
      title:"Масляные фильтры",
      img:"/img/servise3.d111d1f6.svg",
      info1:"Масляный фильтр очищает масло, циркулирующее в двигателе, захватывая все частицы, образующиеся в процессе износа подвижных частей, а также твердые частицы и остатки от процесса сгорания. Если бы не фильтр, загрязненное масло привело бы к ускоренному износу подвижных деталей и увеличению риска повреждения двигателя.",
    },
    component: () => import('../views/SecondPageFil')
  },
  {
    path: '/product/d',
    name: 'product',
    meta: {
      title:"Топливные фильтры",
      img:"/img/servise4.6d0d554f.svg",
      info1:"Топливный фильтр улавливает загрязняющие вещества, содержащиеся в топливе, в частности, ржавчину, металлическую стружку, пыль и другие твердые частицы. Последствиями несоответствующей фильтрации топлива могут быть:",
      info2:"значительное снижение мощности двигателя",
      info3:"нарушение или прерывание подачи топлива",
      info4:"повреждение компонентов топливной системы",
    },
    component: () => import('../views/SecondPageFil')
  },
  {
    path: '/product/e',
    name: 'product',
    meta: {
      title:"Другие",
      img:"/img/servise5.ed1b1681.svg",
    },
    component: () => import('../views/SecondPageFil')
  },
]

const router = new VueRouter({
  routes
})

export default router
