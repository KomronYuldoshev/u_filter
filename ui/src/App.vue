<template>
  <div id="app">
    <div id="nav">
      <v-app id="inspire">
        <fil-head/>
<!--        <router-view />-->
        <div class="pro" v-if="$route.name=='product'">
<!--          <product/>-->
        </div>
      </v-app>
    </div>
  </div>
</template>

<script>
import FilHead from './components/Header.vue'
// import product from './components/SecondPage/LeftMenu'

export default {
  data() {
    return {
      drawer: null,
      productB: false
    }
  },
  components: {
    FilHead,
    // product
  },
}
</script>
<style lang="scss">
html {
  scroll-behavior: smooth;
}

:root {
  --blue: #1179BF;
  --heid--blue: #00315A;
  --black: #282525;
  --white: #EDF7FF;
  --grey: #4F4F4F;
}
body{
  max-width: 1920px;
  margin: 0 auto;
}
@font-face {
  font-family: 'Lato-Regular';
  src: url(assets/font/Lato-Regular.ttf);
}

@font-face {
  font-family: 'Lato-Light';
  src: url(assets/font/Lato-Light.ttf);
}

@font-face {
  font-family: 'Marmelad-R';
  src: url(assets/font/Marmelad-Regular.ttf);
}

@font-face {
  font-family: 'Lato-Medium';
  src: url(assets/font/Lato-Medium.ttf);
}

.container {
  max-width: 1584px;
  margin: auto;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}

.Fill__Slide {
  .splide__pagination__page {
    background: #B2B2B2 !important;
    width: 15px !important;
    height: 15px !important;
    border-radius: 5px !important;
    margin: 8px !important;

    &.is-active {
      background: var(--blue) !important;
      width: 40px !important;
      height: 15px !important;
      border-radius: 5px;
    }
  }
}

button {
  cursor: pointer;
}

.slide {
  .splide__list {
    height: 927px !important;
  }
}

.splide__arrow {
  background: unset !important;
  width: 18px;

  &:first-child {
    left: -60px;
  }

  &:nth-child(2) {
    right: -60px;
  }
}

.splide__pagination {
  left: unset !important;
  right: 98px;
}

li {
  list-style: none;
}

a {
  text-decoration: none;
}

input,
select {
  cursor: pointer;

  &:focus {
    outline: 0;
  }
}
.pro{
  position: absolute;
  top: 240px;
  left: 47px;
}
</style>