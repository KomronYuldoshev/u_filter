<template>
  <div class="all">
    <sertificat/>
    <auto/>
    <padpiska/>
    <foter/>
  </div>
</template>
<script>
import sertificat from '../components/sertificat/sertificat'
import auto from '../components/FristPage/autoscroll'
import padpiska from '../components/FristPage/Patpisatsiya'
import foter from '../components/FristPage/Footer'
export default {
  data() {
    return {

    }
  },
  components: {
    auto,
    padpiska,
    foter,
    sertificat
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

.companiya__main {
  padding-top: 240px;
}

.filter {
  display: flex;
  align-items: center;
  justify-content: space-between;

  .text {
    margin-right: 100px;
  }

  .hr__span {
    width: 250px;
    height: 4px;
    background: #e1e1e1;
    display: block;
    margin-bottom: 64px;
  }

  .title__menu {
    font-size: 36px;
    line-height: 43px;
    color: #282525;
    font-family: 'Marmelad-R';
    max-width: 867px;
  }

  .text__info {
    font-size: 24px;
    line-height: 130%;
    color: #4F4F4F;
    opacity: 0.7;
    max-width: 867px;
    margin-top: 32px;
  }
}

.filter2 {
  display: flex;
  align-items: center;
  justify-content: space-between;

  .text {
    margin-left: 100px;
  }

  .hr__span {
    width: 250px;
    height: 4px;
    background: #e1e1e1;
    display: block;
    margin-bottom: 64px;
  }

  .title__menu {
    font-size: 36px;
    line-height: 43px;
    color: #282525;
    font-family: 'Marmelad-R';
    max-width: 867px;
  }

  .text__info {
    font-size: 24px;
    line-height: 130%;
    color: #4F4F4F;
    opacity: 0.7;
    max-width: 867px;
    margin-top: 32px;
  }
}

.data__aos {
  transition-duration: 2s !important;
}

.title__componiya {
  font-size: 48px;
  line-height: 57px;
  text-align: center;
  color: #282525;
}

.filimg1 {
  img {
    margin-right: 100px;
  }
}

.filimg2 {
  img {
    margin-left: 100px;
  }
}

.filter2 {
  margin-top: 120px;
  margin-bottom: 64px;
}

li {
  list-style-type: disc !important;

  &:first-child {
    margin-bottom: 24px;
  }
}
</style>
<style scoped lang="scss">
@import "../assets/style/FirstPage/labaratori";

[data-aos=fade-right] {
  transform: translate3d(-1000px, 0, 0);
}

.labaratori__left {
  transition-duration: 3s !important;
}

.title__text {
  font-size: 48px;
  line-height: 57px;
  color: #282525;
  font-family: 'Marmelad-R';
  margin-left: 100px;
  margin-top: 120px;
  margin-bottom: 92px;
}

.slide__filter {

}

.splide__slide.is-visible {
  margin-right: 65px !important;
}

.my-slider-progress {
  background: #ccc;
}

.my-slider-progress-bar {
  background: greenyellow;
  height: 2px;
  transition: width 400ms ease;
  width: 0;
}

//li{
//  width: 406px !important;
//}
[data-aos=fade-right] {
  transform: translate3d(1000px, 0, 0);
}

[data-aos=fade-left] {
  transform: translate3d(-1000px, 0, 0);
}
</style>