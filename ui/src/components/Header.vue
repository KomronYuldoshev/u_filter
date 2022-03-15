<template>
  <div class="all">
    <header class="header">
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
  </div>
</template>
<style scoped lang="scss">
@import "../assets/style/Header";
</style>