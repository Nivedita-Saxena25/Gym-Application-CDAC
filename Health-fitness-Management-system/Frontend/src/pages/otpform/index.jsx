// OtpVerificationForm.js
import React, { useState } from 'react';
import * as S from './style'; // Assuming you have the same style file
import TextField from '@mui/material/TextField';
import InputAdornment from '@mui/material/InputAdornment';

export default function OtpVerificationForm() {
  const [otp, setOtp] = useState('');

  const handleVerifyOTP = () => {
    // Perform OTP verification logic here
    // You may need to make API calls to verify the OTP
    // For simplicity, let's assume OTP is valid
    alert('OTP verified successfully!');
  };

  return (
    <S.Signup>
      <h1>
        <center>VERIFY EMAIL</center>
      </h1>
      <TextField
        margin="dense"
        id="outlined-basic"
        required
        fullWidth
        label="Enter OTP"
        color="error"
        variant="outlined"
        value={otp}
        onChange={(e) => setOtp(e.target.value)}
        InputProps={{
          startAdornment: (
            <InputAdornment position="start">
              {/* You can add an icon for the OTP if needed */}
            </InputAdornment>
          ),
          style: { color: 'white' },
        }}
        classes={{ root: 'inputSignup' }}
      />
      <S.ButtonEntrar onClick={handleVerifyOTP}>Verify OTP</S.ButtonEntrar>
    </S.Signup>
  );
}
