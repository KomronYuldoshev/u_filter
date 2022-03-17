<template>
  <div class="slide Fill__Slide">
    <div class="container">
      <splide :options="options" class="ul">
        <splide-slide>
          <div class="filter__title">
            Простой выбор и установка каждого <br> фильтра Universal
            <span>Filter</span>
          </div>
          <div class="filter__text">
            Полезный каталог, инструкция по сборке, разборчивая упаковка и <br> легко запоминающаяся система нумерации. <br>
            Фильтры
            <span class="fil__span">
              Universal
              <span>
                Filter
              </span>
            </span>
          </div>
          <div class="more__btn">
            <button>
              Подробнее
            </button>
          </div>
          <div class="filter__img">
            <img src="../../assets/img/bigfilter.png" alt="">
          </div>
        </splide-slide>
        <splide-slide>
          <div class="filter__title">
            Простой выбор и установка каждого <br> фильтра Universal
            <span>Filter</span>
          </div>
          <div class="filter__text">
            Полезный каталог, инструкция по сборке, разборчивая упаковка и <br> легко запоминающаяся система нумерации. <br>
            Фильтры
            <span class="fil__span">
              Universal
              <span>
                Filter
              </span>
            </span>
          </div>
          <div class="more__btn">
            <button>
              Подробнее
            </button>
          </div>
          <div class="filter__img">
            <img src="../../assets/img/bigfilter.png" alt="">
          </div>
        </splide-slide>
        <splide-slide>
          <div class="filter__title">
            Простой выбор и установка каждого <br> фильтра Universal
            <span>Filter</span>
          </div>
          <div class="filter__text">
            Полезный каталог, инструкция по сборке, разборчивая упаковка и <br> легко запоминающаяся система нумерации. <br>
            Фильтры
            <span class="fil__span">
              Universal
              <span>
                Filter
              </span>
            </span>
          </div>
          <div class="more__btn">
            <button>
              Подробнее
            </button>
          </div>
          <div class="filter__img">
            <img src="../../assets/img/bigfilter.png" alt="">
          </div>
        </splide-slide>
      </splide>
    </div>
    <service/>
  </div>
</template>
<script>
import { Splide, SplideSlide } from '@splidejs/vue-splide';
import { createSlides } from "../../../utils/slides";
import '../../assets/slide/splide.min.css'
import service from '../../components/Services/Services'
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
    service,
  },
  methods: {
    // moved( splide, newIndex ) {
      // console.log( 'moved', newIndex );
    // },
  },
}
</script>
<style scoped lang="scss">
@import "../../assets/style/FirstPage/FilterSlide";
</style>