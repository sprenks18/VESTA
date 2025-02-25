# Versatile Epigraphic Standard Translation Assistant (VESTA)
VESTA is a tool that provides translation utilities for the conversion of the Epigraphic Database Roma (EDR) standard to machine readable EpiDoc markup.

## Set up

  * Download [ANTLR tool](https://www.antlr.org/) (May not be needed)
  * Set up Python virtual environment
    * Install ANTLR library using pip
      * Could make a requirements.txt file (add to repo?)
        > antlr4-python3-runtime==4.13.0
      * `pip install -r requirements.txt`


## Run 

Run main.py

## Directory Structure

### top-level Python scripts
  * use/apply the grammar in the grammar directory

### grammar

Contains the grammar for EDR
  * EDR.g is where the grammer is specified
  * make.bat contains instructions of how to create the interpreter

