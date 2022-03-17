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
      <div class="companiya__main">
        <div class="title__componiya">
          Компания
        </div>
        <div class="filter2">
          <div class="text data__aos" data-aos="fade-left">
            <span class="hr__span"></span>
            <div class="title__menu">
              НАДЕЖНЫЕ ФИЛЬТРЫ И РЕШЕНИЯ, ОБЛЕГЧАЮЩИЕ РАБОТУ
            </div>
            <div class="text__info">
              <ul>
                <li>Наша компетентность и стандарты качества гарантируют, что каждый фильтр FILTRON обеспечивает
                  надежную защиту в течение всего периода рекомендуемого использования.
                </li>
                <li>Тысячи механиков по всей Европе выбирают фильтры FILTRON и ценят решения, облегчающие их работу.
                </li>
              </ul>
            </div>
          </div>
          <div class="filimg1">
            <img src="../assets/img/comFil.png" alt="">
          </div>
        </div>
        <div class="filter">
          <div class="filimg2">
            <img src="../assets/img/comFil2.png" alt="">
          </div>
          <div class="text data__aos" data-aos="fade-right">
            <span class="hr__span"></span>
            <div class="title__menu">
              СОВРЕМЕННЫЕ ПРОИЗВОДСТВЕННЫЕ ЛИНИИ
            </div>
            <div class="text__info">
              Качество и надежность фильтров FILTRON - это заслуга современных и передовых технологий, используемых на
              заводах нашей компании. За производство фильтров бренда FILTRON отвечает свыше 2000 специалистов.
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="labaratori">
      <div class="labaratori__left" data-aos="fade-left">
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
                <img src="../assets/img/sertifikat.png" alt="">
              </div>
            </splide-slide>
            <splide-slide>
              <div class="images">
                <img src="../assets/img/sertifikat.png" alt="">
              </div>
            </splide-slide>
            <splide-slide>
              <div class="images">
                <img src="../assets/img/sertifikat.png" alt="">
              </div>
            </splide-slide>
            <splide-slide>
              <div class="images">
                <img src="../assets/img/sertifikat.png" alt="">
              </div>
            </splide-slide>
          </splide>
        </div>
      </div>
    </div>
    <div class="filter" style="margin-top: 64px">
      <div class="filimg2">
        <img src="../assets/img/comFil3.png" alt="">
      </div>
      <div class="text data__aos" data-aos="fade-right">
        <span class="hr__span"></span>
        <div class="title__menu">
          МЫ БЕРЕМ НА СЕБЯ ОТВЕТСТВЕННОСТЬ ЗА КАЧЕСТВО
        </div>
        <div class="text__info">
          В случае обнаружения дефектов в продуктах марки FILTRON мы гарантируем не только замену продукта новым, но и
          покрытие трудозатрат у и замену поврежденных деталей. Точные условия гарантии описаны здесь.
        </div>
      </div>
    </div>
        <labaratori/>
        <auto/>
        <padpiska/>
        <foter/>
  </div>
</template>
<script>
import {Splide, SplideSlide} from '@splidejs/vue-splide';
import {createSlides} from "../../utils/slides";
import '../assets/slide/splide.min.css'
import labaratori from '../components/FristPage/labaratori'
import auto from '../components/FristPage/autoscroll'
import padpiska from '../components/FristPage/Patpisatsiya'
import foter from '../components/FristPage/Footer'
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
    labaratori,
    auto,
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

[data-aos=fade-right] {
  transform: translate3d(1000px, 0, 0);
}

[data-aos=fade-left] {
  transform: translate3d(-1000px, 0, 0);
}
@media (max-width: 1700px) {
  .filter2 {
    .filimg1 {
      img {
        margin-right: 40px;
      }
    }

    .text {
      margin-left: 40px;
    }
  }
  .filter {
    .filimg2 {
      img {
        margin-left: 40px;
      }
    }

    .text {
      margin-right: 40px;

      .hr__span {
      }

      title__menu {
      }

      .text__info {
      }
    }
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
  .title__componiya {
    font-size: 24px;
    line-height: 29px;
  }
  .filter2 {
    margin: 40px 0;

    .text {
      margin-right: 10px;

      .hr__span {
        margin-bottom: 20px;
      }

      .title__menu {
        font-size: 17px;
        line-height: 20px;
      }

      .text__info {
        margin-top: 20px;

        ul {
          li {
            font-size: 20px;
            line-height: 130%;
          }
        }
      }
    }

    .filimg1 {
      img {
        width: 400px;
        height: 350px;
      }
    }

  }
  .filter {
    .filimg2 {
      margin-right: 10px;

      img {
        width: 400px;
        height: 350px;
      }
    }

    .text {
      .hr__span {
        margin-bottom: 20px;
      }

      .title__menu {
        font-size: 17px;
        line-height: 20px;
        margin-bottom: 32px;
      }

      .text__info {
        font-size: 12px;
        line-height: 130%;
      }
    }
  }
  .labaratori {
    .labaratori__left {
      max-width: 800px;
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
        font-size: 20px;
        line-height: 130%;
      }

    }

    .slide__filter {
      width: 388px !important;
      .container {
            .splide{
              .splide__arrows{
                button{

                }
              }
              .splide__track{
                ul {
                  li {
                    width: 388px !important;
                    .images{
                      width: 388px !important;
                      img{
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

  .filter2 {
    .text {
      .hr__span {
      }

      .title__menu {
        font-size: 17px;
        line-height: 20px;
      }

      .text__info {
        ul {
          li {
            font-size: 12px;
            line-height: 130%;
          }
        }
      }
    }

    .filimg1 {
      img {
        width: 246px;
        height: 225px;
      }
    }

  }

  .filter {
    .filimg2 {
      img {
        width: 246px;
        height: 225px;
      }
    }

    .text {
      .hr__span {
      }

      title__menu {
        font-size: 17px;
        line-height: 20px;
      }

      .text__info {
        font-size: 12px;
        line-height: 130%;
      }
    }
  }

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
        .splide{
          .splide__arrows{
          }
          .splide__track{
            width: 219px !important;
            height: 291px !important;
            ul {
              li {
                width: 219px !important;
                height: 291px !important;
                .images{
                  width: 219px !important;
                  height: 291px !important;
                  img{
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
  .filter2 {
    padding-left: 16px;
    padding-right: 16px;
    flex-direction: column-reverse;

    .text {
      margin: 0;
    }

    .filimg1 {
      margin-bottom: 20px;

      img {
        margin: 0;
      }
    }
  }
  .filter {
    padding-left: 16px;
    padding-right: 16px;
    flex-direction: column;
    .filimg2 {
      margin-bottom: 20px;

      img {
      }
    }

    .text {
      .hr__span {
      }

      title__menu {
      }

      .text__info {
      }
    }
  }
  .labaratori {
    margin: 40px 0 0 0 ;
    padding: 0  16px;
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
        .splide{
          .splide__arrows{
          }
          .splide__track{
            ul {
              li {
                .images{
                  img{
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