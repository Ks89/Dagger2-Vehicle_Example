## Dagger 2 Example

A small example that I'm improving while studying Dagger 2... Work in progress... :)

I represented a Vehicle as a combination of SprungMass (engine, tank and so on) and UnprungMass (wheels, suspensions and so on).

This is only an example of some features provided by Dagger 2. This example don't want to be a skeleton/tutorial and so on. 
It's only a personal experiment with some ideas that I chose to share.

I know, you can implement this with a dependency between Engine and Wheel, but as explained, this is a personal choice. 
If you aren't agree, please, share your solution creating a pull request. 
I want to learn more and more about Dagger 2, in particular about injecting a List of Objects :)

## TODO
- Implement Hybrid Engines
- Try to use subcomponents to improve Unsprungmass
- Test everything
- Improve Suspension types with subclasses and features
- find other interesting things to experiment :)

##License

  Copyright 2016 Stefano Cappa

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
