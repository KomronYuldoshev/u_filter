<template>
  <div class="subscribe_us">
    <h1>
      Подписаться на нас
    </h1>
    <div class="subscribe_block">
      <div class="sub_info">
        <div class="sub">
          <a href=""><img src="../../assets/img/sub_img.svg" alt=""></a>
          <p>Подпишитесь на информационный бюллетень</p>
        </div>
        <div class="adding">
          <p>Самая свежая информация о продуктах</p>
          <p>Доступ к уникальному содержанию</p>
        </div>
      </div>
      <button>Подписаться</button>
    </div>
    <div class="info_part">
      <div class="part">
        <div class="number">
          <a href=""> <img src="../../assets/img/number.svg" alt=""></a>
          <p>(+998 95) 607 54 00</p>
        </div>
        <div class="number">
          <a href=""><img src="../../assets/img/number.svg" alt=""></a>
          <p>(+998 90) 717 54 54</p>
        </div>

      </div>
      <div class="part">
        <div class="number">
          <a href=""><img src="../../assets/img/number.svg" alt=""></a>
          <p>(+998 91) 331 00 47</p>
        </div>
        <div class="number">
          <a href=""> <img src="../../assets/img/location.svg" alt=""></a>
          <p>Адрес: Узбекистан, г.Навои</p>
        </div>
      </div>
      <div class="part">
        <div class="number">
          <a href=""> <img src="../../assets/img/email.svg" alt=""></a>
          <p>ifa-65@mail.ru</p>
        </div>
        <div class="number">
          <a href=""> <img src="../../assets/img/instagram.svg" alt=""> </a>
          <a href=""> <img src="../../assets/img/facebook.svg" alt=""></a>
          <a href=""><img src="../../assets/img/telegram.svg" alt=""></a>
        </div>

      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "subscribe"
}
</script>

<style scoped lang="scss">

.subscribe_us {
  padding: 0 100px;

  h1 {
    margin-bottom: 92px;
    font-family: 'Marmelad-R';
    font-style: normal;
    font-weight: 400;
    font-size: 48px;
    line-height: 57px;
    color: #282525;
  }

  .subscribe_block {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 60px 46px;
    background: #F7F7F7;

    .sub_info {
      display: flex;

      .sub {
        display: flex;
        align-items: center;
        margin-right: 116px;

        img {
          margin-right: 46px;
        }

        p {
          font-family: 'Lato-Regular';
          font-style: normal;
          font-weight: 400;
          font-size: 28px;
          line-height: 34px;
          color: #282525;
          width: 469px;
        }
      }

      .adding {
        display: flex;
        flex-direction: column;
        align-items: start;
        justify-content: center;
        padding-left: 34px;

        p {
          font-family: 'Lato-Regular';
          font-style: normal;
          font-weight: 400;
          font-size: 18px;
          line-height: 22px;
          color: #282525;
          position: relative;
          white-space: nowrap;

          &:nth-child(1) {
            margin-bottom: 24px;
          }

          &:before {
            background-image: url("../../assets/img/info_tick.svg");
            position: absolute;
            left: -34px;
            content: '';
            height: 22px;
            width: 22px;
          }
        }
      }
    }

    button {
      font-family: 'Lato-Regular';
      font-style: normal;
      font-weight: 600;
      font-size: 24px;
      line-height: 29px;
      text-align: center;
      width: 309px;
      padding: 29px 0;
      color: #FFFFFF;
      background: linear-gradient(180deg, #2FA1F3 3.7%, #1179BF 100%);
      box-shadow: 0 4px 0 #0C60A5;
      border-radius: 8px;

    }
  }

  .info_part {
    margin: 120px 0;
    display: flex;
    justify-content: space-between;
    align-items: center;

    .part {
      display: flex;
      flex-direction: column;
      align-items: start;
      justify-content: center;

      .number {
        display: flex;
        align-items: center;

        &:nth-child(1) {
          margin-bottom: 46px;
        }

        img {
          &:nth-child(2) {
            margin-left: 46px;
          }

          &:nth-child(3) {
            margin-left: 46px;
          }
        }

        p {
          margin-left: 32px;
          font-family: 'Lato-Regular';
          font-style: normal;
          font-weight: 400;
          font-size: 24px;
          line-height: 29px;
          color: #303439;
        }
      }
    }
  }
}

@media (max-width: 1700px) {
  .subscribe_block {
    .sub_info {
      flex-direction: column;

      .sub {
        margin-bottom: 23px;
      }
    }
  }
}

@media (max-width: 1350px) {
  .subscribe_block {
    .sub_info {
      flex-direction: column;

      .sub {
        margin-bottom: 23px;
      }
    }
  }
}

</style>