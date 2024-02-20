import * as S from './style'
import './style.css'
import Image from '../../assets/Mobile login.svg'
import PasswordInput from '../../components/PassordInputLogin'
import { Link } from 'react-router-dom'
import NavBar from '../../components/Navbar'
import Footer from '../../components/Footer'

import TextField from '@mui/material/TextField';
import AccountCircle from '@mui/icons-material/AccountCircle';
import InputAdornment from '@mui/material/InputAdornment';
import {
    MDBBtn,
    MDBContainer,
    MDBRow,
    MDBCol,
    MDBIcon,
    MDBInput
  }
  from 'mdb-react-ui-kit';

  function App() {
    return (
        <S.All>
        <NavBar />
      <MDBContainer fluid >
        <MDBRow>
  
          <MDBCol sm='6'>
            {/*
            <div className='d-flex flex-row ps-5 pt-5'>
              <MDBIcon fas icon="crow fa-3x me-3" style={{ color: '#709085' }}/>
              <span className="h1 fw-bold mb-0">MuscleFactory</span>
            </div>
            */}
            <div className='d-flex flex-column justify-content-center h-custom-2 w-75 pt-4' style={{marginLeft:"61%"}}>
  
              <h3 className="fw-normal mb-3 ps-5 pb-3" style={{letterSpacing: '1px'}}>Log in</h3>
  
              <MDBInput wrapperClass='mb-4 mx-5 w-100' label='Email address' id='formControlLg' type='email' size="lg"/>
              <MDBInput wrapperClass='mb-4 mx-5 w-100' label='Password' id='formControlLg' type='password' size="lg"/>
  
              <MDBBtn className="mb-4 px-5 mx-5 w-100" color='info' size='lg'>Login</MDBBtn>
              <p className="small mb-5 pb-lg-3 ms-5"><a class="text-muted" href="#!">Forgot password?</a></p>
              <p className='ms-5'>Don't have an account? <a href="/cadastro" class="link-info">Register here</a></p>
  
            </div>
  
          </MDBCol>
        </MDBRow>
      </MDBContainer>
      <Footer />
      </S.All>
    );
  }
  
  export default App;

/*export default function index() {
    document.title = 'Monster gym - Entrar'
  return (
    <S.All>
        <NavBar />
        <S.Container>
            <img src={Image} alt='img_ilustration'/>
            <S.CountArea>
                    <S.ButtonSignup><Link to='/cadastro'>Cadastre-se</Link></S.ButtonSignup>
                <S.Login>
                    <h1>Entrar</h1>
                    <TextField classes={{root: "inputEmail"}} id="outlined-basic" required type='email' margin="dense" fullWidth label="Email" color="error" variant="outlined"
                        InputProps={{ startAdornment: (
                        <InputAdornment position="start">
                            <AccountCircle />
                        </InputAdornment>
                        )}}
                    />
                    <PasswordInput />
                    <S.Forgot>Esqueceu da senha?</S.Forgot>
                    <S.ButtonEntrar>Entrar</S.ButtonEntrar>
                    <S.SocialArea>
                        <S.Facebook><img alt='facebook icon' src='https://cdn-icons-png.flaticon.com/512/145/145802.png'/>Entrar com Facebook</S.Facebook>
                        <S.Twitter><img alt='twitter icon' src='https://cdn-icons-png.flaticon.com/512/145/145812.png'/>Entrar com Twitter</S.Twitter>
                    </S.SocialArea>
                </S.Login>
            </S.CountArea>
        </S.Container>
        <Footer />
    </S.All>
  )
}*/
