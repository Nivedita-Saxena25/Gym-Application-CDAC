// index.jsx
import React from 'react';
import * as S from './style';
import './style.css';
import Image from '../../assets/Mobile login.svg';
import PasswordInput from '../../components/PassordInputLogin';
import { Link } from 'react-router-dom';
import NavBar from '../../components/Navbar';
import Footer from '../../components/Footer';

import TextField from '@mui/material/TextField';
import AccountCircle from '@mui/icons-material/AccountCircle';
import InputAdornment from '@mui/material/InputAdornment';

export default function Index() {
  document.title = 'Muscle Factory - Sign in';

  return (
    <S.All>
      <NavBar />
      <S.Container>
        <img src={Image} alt='img_ilustration' />
        <S.CountArea>
          <S.ButtonSignup>
            <Link to='/signup'>REGISTER HERE!!</Link>
          </S.ButtonSignup>
          <S.Login>
            <h1><center>LOGIN</center></h1>
            <TextField
              classes={{ root: 'inputEmail' }}
              id='outlined-basic'
              required
              type='email'
              margin='dense'
              fullWidth
              label='Email'
              color='error'
              variant='outlined'
              InputProps={{
                startAdornment: (
                  <InputAdornment position='start'>
                    <AccountCircle />
                  </InputAdornment>
                ),
                style: { color: 'white' }, // Set text color to white
              }}
            />
            <PasswordInput
              inputProps={{
                style: { color: 'white' }, // Set text color to white
              }}
            />
            <S.Forgot>Forgot your password?</S.Forgot>
            <S.ButtonEntrar>Login Here</S.ButtonEntrar>
          </S.Login>
        </S.CountArea>
      </S.Container>
      <Footer />
    </S.All>
  );
}
