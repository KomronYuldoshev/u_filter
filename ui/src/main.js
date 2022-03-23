import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import VueSplide from '@splidejs/vue-splide';
import vuetify from './plugins/vuetify'
import AOS from 'aos'
import 'aos/dist/aos.css'
import {i18n} from './i18n/index'

Vue.use( VueSplide );
Vue.config.productionTip = false

new Vue({
  router,
  i18n,
  store,
  vuetify,
  mounted() {
    AOS.init()
  },
  render: h => h(App)
}).$mount('#app')
