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
  width: 65%;
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
  margin-left: 67px;
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
  width: 100% !important;
}
.splide__slide img{
  width: 100%;
}
@media (max-width: 1170px) {
  .labaratori .labaratori__left .labaratori__left--title{
    font-size: 35px;
  }
  .labaratori .labaratori__left .text__info{
    font-size: 15px;
  }
  [data-aos=fade-right]{
    transform: translate3d(-10px,0,0);
  }
}
@media (max-width: 1000px) {
  .main__labaratori .main__title{
    margin: 80px 16px;
  }
}
@media (max-width: 700px) {
  .main__labaratori .main__title{
    font-size: 28px;
    line-height: 33px;
  }
}
@media (max-width: 937px) {
  .labaratori{
    flex-direction: column;
  }
  .labaratori__left{
    width: 100%;
  }
  .labaratori .slide__filter{
    width: 100%;
    margin-left: unset;
    order: -1;
    margin-bottom: 46px;
  }
}
@media (max-width: 632px) {
  .labaratori .labaratori__left .labaratori__left--title{
    font-size: 28px;
    line-height: 33px;
    margin-left: -84px;
    margin-right: -95px;
  }
  .labaratori .labaratori__left .text__info{
    font-size: 14px;
    line-height: 130%;
    margin-left: -84px;
    margin-right: -95px;
  }
  .labaratori .labaratori__left span{
    margin-left: -84px;
  }
}
</style>