<template>
  <div class="left__menu--main">
    <ul>
      <li>
        <router-link
                to="/product/a"
            >
          Воздушные фильтры
            </router-link>
        <span></span>
      </li>
      <li>
        <router-link
                to="/product/b"
            >
          Cалонный фильтры
            </router-link>
        <span></span>
      </li>
      <li>
        <router-link
                to="/product/c"
            >
          Масляные фильтры
            </router-link>
        <span></span>
      </li>
      <li>
        <router-link
                to="/product/d"
            >
          Топливные фильтры
            </router-link>
        <span></span>
      </li>
      <li>
        <router-link
                to="/product/e"
            >
          Другие
            </router-link>
        <span></span>
      </li>
    </ul>
  </div>
</template>

<style lang="scss" scoped>
.left__menu--main{
  //width: 30%;
  position: fixed;
  ul{
    width: 423px;
    li{
      margin-bottom: 26px;
      position: relative;
      &:first-child{
        margin-top: 64px;
      }
      a{
        font-size: 24px;
        line-height: 29px;
        letter-spacing: 0.125em;
        text-transform: capitalize;
        color: #000000;
        position: absolute;
        left: 0;
        right: 0;
        width: 100%;
        display: flex;
        top: 0;
        bottom: 0;
        align-items: center;
        padding-left: 15px;
        transition: all ease 1s;
        &:hover{
          &{
            color: white;
            transition: all ease 1s;
          }
          &~span{
            width: 100%;
            transition: all ease 1s;
          }
        }
        &.router-link-exact-active{
          color: white;
          &~span{
            width: 100%;
          }
        }
      }
      span{
        width: 0;
        height: 20px;
        background: var(--blue);
        display: block;
        padding: 30px 0px;
        border-radius: 8px;
        transition: all ease 1s;
      }
    }
  }
}
@media (max-width: 700px) {
  .left__menu--main{
    left: -1000px;
  }
}
</style>