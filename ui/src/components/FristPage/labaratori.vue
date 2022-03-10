<template>
  <div class="main__labaratori">
    <div class="main__title">ПОЗНАКОМЬТЕСЬ С НАДЕЖНЫМИ ФИЛЬТРАМИ МАРКИ FILTRON</div>
    <div class="labaratori">
      <div class="labaratori__left" data-aos="fade-right">
        <span></span>
        <div class="labaratori__left--title">КОНТРОЛЬ КАЧЕСТВА В ЛАБОРАТОРИИ</div>
        <div class="text__info">Мы производим контроль как качества материалов, используемых для производства, так и прочности и эффективности готовых продуктов. В современной лаборатории нашей компании мы используем для этих целей свыше 60 методов исследования, которые соответствуют международным стандартам</div>
      </div>
      <div class="slide__filter">
        <div class="container">
          <splide :options="options" class="ul">
            <splide-slide>
              <div class="images">
                <img src="../../assets/img/bSlide.png" alt="">
              </div>
            </splide-slide>
            <splide-slide>
              <div class="images">
                <img src="../../assets/img/bSlide.png" alt="">
              </div>
            </splide-slide>
            <splide-slide>
              <div class="images">
                <img src="../../assets/img/bSlide.png" alt="">
              </div>
            </splide-slide>
            <splide-slide>
              <div class="images">
                <img src="../../assets/img/bSlide.png" alt="">
              </div>
            </splide-slide>
          </splide>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import { Splide, SplideSlide } from '@splidejs/vue-splide';
import { createSlides } from "../../../utils/slides";
import '../../assets/slide/splide.min.css'
export default {
  data() {
    return {
      options: {
        rewind : true,
        gap    : '5rem',
        slides: createSlides(),
        type   : 'loop',
        perPage: 1,
        autoplay: true,
        drag   : 'free',
      }
    }
  },
  components: {
    Splide,
    SplideSlide,
  },
  methods: {
    // moved( splide, newIndex ) {
    //   console.log( 'moved', newIndex );
    // },
  },
}
</script>
<style scoped lang="scss">
@import "../../assets/style/FirstPage/labaratori";
[data-aos=fade-right]{
  transform: translate3d(-1000px,0,0);
}
.labaratori__left{
  transition-duration: 3s !important;
}
.title__text{
  font-size: 48px;
  line-height: 57px;
  color: #282525;
  font-family: 'Marmelad-R';
  margin-left: 100px;
  margin-top: 120px;
  margin-bottom: 92px;
}
.slide__filter{

}
.splide__slide.is-visible{
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
li{
  width: 406px !important;
}
</style>