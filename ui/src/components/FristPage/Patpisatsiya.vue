<template>
  <div class="patpisatsiya">
    <div class="title">
      Подписаться на нас
    </div>
    <div class="div">
      <div class="top">
        <img src="../../assets/img/top_img.svg" alt="">
        <div class="text">
          ПОДПИШИТЕСЬ НА ИНФОРМАЦИОННЫЙ БЮЛЛЕТЕНЬ
        </div>
      </div>
      <div class="mid">
        <div class="mid1">
          <img src="../../assets/img/pticka.svg" alt="">
          <div class="text">
            Самая свежая информация о продуктах
          </div>
        </div>
        <div class="mid1">
          <img src="../../assets/img/pticka.svg" alt="">
          <div class="text">
            Самая свежая информация о продуктах
          </div>
        </div>
      </div>
      <button>
        Подписаться
      </button>

    </div>
    <div class="allphone">
      <div class="tel1">
        <img src="../../assets/img/call.svg" alt="">
        <div class="callnumber">
          (+998 95) 607 54 00
        </div>
      </div>
      <div class="tel1">
        <img src="../../assets/img/call.svg" alt="">
        <div class="callnumber">
          (+998 91) 331 00 47
        </div>
      </div>
      <div class="tel1">
        <img src="../../assets/img/sms-star.svg" alt="">
        <div class="callnumber">
          ifa-65@mail.ru
        </div>
      </div>
    </div>
    <div class="allphone">
      <div class="tel1">
        <img src="../../assets/img/call.svg" alt="">
        <div class="callnumber">
          (+998 90) 717 54 54
        </div>
      </div>
      <div class="tel1">
        <img src="../../assets/img/location.svg" alt="">
        <div class="callnumber">
          Адрес: Узбекистан, г.Навои
        </div>
      </div>
      <div class="tel2">
        <img src="../../assets/img/instagram.svg" alt="">
        <img src="../../assets/img/facebook.svg" alt="">
        <img src="../../assets/img/telegram.svg" alt="">
      </div>
    </div>
    <br>
    <br>
    <br>
  </div>
</template>

<script>
export default {
  name: "Patpisatsiya"
}
</script>

<style scoped lang="scss">
.patpisatsiya{
  width: 1720px;
  margin: auto;
  .title{
    font-size: 48px;
    line-height: 57px;
    color: #282525;
    margin-bottom: 92px;
    width: 1720px;


  }
  .div{
    display: flex;
    align-items: center;
    justify-content: space-between;
    width: 1630px;
    margin: auto;
    height: 220px;
    background: #F7F7F7;
    margin-bottom: 120px;

    .top {
      display: flex;
      justify-content: space-between;
      align-items: center;
      .text{
        font-size: 28px;
        line-height: 34px;
        color: #282525;
        width: 469px;
        margin-left: 46px;
      }
    }
    .mid{
      .mid1{
        display: flex;
        justify-content: space-between;
        align-items: center;
        margin-bottom: 24px;
        .text{
          font-size: 18px;
          line-height: 22px;
          color: #282525;

        }
      }
    }
    button{
      display: flex;
      align-items: center;
      justify-content: center;
      justify-items: center;
      font-weight: 600;
      font-size: 24px;
      line-height: 29px;
      width: 309px;
      height: 87px;
      background: linear-gradient(180deg, #2FA1F3 3.7%, #1179BF 100%);
      box-shadow: 0px 4px 0px #0C60A5;
      border-radius: 8px;

      color: #FFFFFF;
    }
  }
  .allphone{
    margin-bottom: 46px;
    display: flex;
    align-items: center;
    justify-content: space-between;
    padding: 0 100px 0 100px;

    .tel1{
      display: flex;
      align-items: center;
      img{
        margin-right: 32px;
      }

    }

    .tel2{
      display: flex;
      align-items: center;
      img{
        margin-left: 32px;
      }

    }

  }
}
</style>