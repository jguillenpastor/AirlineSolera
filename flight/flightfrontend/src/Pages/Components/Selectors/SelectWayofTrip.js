import { FormControl, FormControlLabel, FormHelperText, FormLabel, InputLabel, MenuItem, Radio, RadioGroup, Select } from "@mui/material";

function SelectWayofTrip(props) {
    return (
        <FormControl>
        <FormLabel id="demo-radio-buttons-group-label"></FormLabel>
        <RadioGroup
            aria-labelledby="demo-radio-buttons-group-label"
            defaultValue="One Way"
            name="radio-buttons-group"
        >
            <FormControlLabel value="One Way" control={<Radio />} label="One Way" />
            <FormControlLabel value="Round Trip" control={<Radio />} label="Round Trip" />
        </RadioGroup>
        </FormControl>
    );
  }
  
  export default SelectWayofTrip;


