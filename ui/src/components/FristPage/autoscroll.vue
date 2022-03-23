<template>
  <div>
    <div class="title__text">
      нАШИ ПАРТНЕРЫ
    </div>
    <div class="marquee">
      <div class="marquee--inner">
        <span>
          <img src="../../assets/img/s1.svg" alt="" class="orb">
          <img src="../../assets/img/s2.svg" alt="" class="orb">
          <img src="../../assets/img/s3.svg" alt="" class="orb">
          <img src="../../assets/img/s4.svg" alt="" class="orb">
          <img src="../../assets/img/s5.svg" alt="" class="orb">
        </span>
        <span>
          <img src="../../assets/img/s1.svg" alt="" class="orb">
          <img src="../../assets/img/s2.svg" alt="" class="orb">
          <img src="../../assets/img/s3.svg" alt="" class="orb">
          <img src="../../assets/img/s4.svg" alt="" class="orb">
          <img src="../../assets/img/s5.svg" alt="" class="orb">
        </span>
      </div>
    </div>
  </div>
</template>
<style scoped lang="scss">
.title__text {
  font-size: 48px;
  line-height: 57px;
  text-transform: uppercase;
  color: #282525;
  font-family: 'Marmelad-R';
  padding-left: 100px;
  margin: 120px 0 92px 0;
}

.orb {
  display: inline-block;
  margin: 0 46px;
  float: left;
  transition: all .2s ease-out;
}

.orb:hover {
  transform: scale(1.2);
  cursor: pointer;
}

span {
  display: flex;
}

.red {
  background: red;
}

.yellow {
  background: yellow;
}

.blue {
  background: blue;
}

.orange {
  background: orange;
}

.purple {
  background: purple;
}

.green {
  background: green;
}

.marquee {
  height: 200px;
  border: 2px solid #eee;
  overflow: hidden;
  box-sizing: border-box;
  position: relative;
  margin-bottom: 120px;
}

.marquee--inner {
  display: block;
  width: 200%;
  margin: 70px 0;
  position: absolute;
  animation: marquee 20s linear infinite;
}

.marquee--inner:hover {
  animation-play-state: paused;
}

/*.half {
  float: left;
  width: 10%;
}*/

span {
  float: left;
  width: 46%;
}

@keyframes marquee {
  0% {
    left: 0;
  }
  100% {
    left: -100%;
  }
}

@media (max-width: 1250px) {
  .title__text {
    margin: 60px 0 40px 0;
    font-size: 28px;
    line-height: 33px;
    padding-left: 40px;
  }
  .marquee {
    margin-bottom: 60px;
    height: 100px;

    .marquee--inner {
      margin: 30px 0;

      span {
        img {
          width: 120px;
          height: 25px;
        }
      }
    }
  }
}
</style>