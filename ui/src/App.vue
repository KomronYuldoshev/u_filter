<template>
  <div id="app">
    <div id="nav">
      <v-app id="inspire">
        <fil-head/>
        <router-view/>
      </v-app>
    </div>
  </div>
</template>

<script>
import FilHead from './components/Header.vue'
// import ani from './components/animation.vue'
export default {
  data(){
    return{
      drawer: null,
    }
  },
  components:{
    FilHead,
    // ani
  }
}
</script>
<style lang="scss">
html{
  scroll-behavior: smooth;
}
:root{
  --blue: #1179BF;
  --heid--blue: #00315A;
  --black: #282525;
  --white: #EDF7FF;
  --grey: #4F4F4F;
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
//@font-face {
//  font-family: 'montserrat-r';
//  src: url(assets/font/Montserrat-Regular.ttf);
//}
.container{
  max-width: 1584px;
  margin: auto;
}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  //text-align: center;
  //color: #2c3e50;
}

#nav {
  //padding: 30px;

  a {
    //color: #2c3e50;

    &.router-link-exact-active {
      //color: #42b983;
    }
  }
}
//.splide__arrows{
//  position: absolute;
//  top: -80px !important;
//  right: 74px !important;
//  .splide__arrow{
//    transform: unset;
//    width: 54px;
//    height: 54px;
//    border-radius: unset;
//    background: var(--heid--blue);
//    opacity: unset;
//    &:nth-child(2){
//      right: -70px;
//    }
//    &:first-child{
//      left: -70px;
//    }
//    svg{
//      filter: invert(100%);
//    }
//  }
//}
//.splide__arrows{
//  position: unset;
//  top: unset !important;
//  right: unset !important;
//  .splide__arrow{
//    width: 54px;
//    height: 54px;
//    border-radius: unset;
//    background: var(--heid--blue);
//    opacity: 0.3;
//    svg{
//      filter: invert(100%);
//    }
//  }
//}
//button,
//select,
//input{
//  &:focus{
//    outline: 0;
//  }
//}
.Fill__Slide{
  .splide__pagination__page {
    background: #B2B2B2 !important;
    width: 15px !important;
    height: 15px !important;
    border-radius: 5px !important;
    margin: 8px !important;
    &.is-active{
      background: var(--blue) !important;
      width: 40px !important;
      height: 15px !important;
      border-radius: 5px;
    }
  }
}

  button{
    cursor: pointer;
  }
  .slide{
    .splide__list{
      height: 927px !important;
    }
  }
.splide__arrow{
  background: unset !important;
  width: 18px;
  &:first-child{
    left: -60px;
  }
  &:nth-child(2){
    right: -60px;
  }
}
.splide__pagination{
  left: unset !important;
  right: 98px;
}
li{
  list-style: none;
}
a{
  text-decoration: none;
}
input,
select{
  cursor: pointer;
  &:focus{
    outline: 0;
  }
}
</style>