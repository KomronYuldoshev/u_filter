<template>
  <div>
    <div class="sertificat__title">
      Сертификаты
    </div>
    <div class="sertificat__cards">
      <div class="card">
        <img src="../../assets/img/sertificat.png" alt="">
        <div class="sertificat__info">
          Универсальный фильтр абсолютно безопасен!
        </div>
        <div class="sertificat__text">
          Обеспечивает очистку от расплавленного железа, металла, воды и прочего.Он имеет ряд преимуществ перед фильтрами других марок.
        </div>
      </div>
      <div class="card">
        <img src="../../assets/img/sertificat.png" alt="">
        <div class="sertificat__info">
          Универсальный фильтр абсолютно безопасен!
        </div>
        <div class="sertificat__text">
          Обеспечивает очистку от расплавленного железа, металла, воды и прочего.Он имеет ряд преимуществ перед фильтрами других марок.
        </div>
      </div>
      <div class="card">
        <img src="../../assets/img/sertificat.png" alt="">
        <div class="sertificat__info">
          Универсальный фильтр абсолютно безопасен!
        </div>
        <div class="sertificat__text">
          Обеспечивает очистку от расплавленного железа, металла, воды и прочего.Он имеет ряд преимуществ перед фильтрами других марок.
        </div>
      </div>
      <div class="card">
        <img src="../../assets/img/sertificat.png" alt="">
        <div class="sertificat__info">
          Универсальный фильтр абсолютно безопасен!
        </div>
        <div class="sertificat__text">
          Обеспечивает очистку от расплавленного железа, металла, воды и прочего.Он имеет ряд преимуществ перед фильтрами других марок.
        </div>
      </div>
      <div class="card">
        <img src="../../assets/img/sertificat.png" alt="">
        <div class="sertificat__info">
          Универсальный фильтр абсолютно безопасен!
        </div>
        <div class="sertificat__text">
          Обеспечивает очистку от расплавленного железа, металла, воды и прочего.Он имеет ряд преимуществ перед фильтрами других марок.
        </div>
      </div>
      <div class="card">
        <img src="../../assets/img/sertificat.png" alt="">
        <div class="sertificat__info">
          Универсальный фильтр абсолютно безопасен!
        </div>
        <div class="sertificat__text">
          Обеспечивает очистку от расплавленного железа, металла, воды и прочего.Он имеет ряд преимуществ перед фильтрами других марок.
        </div>
      </div>
    </div>
  </div>
</template>
<style lang="scss" scoped>
.sertificat__title{
  margin-top: 258px;
  text-align: center;
  font-size: 48px;
  line-height: 57px;
  color: #282525;
  font-family: 'Marmelad-R';
}
.sertificat__cards{
  width: 100%;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  max-width: 1720px;
  margin: auto;
  margin-top: 56px;
  .card{
    flex-basis: 30%;
    display: flex;
    flex-direction: column;
    margin-top: 64px;
    .sertificat__info{
      font-size: 36px;
      line-height: 43px;
      color: #282525;
      font-family: 'Marmelad-R';
      margin-top: 24px;
      margin-bottom: 12px;
    }
    .sertificat__text{
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
      margin-bottom: 40px;

      &:nth-child(2n-1) {
        margin-right: 24px;
      }
    }
  }
}

@media (max-width: 768px) {
  .sertificat__title {
    margin-top: 110px;
    font-size: 28px;
    line-height: 33px;
  }

  .sertificat__cards {
    margin-bottom: 20px;
    justify-content: center;

    .card {
      margin-bottom: 40px;
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