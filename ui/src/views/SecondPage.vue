<template>
  <div class="all">
    <a href="#">
      <div class="animation">
        <div class="img1">
          <img src="../assets/img/anim1.png" alt="">
          <div class="img2"><img src="../assets/img/anim2.png" alt=""></div>
          <div class="img3"><img src="../assets/img/anim3.png" alt=""></div>
        </div>
      </div>
    </a>
    <div class="rightpage">

      <left/>

      <span></span>

      <right/>

    </div>
  </div>
</template>
<script>
import left from '../components/SecondPage/LeftMenu'
import right from '../components/SecondPage/RightPage'
export default {
  data(){
    return{

    }
  },
  components:{
    left,
    right
  },
  mounted() {
    window.addEventListener("scroll", function(){
      let animation = document.querySelector(".animation");
      animation.classList.toggle("sticky", window.scrollY > 300)
    })
  }
}
</script>
<style lang="scss" scoped>
.rightpage{
  display: flex;
  padding-top: 240px;
  max-width: 1764px;
  margin: auto;
  height: 100%;
  justify-content: space-between;
  span{
    width: 2px;
    height: 100%;
    background: #E1E1E1;
    display: block;
    margin-left: 436px;
  }
}
.all{
  position: relative;
}
.animation{
  position: fixed;
  right: 100px;
  top: 745px;
  z-index: 1;
  display: none;
  cursor: pointer;
  .img1{
    position: relative;
    .img2,
    .img3{
      img{
        position: absolute;
        top: 20px;
        left: 0;
        right: 0;
        margin: auto;
      }
    }
  }
  &.sticky{
    display: block;
  }
  .img2{
    img{
      transition: all ease .4s;
    }
  }
  &:hover{
    .img2{
      img{
        top: -70px;
        transition: all ease .4s;
        opacity: 0;
      }
    }
    .img3{
      img{
        animation:example 1.5s infinite ;
        @keyframes example {
          0%   {top: 10px}
          50%  {top: 40px}
          100% {top: 10px}
        }
      }
    }
  }
}

</style>