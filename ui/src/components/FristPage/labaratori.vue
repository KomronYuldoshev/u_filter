<template>
  <div class="main__labaratori">
    <div class="main__title">ПОЗНАКОМЬТЕСЬ С НАДЕЖНЫМИ ФИЛЬТРАМИ МАРКИ FILTRON</div>
    <div class="labaratori">
      <div class="labaratori__left" data-aos="fade-right">
        <span></span>
        <div class="labaratori__left--title">КОНТРОЛЬ КАЧЕСТВА В ЛАБОРАТОРИИ</div>
        <div class="text__info">Мы производим контроль как качества материалов, используемых для производства, так и
          прочности и эффективности готовых продуктов. В современной лаборатории нашей компании мы используем для этих
          целей свыше 60 методов исследования, которые соответствуют международным стандартам
        </div>
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
import {Splide, SplideSlide} from '@splidejs/vue-splide';
import {createSlides} from "../../../utils/slides";
import '../../assets/slide/splide.min.css'

export default {
  data() {
    return {
      options: {
        rewind: true,
        gap: '5rem',
        slides: createSlides(),
        type: 'loop',
        perPage: 1,
        autoplay: true,
        drag: 'free',
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

li {
  width: 406px !important;
}
@media (max-width: 1700px) {
  .main__labaratori .main__title {
    margin: 60px 40px 40px 40px;
  }
  .labaratori {
    margin-left: 40px;
    margin-right: 40px;
    .labaratori__left {
      span {

      }

      .labaratori__left--title {

      }

      .text__info {

      }

    }

    .slide__filter {
      .container {

      }
    }

  }
}
@media (max-width: 1550px) {
  .main__labaratori .main__title {
    margin-top: 60px;
    margin-bottom: 40px;
    font-size: 20px;
    line-height: 24px;
  }
  .labaratori {
    .labaratori__left {
      max-width: 800px;
      margin-right: 10px;

      span {
        margin-bottom: 20px;
      }

      .labaratori__left--title {
        font-size: 32px;
        line-height: 37px;
        margin-bottom: 32px;
      }

      .text__info {
        font-size: 20px;
        line-height: 130%;
      }

    }

    .slide__filter {
      width: 388px !important;

      .container {
        .splide {
          .splide__arrows {
            button {

            }
          }

          .splide__track {
            ul {
              li {
                width: 388px !important;

                .images {
                  width: 388px !important;

                  img {
                    width: 388px !important;
                  }
                }
              }
            }
          }


        }
      }
    }

  }
}
@media (max-width: 900px) {
  .labaratori {
    .labaratori__left {
      max-width: 290px;
      margin-right: 10px;

      span {
        margin-bottom: 20px;
      }

      .labaratori__left--title {
        font-size: 17px;
        line-height: 20px;
        margin-bottom: 32px;
      }

      .text__info {
        font-size: 12px;
        line-height: 130%;
      }

    }

    .slide__filter {
      width: 219px !important;
      height: 291px !important;

      .container {
        .splide {
          .splide__arrows {
          }

          .splide__track {
            width: 219px !important;
            height: 291px !important;

            ul {
              li {
                width: 219px !important;
                height: 291px !important;

                .images {
                  width: 219px !important;
                  height: 291px !important;

                  img {
                    width: 219px !important;
                    height: 291px !important;
                  }
                }
              }
            }
          }


        }
      }
    }

  }
}
@media (max-width: 650px) {
  .main__labaratori .main__title {
    margin: 40px 0;
    padding: 0 16px;
  }
  .labaratori {
    margin: 40px 0 0 0;
    padding: 0 16px;
    flex-direction: column-reverse;
    align-items: center;

    .labaratori__left {
      max-width: unset;
      margin-top: 20px;

      span {
      }

      .labaratori__left--title {
      }

      .text__info {
      }

    }

    .slide__filter {
      .container {
        .splide {
          .splide__arrows {
          }

          .splide__track {
            ul {
              li {
                .images {
                  img {
                  }
                }
              }
            }
          }


        }
      }
    }

  }
}
</style>