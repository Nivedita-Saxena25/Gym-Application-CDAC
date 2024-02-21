import React from "react";
import * as S from "./style";
import LogoMaster from "../../assets/logo_muscle.png";
import Carousel from 'react-bootstrap/Carousel';
import 'bootstrap/dist/css/bootstrap.min.css';
import bgImage from '../../assets/bg.jpg';
import bg1Image from '../../assets/bg1.jpg';
import bg2Image from '../../assets/bg2.jpg';
import bg3Image from '../../assets/bg3.jpg';


// import React from 'react';
// import { Carousel } from 'react-bootstrap';

// import image1 from './../../../image/1.jpg';
// import image2 from './../../../image/2.jpg';

const CarouselContainer = () => {
  return (
    <Carousel fade={true} pause={false}>
      <Carousel.Item interval={2000}>
        <img
          className="d-block w-100"
          src={bgImage}
          alt="First slide"
          // style={{height: "80%"}}
        />
        <Carousel.Caption>
        <h2>Set free Moster Within You</h2>
          {/* <h3>First slide label</h3>
          <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p> */}
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item interval={2000}>
        <img
          className="d-block w-100"
          src={bg1Image}
          alt="Third slide"
          // style={{height: "80%"}}
        />
        <Carousel.Caption>
        <h2>Set free Moster Within You</h2>
          {/* <h3>Second slide label</h3>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p> */}
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item interval={2000}>
        <img
          className="d-block w-100"
          src={bg2Image}
          alt="Third slide"
          // style={{height: "80%"}}
        />
        <Carousel.Caption>
        <h2>Set free Moster Within You</h2>
          {/* <h3>Third slide label</h3>
          <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p> */}
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item interval={2000}>
        <img
          className="d-block w-100"
          src={bg3Image}
          alt="Fourth slide"
          // style={{height: "100%"}}
        />
        <Carousel.Caption>
        <h2>Set free Moster Within You</h2>
          {/* <h3>Fourth slide label</h3>
          <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p> */}
        </Carousel.Caption>
      </Carousel.Item>
    </Carousel>
  )
}

export default CarouselContainer;
