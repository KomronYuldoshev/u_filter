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
                @click.native="$scrollToTop"
                to="/"
            >
              Главная
            </router-link>
            <span></span>
          </li>
          <li>
            <router-link
                @click.native="$scrollToTop"
                to="/product"
            >
              Продукты
            </router-link>
            <span></span>
          </li>
          <li>
            <router-link
                @click.native="$scrollToTop"
                to="/kompaniya"
            >
              Компания
            </router-link>
            <span></span>
          </li>
          <li>
            <router-link
                @click.native="$scrollToTop"
                to="/Sertificat"
            >
              Сертификаты
            </router-link>
            <span></span>
          </li>
          <li>
            <router-link
                @click.native="$scrollToTop"
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
    <div class="menu2" :class="{'active' : isActive}" @mouseup="menu">
      <ul>
        <li @click="exit__menu">
          <router-link
              @click.native="$scrollToTop"
              to="/"
          >
            Главная
          </router-link>
          <span></span>
        </li>
        <li @click="exit__menu" class="product__menu">
          <router-link
              @click.native="$scrollToTop"
              to="/product"
          >
            Продукты
          </router-link>
          <span></span>
        </li>
        <li @click="exit__menu">
          <router-link
              @click.native="$scrollToTop"
              to="/kompaniya"
          >
            Компания
          </router-link>
          <span></span>
        </li>
        <li @click="exit__menu">
          <router-link
              @click.native="$scrollToTop"
              to="/Sertificat"
          >
            Сертификаты
          </router-link>
          <span></span>
        </li>
        <li @click="exit__menu">
          <router-link
              @click.native="$scrollToTop"
              to="/contact"
          >
            Контакты
          </router-link>
          <span></span>
        </li>
      </ul>
    </div>
    <div :class=" isOpen ? 'bg_all' : 'back' "  @mouseup="menu"></div>
<!--    <div class="back"></div>-->
  </div>
</template>
<script>
export default {
  data(){
    return{
      isActive: false,
      isOpen: false,
    }
  },
  methods:{
    menu(){
      this.isActive = !this.isActive
      this.isOpen = !this.isOpen
    },
    exit__menu(){
      this.isActive = false
    },
    scrollToTop() {
      window.scrollTo(0,0);
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