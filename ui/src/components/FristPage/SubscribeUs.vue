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

        a {
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
  .subscribe_us {
    padding: 0 40px;

    .subscribe_block {
      .sub_info {
        flex-direction: column;

        .sub {
          margin-bottom: 23px;
        }
      }
    }
  }

}

@media (max-width: 1350px) {

  .subscribe_us {
    h1 {
      font-size: 28px;
      line-height: 33px;
      margin-bottom: 30px;
    }

    .subscribe_block {
      padding: 20px 50px 12px 30px;

      .sub_info {
        flex-direction: column;

        .sub {
          margin-bottom: 20px;
          margin-right: 0;

          a {
            img {
              width: 50px;
              height: 50px;
              margin-right: 10px;
            }
          }

          p {
            font-size: 18px;
            width: auto;
            line-height: 22px;
          }
        }

        .adding {
          p {
            font-size: 12px;
            line-height: 130%;
          }
        }
      }

      button {
        width: 189px;
        padding: 15px 0;
        font-size: 16px;
        line-height: 19px;

      }
    }

    .info_part {
      margin: 40px 0 60px 0;
      padding: 0 16px;

      .part {
        .number {
          a {
            &:nth-child(2) {
              margin-left: 16px;
            }

            &:nth-child(3) {
              margin-left: 16px;
            }

            img {
              width: 25px;
              height: 25px;

            }
          }

          p {
            margin-left: 10px;
            font-size: 12px;
            line-height: 14px;
          }
        }
      }

    }
  }

}

@media (max-width: 750px) {
  .subscribe_us {
    padding: 0;

    h1 {
      padding-left: 16px;
      margin-bottom: 23px;
    }

    .subscribe_block {
      padding: 10px 16px 20px 16px;
      flex-direction: column;
      align-items: start;

      .sub_info {
        margin-bottom: 46px;

        .sub {
          margin-bottom: 24px;

          a {
            img {

            }
          }

          p {
          }
        }

        .adding {
          p {

          }
        }
      }

      button {


      }
    }

    .info_part {

    }
  }
}

@media (max-width: 500px) {

  .subscribe_us {
    .info_part {
      flex-direction: column;
      align-items: start;
      margin: 24px 0 60px 0;
      .part {
        &:nth-child(3){
          .number {
            &:nth-child(2){
              margin-bottom: 0;
            }
          }
        }
        .number {
          margin-bottom: 24px;
          &:nth-child(1){
            margin-bottom: 24px;
          }
          a {
            &:nth-child(2) {
            }

            &:nth-child(3) {
            }

            img {
              width: 25px;
              height: 25px;

            }
          }

          p {
          }
        }
      }

    }
  }

}

</style>