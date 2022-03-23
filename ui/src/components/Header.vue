<template>
  <div class="all">
    <header class="header">
      <button class="menu__icon active_menu" :class=" isActive ? 'active' : ''  " @click="menu">
        <span></span>
<!--        <img src="../assets/img/menu.png" alt="">-->
      </button>
      <div class="logo">
        <a href="/">
          <img src="../assets/img/logo.svg" alt="">
        </a>
      </div>
      <div class="menu">
        <ul>
          <li>
            <router-link
                to="/"
            >
              Главная
            </router-link>
            <span></span>
          </li>
          <li>
            <router-link
                to="/product"
            >
              Продукты
            </router-link>
            <span></span>
          </li>
          <li>
            <router-link
                to="/kompaniya"
            >
              Компания
            </router-link>
            <span></span>
          </li>
          <li>
            <router-link
                to="/Sertificat"
            >
              Сертификаты
            </router-link>
            <span></span>
          </li>
          <li>
            <router-link
                to="/contact"
            >
              Контакты
            </router-link>
            <span></span>
          </li>
        </ul>
      </div>
      <div class="search__language">
        <div class="search">
          <button>
            <img src="../assets/img/search.svg" alt="">
          </button>
        </div>
        <div class="language">
          <select name="" id="">
            <option value="RU">RU</option>
            <option value="UZ">UZ</option>
            <option value="EN">EN</option>
          </select>
        </div>
      </div>
    </header>
    <div class="menu2" :class="{'active' : isActive}">
      <ul>
        <li @click="exit__menu">
          <router-link
              to="/"
          >
            Главная
          </router-link>
          <span></span>
        </li>
        <li @click="exit__menu" class="product__menu">
          <router-link
              to="/product"
          >
            Продукты
          </router-link>
          <span></span>
        </li>
        <li @click="exit__menu">
          <router-link
              to="/kompaniya"
          >
            Компания
          </router-link>
          <span></span>
        </li>
        <li @click="exit__menu">
          <router-link
              to="/Sertificat"
          >
            Сертификаты
          </router-link>
          <span></span>
        </li>
        <li @click="exit__menu">
          <router-link
              to="/contact"
          >
            Контакты
          </router-link>
          <span></span>
        </li>
      </ul>
    </div>
<!--    <div class="back"></div>-->
  </div>
</template>
<script>
export default {
  data(){
    return{
      isActive: false
    }
  },
  methods:{
    menu(){
      this.isActive = !this.isActive
    },
    exit__menu(){
      this.isActive = false
    }
  }
}
</script>
<style scoped lang="scss">
@import "../assets/style/Header";
@media (max-width: 800px) {
  .product__menu{
    display: none !important;
  }
}
</style>