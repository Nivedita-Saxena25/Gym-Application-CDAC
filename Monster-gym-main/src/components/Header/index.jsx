import React from "react";
import * as S from "./style";
import LogoMaster from "../../assets/logo_muscle.png";
import Carousel from 'react-bootstrap/Carousel';
import 'bootstrap/dist/css/bootstrap.min.css';
import bg1Image from '../../assets/bg1.jpg';
import bg2Image from '../../assets/bg2.jpg';

const ExampleCarouselImage = ({ image, text }) => {
  const selectedImage = image === 'bg1' ? bg1Image : bg2Image;

  return (
    <div style={{ position: 'relative', width: '100%', height: '100%' }}>
      <img
        src={selectedImage}
        alt={`Carousel Image ${text}`}
        style={{ width: '100%', height: '100%', objectFit: 'cover' }}
      />
      <div
        style={{
          position: 'absolute',
          top: '50%',
          left: '50%',
          transform: 'translate(-50%, -50%)',
          color: 'white',
          textAlign: 'center',
        }}
      >
        <h2>{text}</h2>
      </div>
    </div>
  );
};

export default function index() {
  return (
    <S.Container>
      <Carousel fade style={{ width: '100%', margin: '0' }}>
        <Carousel.Item>
          <ExampleCarouselImage image="bg1" />
        </Carousel.Item>
        <Carousel.Item>
          <ExampleCarouselImage image="bg2" />
        </Carousel.Item>
      </Carousel>
      <S.ContainerInfo>
        <img src={LogoMaster} alt="logo" />
        <h1>
          Set free the <span>Monster</span> within you
        </h1>
      </S.ContainerInfo>
      <S.Grad></S.Grad>
    </S.Container>
  );
}
