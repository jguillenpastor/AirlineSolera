import { FormControl, FormHelperText, InputLabel, MenuItem, Select } from "@mui/material";
import "../project.css"


function SelectorPlaces(props) {
    return (
        <FormControl className="eachSelector">
        <InputLabel id="demo-simple-select-helper-label">Origin</InputLabel>
        <Select
            labelId="demo-simple-select-helper-label"
            id="demo-simple-select-helper"
            value={props.value}
            label="Age"
            onChange={props.funct}
        >
            <MenuItem value="">
            <em>None</em>
            </MenuItem>
            <MenuItem value={10}>Málaga</MenuItem>
            <MenuItem value={20}>Elche</MenuItem>
            <MenuItem value={30}>Sevilla</MenuItem>
            <MenuItem value={40}>Jaen</MenuItem>
        </Select>
        <FormHelperText>Select Origin</FormHelperText>
        </FormControl>
    );
  }
  
  export default SelectorPlaces;

