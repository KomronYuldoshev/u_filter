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
    <div>
      <slide/>
      <fil/>
      <sliderr/>
      <labaratori/>
      <autoscroll/>
      <maps/>
      <padpiska/>
      <foter/>
    </div>
  </div>
</template>
<script>
import slide from '../components/FristPage/FilterSlide'
import fil from '../components/FristPage/SpecialFilter'
import sliderr from '../components/FristPage/slider'
import labaratori from '../components/FristPage/labaratori'
import autoscroll from '../components/FristPage/autoscroll'
import maps from '../components/FristPage/Maps'
import padpiska from '../components/FristPage/Patpisatsiya'
import foter from '../components/FristPage/Footer'
export default {
  data() {
    return {}
  },
  components: {
    slide,
    fil,
    sliderr,
    labaratori,
    autoscroll,
    maps,
    padpiska,
    foter
  },
  mounted() {
    window.addEventListener("scroll", function () {
      let animation = document.querySelector(".animation");
      animation.classList.toggle("sticky", window.scrollY > 500)
    })
  }
}
</script>
<style lang="scss" scoped>
.all {
  position: relative;
}

.animation {
  position: fixed;
  right: 100px;
  top: 745px;
  z-index: 1;
  display: none;
  cursor: pointer;

  .img1 {
    position: relative;

    .img2,
    .img3 {
      img {
        position: absolute;
        top: 20px;
        left: 0;
        right: 0;
        margin: auto;
      }
    }
  }

  &.sticky {
    display: block;
  }

  .img2 {
    img {
      transition: all ease .4s;
    }
  }

  &:hover {
    .img2 {
      img {
        top: -70px;
        transition: all ease .4s;
        opacity: 0;
      }
    }

    .img3 {
      img {
        animation: example 1.5s infinite;
        @keyframes example {
          0% {
            top: 10px
          }
          50% {
            top: 40px
          }
          100% {
            top: 10px
          }
        }
      }
    }
  }
}

</style>