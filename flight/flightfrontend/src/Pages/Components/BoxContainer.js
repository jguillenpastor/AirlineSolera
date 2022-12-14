import * as React from 'react';
import Box from '@mui/material/Box';
import Paper from '@mui/material/Paper';

export default function SimplePaper() {
  return (
    <Box
      sx={{
        display: 'flex',
        flexWrap: 'wrap',
        '& > :not(style)': {
          m: 1,
          width: 500,
          height: 500,
        },
        
      }}
    >

      <Paper elevation={3} style={{margin:"10px",padding:"20px 15px",textAlign:"center"}}/>
    </Box>
  );
}
