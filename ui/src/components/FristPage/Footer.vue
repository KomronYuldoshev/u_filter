<template>
  <div class="footer">
    <div class="title">О компании</div>
    <div class="subtitle">
      Вот уже семь лет наша компания производит продукцию международного стандарта ISO 9001 и осуществляет поставку
      своей готовой продукции на внутренний и на внешний рынок.
    </div>
    <div class="bottom_footer">
      <div class="org">
        © OOO "Universal Filter" - Ваш надежный партнер!
      </div>
      <a href="https://radium.uz/" target="_blank">
        <img src="../../assets/img/radium.png" alt=""/>
      </a>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Footer',
  data() {
    return {}
  }
}
</script>

<style scoped lang="scss">
#app {
  display: none;
}

.footer {
  width: auto;
  padding: 214px 100px 92px 100px;
  background-image: url("../../assets/img/footer.svg");
  background-size: cover;
  background-repeat: no-repeat;

  .title {
    font-family: 'Marmelad-R';
    font-style: normal;
    font-weight: 400;
    font-size: 48px !important;
    line-height: 57px;
    text-align: center;
    color: #FFFFFF;
    margin-bottom: 32px;
  }

  .subtitle {
    font-family: 'Lato-Regular';
    font-style: normal;
    font-weight: 400;
    font-size: 24px;
    line-height: 29px;
    text-align: center;
    color: #ffffff;
    margin: auto auto 228px auto;
  }

  .bottom_footer {
    display: flex;
    align-items: center;
    justify-content: space-between;

    .org {
      font-family: 'Lato-Regular';
      font-style: normal;
      font-weight: 400;
      font-size: 18px;
      line-height: 22px;
      color: #FFFFFF;
    }
  }
}
</style>
<!--====================================================@Media===============================================-->
<style scoped lang="scss">
@media screen and (max-width: 800px) {
  .footer {
    padding: 60px 40px 40px 40px;
    //height: 369px;

    .title {
      font-size: 24px;
      line-height: 29px;
      text-align: center;
      color: #ffffff;
      font-weight: 600;
      margin-bottom: 12px;
    }

    .subtitle {
      max-width: 623px;
      font-size: 16px;
      line-height: 150%;
      text-align: center;
      color: #ffffff;
      margin: auto;
      margin-bottom: 140px;
    }

    .bottom_footer {
      width: auto;

      .org {
        font-size: 12px;
        line-height: 14px;
        color: #ffffff;
      }

      a {
        img {
          width: 98px;
        }
      }
    }
  }
}

@media (max-width: 768px) {
  .footer {

    .title {
      font-size: 28px !important;
      line-height: 33px !important;
      margin-bottom: 24px;
    }

    .subtitle {
      font-size: 14px;
      line-height: 17px;
      margin-bottom: 120px;
    }

    .bottom_footer {


      .org {

      }

      a {
        img {

        }
      }
    }
  }
}

@media (max-width: 450px) {
  .footer {
    margin-top: 400px;
    padding: 60px 16px 24px 16px !important;

    .subtitle {
      margin-bottom: 161px;
      font-size: 12px;
      line-height: 14px;
    }

    .bottom_footer {
      flex-direction: column-reverse;

      a {
        margin-bottom: 24px;
      }

      .org {
        white-space: nowrap;
      }
    }
  }
}
</style>
