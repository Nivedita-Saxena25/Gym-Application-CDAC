import React, { useState } from 'react';
import * as S from './style';
import './style.css';
import PasswordInput from '../../components/PassordInputLogin';
import NavBar from '../../components/Navbar';
import Footer from '../../components/Footer';
import { Link } from 'react-router-dom';
import LockIcon from '@mui/icons-material/Lock';
import CakeIcon from '@mui/icons-material/Cake';
import TextField from '@mui/material/TextField';
import Radio from '@mui/material/Radio';
import AccountCircle from '@mui/icons-material/AccountCircle';
import InputAdornment from '@mui/material/InputAdornment';
import FormControlLabel from '@mui/material/FormControlLabel';
import Checkbox from '@mui/material/Checkbox';
import RadioGroup from '@mui/material/RadioGroup';
import EventIcon from '@mui/icons-material/Event';
import LocalHospitalIcon from '@mui/icons-material/LocalHospital';
import { useNavigate } from 'react-router-dom';

export default function Index() {
  document.title = 'Muscle Factory - Sign-up';
  const navigate = useNavigate();

  const [firstName, setFirstName] = useState('');
  const [lastName, setLastName] = useState('');
  const [email, setEmail] = useState('');
  const [gender, setGender] = useState('Male');
  const [age, setAge] = useState('');
  const [password, setPassword] = useState('');
  const [confirmPassword, setConfirmPassword] = useState('');
  const [contactNumber, setContactNumber] = useState('');
  const [address, setAddress] = useState('');
  const [healthRecords, setHealthRecords] = useState('');
  const [termsAccepted, setTermsAccepted] = useState(true);

  const [errors, setErrors] = useState({
    firstName: '',
    lastName: '',
    email: '',
    age: '',
    password: '',
    confirmPassword: '',
    contactNumber: '',
    address: '',
    healthRecords: '',
    termsAccepted: '',
  });

  const validateForm = () => {
    // Basic validation logic
    let isValid = true;
    const newErrors = {
      firstName: '',
      lastName: '',
      email: '',
      age: '',
      password: '',
      confirmPassword: '',
      contactNumber: '',
      address: '',
      healthRecords: '',
      termsAccepted: '',
    };

    // Example validation, you can add more specific validation based on your requirements
    if (!firstName.trim()) {
      newErrors.firstName = 'First Name is required';
      isValid = false;
    }

    if (!lastName.trim()) {
      newErrors.lastName = 'Last Name is required';
      isValid = false;
    }

    if (!email.trim()) {
      newErrors.email = 'Email is required';
      isValid = false;
    } else if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
      newErrors.email = 'Invalid email address';
      isValid = false;
    }

    if (!age.trim()) {
      newErrors.age = 'Age is required';
      isValid = false;
    } else if (isNaN(age) || parseInt(age, 10) <= 0) {
      newErrors.age = 'Invalid age';
      isValid = false;
    }

    if (!password.trim()) {
      newErrors.password = 'Password is required';
      isValid = false;
    } else if (password.length < 8) {
      newErrors.password = 'Password must be at least 8 characters';
      isValid = false;
    }

    if (password !== confirmPassword) {
      newErrors.confirmPassword = 'Passwords do not match';
      isValid = false;
    }

    if (!contactNumber.trim()) {
      newErrors.contactNumber = 'Contact Number is required';
      isValid = false;
    }

    if (!address.trim()) {
      newErrors.address = 'Address is required';
      isValid = false;
    }

    if (!healthRecords.trim()) {
      newErrors.healthRecords = 'Health Records are required';
      isValid = false;
    }

    if (!termsAccepted) {
      newErrors.termsAccepted = 'You must accept the terms';
      isValid = false;
    }

    setErrors(newErrors);
    return isValid;
  };

  const handleRegister = () => {
    if (validateForm()) {
      // Perform registration logic here
      // This will only be called if the form is valid
      navigate('/otpverify');
    }
  };
  window.scrollTo({ top: 0, behavior: 'smooth' });
  return (
    <S.All>
      
      <NavBar />
      <S.Container>
        <S.Signup>
          <h1>
            <center>REGISTER YOURSELF</center>
          </h1>
          <TextField
            margin="dense"
            id="standard-basic"
            classes={{ root: 'inputSignup' }}
            required
            fullWidth
            label="First Name"
            color="error"
            variant="outlined"
            value={firstName}
            onChange={(e) => setFirstName(e.target.value)}
            helperText={errors.firstName}
            error={Boolean(errors.firstName)}
            InputProps={{
              startAdornment: (
                <InputAdornment position="start">
                  <AccountCircle />
                </InputAdornment>
              ),
              style: { color: 'white' }, 
            }}
          />
          <TextField
            classes={{ root: 'inputSignup' }}
            id="standard-basic"
            required
            margin="dense"
            fullWidth
            label="Last Name"
            color="error"
            variant="outlined"
            value={lastName}
            onChange={(e) => setLastName(e.target.value)}
            helperText={errors.lastName}
            error={Boolean(errors.lastName)}
            InputProps={{
              startAdornment: (
                <InputAdornment position="start">
                  <AccountCircle className="Svg" />
                </InputAdornment>
              ),style: { color: 'white' }, 
            }}
          />
          <TextField
            classes={{ root: 'inputSignup' }}
            id="outlined-basic"
            required
            type="email"
            margin="dense"
            fullWidth
            label="Email"
            color="error"
            variant="outlined"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            helperText={errors.email}
            error={Boolean(errors.email)}
            InputProps={{
              startAdornment: (
                <InputAdornment position="start">
                  <AccountCircle />
                </InputAdornment>
              ),style: { color: 'white' }, 
            }}
          />
          <S.Inputs
            row
            aria-labelledby="demo-row-radio-buttons-group-label"
            name="row-radio-buttons-group"
            color="error"
          >
            <RadioGroup
              row
              defaultValue="Male"
              value={gender}
              onChange={(e) => setGender(e.target.value)}
            >
              <FormControlLabel
                classes={{ root: 'inputSignup' }}
                color="error"
                value="Male"
                id="radi"
                control={<Radio />}
                label="Male"
              />
              <FormControlLabel
                classes={{ root: 'inputSignup' }}
                color="error"
                value="Female"
                id="radi"
                control={<Radio />}
                label="Female"
              />
            </RadioGroup>
            <TextField
              margin="dense"
              classes={{ root: 'inputSignup' }}
              id="outlined-basic"
              required
              sx={{ width: 100 }}
              label="Age"
              type="number"
              color="error"
              variant="outlined"
              value={age}
              onChange={(e) => setAge(e.target.value)}
              helperText={errors.age}
              error={Boolean(errors.age)}
              InputProps={{
                startAdornment: (
                  <InputAdornment position="start">
                    <CakeIcon />
                  </InputAdornment>
                ),style: { color: 'white' }, 
              }}
            />
          </S.Inputs>
          <PasswordInput
            password={password}
            confirmPassword={confirmPassword}
            setPassword={setPassword}
            setConfirmPassword={setConfirmPassword}
            errors={errors}
          />
          <TextField
            margin="dense"
            classes={{ root: 'inputSignup' }}
            id="outlined-basic"
            required
            fullWidth
            label="Contact Number"
            color="error"
            variant="outlined"
            value={contactNumber}
            onChange={(e) => setContactNumber(e.target.value)}
            helperText={errors.contactNumber}
            error={Boolean(errors.contactNumber)}
            InputProps={{
              startAdornment: (
                <InputAdornment position="start">{/* You can add an icon for the contact number if needed */}</InputAdornment>
              ),style: { color: 'white' }, 
            }}
          />
          <TextField
            margin="dense"
            classes={{ root: 'inputSignup' }}
            id="outlined-basic"
            required
            fullWidth
            label="Address"
            color="error"
            variant="outlined"
            value={address}
            onChange={(e) => setAddress(e.target.value)}
            helperText={errors.address}
            error={Boolean(errors.address)}
            InputProps={{
              startAdornment: (
                <InputAdornment position="start">{/* You can add an icon for the address if needed */}</InputAdornment>
              ),style: { color: 'white' }, 
            }}
          />
          <TextField
            margin="dense"
            classes={{ root: 'inputSignup' }}
            id="outlined-basic"
            required
            fullWidth
            label="Health Records"
            color="error"
            variant="outlined"
            value={healthRecords}
            onChange={(e) => setHealthRecords(e.target.value)}
            helperText={errors.healthRecords}
            error={Boolean(errors.healthRecords)}
            InputProps={{
              startAdornment: (
                <InputAdornment position="start">
                  <LocalHospitalIcon />
                </InputAdornment>
              ),style: { color: 'white' }, 
            }}
          />
          <FormControlLabel
            classes={{ root: 'inputSignup' }}
            required
            id="check"
            control={<Checkbox checked={termsAccepted} onChange={() => setTermsAccepted(!termsAccepted)} />}
            label={`I have read and accept the terms of use`}
            error={Boolean(errors.termsAccepted)}
          />
          <S.ButtonEntrar onClick={handleRegister}>Register</S.ButtonEntrar>
        </S.Signup>
        <S.ButtonSignin>
          <Link to="/login">Login</Link>
        </S.ButtonSignin>
      </S.Container>
      <Footer />
    </S.All>
  );
}
