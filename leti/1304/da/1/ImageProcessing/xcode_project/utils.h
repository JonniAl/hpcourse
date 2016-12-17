//
//  utils.h
//  ImageProcessing
//
//  Created by Anton Davydov on 17/12/2016.
//
//

#ifndef utils_h
#define utils_h
#include <vector>
#include <string>
#include "ImageMagick-6/Magick++.h"
using namespace std;

typedef unsigned int BrightnessType;

struct ConsoleInput {
    // Mandatory fields
    vector<string> images;
    BrightnessType inputBrightness;
    
    // Optional fields
    string output;
    
    ConsoleInput();
    ConsoleInput(vector<string> images, BrightnessType inputBrightness, string output);
};

struct Output {
    BrightnessType maxBrightness;
    //vector<> maxBrightnessPixels;
    
    BrightnessType minBrightness;
    //vector<> minBrightnessPixels;
    
    //vector<> PixelsWithGivenBrightness;
    
    Output();
};

class Utils {
public:
    static ConsoleInput parseArgs(int argc, const char * argv[]);
    
    static BrightnessType brightnessOfPixelColor(const Magick::Color& color);
};

#endif /* utils_h */
