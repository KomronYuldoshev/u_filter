import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    Active: false,
    item: false
  },
  mutations: {
  },
  actions: {
  },
  modules: {
  },
  getters: {
    isActive(state){
      return state.Active
    },
    item(state){
      return state.item
    }
  }
})
