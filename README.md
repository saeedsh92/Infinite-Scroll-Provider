# Infinite-Scroll-Provider
easy and very light library used to provide infinite scroll functionality for recycler views
<img src="https://github.com/saeedsh92/Infinite-Scroll-Provider/blob/master/infinite-scroll-provider-demo.jpg?raw=false" width="700">
<img src="https://github.com/saeedsh92/Infinite-Scroll-Provider/blob/master/Screenshot_1481109328.png?raw=false" width="350">
<img src="https://github.com/saeedsh92/Infinite-Scroll-Provider/blob/master/Screenshot_1481109514.png?raw=false" width="350">

## How to download
### Gradle: 
add this line to your module build.gradle dependecies block:

     compile 'ss.com.infinitescrollprovider:infinitescrollprovider:1.0'

### Maven
    <dependency>
      <groupId>ss.com.infinitescrollprovider</groupId>
      <artifactId>infinitescrollprovider</artifactId>
      <version>1.0</version>
      <type>pom</type>
    </dependency>

## How use this lib
you can attach your recycler view with infiniteScrollProvider like this:
```java
  InfiniteScrollProvider infiniteScrollProvider = new InfiniteScrollProvider();
  infiniteScrollProvider.attach(recyclerView, new OnLoadMoreListener() {
    @Override
    public void onLoadMore() {
      //this method called when recycler view scrolled to the end
    }
  });
```

## License
Copyright 2016 Saeed shahini

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

## Author
Saeed shahini

email: saeedshahiniit@gmail.com

github: https://github.com/saeedsh92
