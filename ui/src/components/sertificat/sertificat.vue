<template>
  <div>
    <div class="sertificat__title">
      Сертификаты
    </div>
    <div class="sertificat__cards">
      <div v-for="card in cards" class="card" :key="card.in">
        <img :src="card.img" alt="">
        <div class="sertificat__info">
          {{ card.title }}
        </div>
        <div class="sertificat__text">
          {{ card.subtitle }}
        </div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      cards: [
        {
          img: require('../../assets/img/sertificat.png'),
          title: ' Универсальный фильтр абсолютно безопасен!',
          subtitle: 'Обеспечивает очистку от расплавленного железа, металла, воды и прочего.Он имеет ряд преимуществ перед фильтрами других марок.'
        }, {
          img: require('../../assets/img/sertificat.png'),
          title: ' Универсальный фильтр абсолютно безопасен!',
          subtitle: 'Обеспечивает очистку от расплавленного железа, металла, воды и прочего.Он имеет ряд преимуществ перед фильтрами других марок.'
        }, {
          img: require('../../assets/img/sertificat.png'),
          title: ' Универсальный фильтр абсолютно безопасен!',
          subtitle: 'Обеспечивает очистку от расплавленного железа, металла, воды и прочего.Он имеет ряд преимуществ перед фильтрами других марок.'
        }, {
          img: require('../../assets/img/sertificat.png'),
          title: ' Универсальный фильтр абсолютно безопасен!',
          subtitle: 'Обеспечивает очистку от расплавленного железа, металла, воды и прочего.Он имеет ряд преимуществ перед фильтрами других марок.'
        }, {
          img: require('../../assets/img/sertificat.png'),
          title: ' Универсальный фильтр абсолютно безопасен!',
          subtitle: 'Обеспечивает очистку от расплавленного железа, металла, воды и прочего.Он имеет ряд преимуществ перед фильтрами других марок.'
        }, {
          img: require('../../assets/img/sertificat.png'),
          title: ' Универсальный фильтр абсолютно безопасен!',
          subtitle: 'Обеспечивает очистку от расплавленного железа, металла, воды и прочего.Он имеет ряд преимуществ перед фильтрами других марок.'
        }
      ]
    }
  }
}

</script>

<style lang="scss" scoped>
.sertificat__title {
  margin-top: 251px;
  text-align: center;
  font-size: 48px;
  line-height: 57px;
  color: #282525;
  font-family: 'Marmelad-R';
}

.sertificat__cards {
  width: 100%;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  padding: 0 100px;
  margin: 120px 0 56px 0;

  .card {
    display: flex;
    flex-direction: column;
    align-items: center;
    margin: 0 24px 64px 0;
    max-width: 512px;
 img{
   width: 512px;
   height: 680px;
 }
    .sertificat__info {
      font-size: 36px;
      line-height: 43px;
      color: #282525;
      font-family: 'Marmelad-R';
      margin-top: 24px;
      margin-bottom: 12px;
    }

    .sertificat__text {
      font-size: 24px;
      line-height: 130%;
      color: #4F4F4F;
      font-family: 'Lato-Light';
    }
  }
}

@media (max-width: 1850px) {
  .sertificat__cards {
    justify-content: space-around;
  }
}

@media (max-width: 1350px) {
  .sertificat__cards {
    justify-content: space-between;
    padding: 0 40px;

    .card {
      max-width: 332px;

      img {
        width: 332px;
        height: 441px;
      }

      .sertificat__info {
        margin: 20px 0 12px 0;
        font-size: 17px;
        line-height: 20px;
      }

      .sertificat__text {
        font-size: 12px;
        line-height: 130%;
      }
    }
  }
}

@media (max-width: 1150px) {
  .sertificat__cards {
    justify-content: space-around;
  }
}

@media (max-width: 900px) {
  .sertificat__cards {
    justify-content: space-between;
    margin: 40px 0 36px 0;

    .card {
      margin: 0;
      margin-bottom: 24px;

      &:nth-child(2n-1) {
        margin-right: 24px;
      }
    }
  }
}

@media (max-width: 768px) {
  .sertificat__title {
    margin-top: 96px;
    font-size: 28px;
    line-height: 33px;
  }

  .sertificat__cards {
    margin-bottom: 20px;
    justify-content: center;

    .card {
      margin-bottom: 20px;
    }
  }
}

@media(max-width: 767px) {
  .sertificat__cards {
    padding: 0 14px;

    .card {
      margin-right: 0 !important;
    }
  }
}

</style>
