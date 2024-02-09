// index.jsx

import React from "react";
import styled from 'styled-components';
import Carousel from 'react-bootstrap/Carousel';
import 'bootstrap/dist/css/bootstrap.min.css';
import indoor from "../../assets/icon modalidades/indoor.jpg";
import zumba from "../../assets/icon modalidades/zumba.jpg";
import karate from "../../assets/icon modalidades/karate.jpg";
import weightlift from "../../assets/icon modalidades/weightlift.jpg";
import yoga from "../../assets/icon modalidades/yoga.jpg";
import judo from "../../assets/icon modalidades/Judo.jpg";

const Container = styled.div`
  position: relative;
  width: 100%;
`;

const ServicesSection = styled.div`
  position: absolute;
  top: 10%; /* Adjust as needed */
  left: 50%;
  transform: translate(-50%, -50%);
  color: white;
  text-align: center;
  width: 100%;
`;

const Heading = styled.h2`
  font-size: 3em;
  font-weight: bold;
`;

const SubHeading = styled.p`
  font-size: 1.5em;
  color: white;
`;

const Grad = styled.div`
  // Your styles for Grad component
`;

const ModalidadeItem = styled.div`
  // Your styles for ModalidadeItem component
`;

const ModalidadesFlex = styled.div`
  display: flex;
  justify-content: space-evenly;
  align-items: center;
  width: 100%;
  margin-top: 90px; /* Adjust as needed */
`;

const ActivityCard = ({ image, text }) => {
  return (
    <div className="card" style={{ width: '18rem', margin: '0 10px' }}>
      <img src={image} className="card-img-top" alt={text} />
      <div className="card-body">
        <h5 className="card-title" style={{ color: 'black' }}>{text}</h5>
        <p className="card-text" style={{ color: 'red' }}>Some quick example text to build on the card title and make up the bulk of the card's content.</p>
      </div>
    </div>
  );
};

export default function ActivitiesCarousel() {
  return (
    <Container>
      <ServicesSection>
        <Heading>Our Services</Heading>
      </ServicesSection>
      <Carousel fade>
        <Carousel.Item>
          <ModalidadesFlex>
            <ActivityCard image={indoor} text="Indoor cycling" />
            <ActivityCard image={zumba} text="Dance fitness" />
            <ActivityCard image={karate} text="Karate" />
          </ModalidadesFlex>
        </Carousel.Item>
        <Carousel.Item>
          <ModalidadesFlex>
            <ActivityCard image={judo} text="Judo" />
            <ActivityCard image={yoga} text="Yoga" />
            <ActivityCard image={weightlift} text="Weightlifting" />
          </ModalidadesFlex>
        </Carousel.Item>
      </Carousel>
    
      <Grad></Grad>
    </Container>
  );
}
