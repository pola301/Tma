package com.example.tma.module.home.model

import com.example.tma.R

data class Card(
    val id:String,
    val title: String,
    val assetImage: Int,
    val ticketsPrice: String,
    val location: String,
    val rating: String,
    val Details: String,
    val isOpen24h: Boolean
)


val monumentsNearYou = listOf(
    Card(
        id= "1",
        title = "Pyramids",
        assetImage = R.drawable.pyramids,
        ticketsPrice = "720",
        location = "X4GJ+989",
        rating = "N/A",
        Details = "The Giza pyramid complex (also called the Giza necropolis) in Egypt is home to the Great Pyramid, the Pyramid of Khafre, and the Pyramid of Menkaure, along with their associated pyramid complexes and the Great Sphinx. All were built during the Fourth Dynasty of the Old Kingdom of ancient Egypt, between c. 2600 – c. 2500 BC. The site also includes several temples, cemeteries, and the remains of a workers' village.\n" +
                "\n" +
                "The site is at the edge of the Western Desert, approximately 9 km (5.6 mi) west of the Nile River in the city of Giza, and about 13 km (8.1 mi) southwest of the city centre of Cairo. It forms the northernmost part of the 16,000 ha (160 km2; 62 sq mi) Pyramid Fields of the Memphis and its Necropolis UNESCO World Heritage Site, inscribed in 1979",
        isOpen24h = false
    ),
    Card(
        id= "2",
        title = "Bent pyramid of senefru",
        assetImage = R.drawable.bentpyramid,
        ticketsPrice = "80 EGP",
        location = "Q6R5+5PG",
        rating = "N/A",
        Details = "The Bent Pyramid is an ancient Egyptian pyramid located at the royal necropolis of Dahshur, approximately 40 kilometres (25 mi) south of Cairo, built under the Old Kingdom Pharaoh Sneferu (c. 2600 BC). A unique example of early pyramid development in Egypt, this was the second pyramid built by Sneferu.\n" +
                "\n" +
                "The Bent Pyramid rises from the desert at a 54-degree inclination, but the top section (above 47 metres [154 ft]) is built at the shallower angle of 43 degrees, lending the pyramid a visibly 'bent' appearance",
        isOpen24h = false
    ),
    Card(
        id= "3",
        title = "Four seasons hotel",
        assetImage = R.drawable.fourseasons,
        ticketsPrice = "Hotel",
        location = "26H8+59P",
        rating = "4.7/5",
        Details = "Overlooking the River Nile, this luxury hotel is a 7-minute walk from Giza Zoo and 13 km from The Great Pyramid at Giza.\n" +
                "Elegant rooms feature free Wi-Fi, flat-screen TVs, safes and Nespresso machines. Some offer views of the river or Great Pyramid. Suites have separate living rooms; some have 3 bedrooms, kitchens and/or dining areas. Room service is available 24/7.\n" +
                "There's a genteel tea lounge, a sophisticated bar and 3 restaurants (Italian, French and Syrian-Lebanese). Other amenities include an upscale shopping center, an outdoor, 4th-floor pool, a spa and a gym.",
        isOpen24h = true
    )
)

val Museums = listOf(
    Card(
        id= "4",
        title = "National museum of Egyptian culture",
        assetImage = R.drawable.nmec,
        ticketsPrice = "240 EGP",
        location = "265X+87J",
        rating = "4.7/5",
        Details = "The National Museum of Egyptian Civilization (NMEC) is a large museum (490,000 square metres (5,300,000 sq ft) ) located in Old Cairo, a district of Cairo, Egypt. Partially opened in 2017,\n the museum was officially inaugurated on 3 April 2021 by President Abdel Fattah El-Sisi, with the moving of 22 mummies, including 18 kings and four queens, from the Egyptian Museum in central Cairo, in an event termed the Pharaohs' Golden Parade.[1] The museum displays a collection of 50,000 artifacts, presenting the Egyptian civilization from prehistoric times to the present day.",
        isOpen24h = false
    ),
    Card(
        id= "5",
        title = "Egyptian Tahrir Museum",
        assetImage = R.drawable.egyptianmuseum,
        ticketsPrice = "1000 EGP",
        location = "26XM+5CJ",
        rating = "4.5/5",
        Details = "The Museum of Egyptian Antiquities, commonly known as the Egyptian Museum (Arabic: المتحف المصري, romanized: al-Matḥaf al-Miṣrī, Egyptian Arabic: el-Matḥaf el-Maṣri [elˈmætħæf elˈmɑsˤɾi]) (also called the Cairo Museum), located in Cairo, Egypt, houses the largest collection of Egyptian antiquities in the world.[1] It houses over 120,000 items, with a representative amount on display. Located in Tahrir Square in a building built in 1901, it is the largest museum in Africa.\n Among its masterpieces are Pharaoh Tutankhamun's treasure, including its iconic gold burial mask, widely considered one of the best-known works of art in the world and a prominent symbol of ancient Egypt.",
        isOpen24h = false
    ),
    Card(
        id= "6",
        title = "The Grand Egyptian museum",
        assetImage = R.drawable.banner_2,
        ticketsPrice = "1000 EGP",
        location = "X4V9+VPP",
        rating = "4.3",
        Details = "The Grand Egyptian Museum (GEM; Arabic: المتحف المصرى الكبير al-Matḥaf al-Maṣriyy al-Kabīr), also known as the Giza Museum, is an archaeological museum under construction in Giza, Egypt, about 2 kilometres (1.2 miles) from the Giza pyramid complex. The Museum will host over 100,000 artifacts from ancient Egyptian civilization, including the complete Tutankhamun collection, and many pieces will be displayed for the first time. With 81,000 m2 (872,000 sq ft) of floor space, it will be the world's largest archeological museum. It is being built as part of a new master plan for the Giza Plateau, known as Giza 2030.\n" +
                "\n" +
                "The GEM will also host permanent exhibition galleries, temporary exhibitions, special exhibitions, children museum, and virtual and large format screens with a total floor area of 32,000 m².\n" +
                "\n" +
                "The museum was built by a joint venture of the Belgian BESIX Group and the Egyptian Orascom Construction.\n" +
                "\n" +
                "The original estimated completion date was 2013, and past estimates of the opening date have varied. In July 2023, the Minister of Tourism and Antiquities said that he anticipates the opening to be between October 2023 and February 2024.",
        isOpen24h = false
    )
)
val Malls = listOf(
    Card(
        id= "7",
        title = "City stars mall",
        assetImage = R.drawable.citystars,
        ticketsPrice = "N/A",
        location = "38FW+846",
        rating = "4.7/5",
        Details = "Huge, well-known retail complex with brand-name shopping & diverse dining, plus hotels & offices.",
        isOpen24h = false
    ),
    Card(
        id= "8",
        title = "Cairo festival city mall",
        assetImage = R.drawable.cairofestival,
        ticketsPrice = "N/A",
        location = "26XM+5CJ",
        rating = "4.5/5",
        Details = "",
        isOpen24h = false
    ),
    Card(
        id= "9",
        title = "Mall of Arab",
        assetImage = R.drawable.banner_2,
        ticketsPrice = "N/A",
        location = "X4V9+VPP",
        rating = "4.3",
        Details = "",
        isOpen24h = false
    )
)
val Hotels = listOf(
    Card(
        id= "12",
        title = "Four seasons hotel",
        assetImage = R.drawable.fourseasons,
        ticketsPrice = "EGP 8,806/night",
        location = "38FW+846",
        rating = "4.7/5",
        Details = "Overlooking the River Nile, this luxury hotel is a 7-minute walk from Giza Zoo and 13 km from The Great Pyramid at Giza.\\n\" +\n" +
                "\"Elegant rooms feature free Wi-Fi, flat-screen TVs, safes and Nespresso machines. Some offer views of the river or Great Pyramid. Suites have separate living rooms; some have 3 bedrooms, kitchens and/or dining areas. Room service is available 24/7.\\n\" +\n" +
                "\"There's a genteel tea lounge, a sophisticated bar and 3 restaurants (Italian, French and Syrian-Lebanese). Other amenities include an upscale shopping center, an outdoor, 4th-floor pool, a spa and a gym.",
        isOpen24h = true
    ),
    Card(
        id= "13",
        title = "Palace Kempinski",
        assetImage = R.drawable.palacekempinski,
        ticketsPrice = "EGP 7,476/night",
        location = "3C69+6J7",
        rating = "4.5/5",
        Details = "Located in Cairo’s affluent Garden City district, Kempinski Nile Hotel offers luxurious rooms on the shores of the Nile River. It features a wellness centre and a rooftop swimming pool.\n" +
                "\n" +
                "Each of Kempinski’s rooms offer free WiFi, high definition LCD TVs with satellite channels and free Coca Cola drinks from the mini bar. For guests’ comfort, we offer the butler service, concierge and pillow menu.\n" +
                "\n" +
                "Kempinski’s full-service spa and wellness centre offers complimentary hot tubs, steam rooms, and saunas. Guests can also enjoy professional massages, or cool off in the outdoor swimming pool on the hotel’s rooftop.\n" +
                "\n" +
                "Kempinski Nile Hotel boasts variety of restaurants and bars, including the Osmanly restaurant offering Ottoman ( Turkish ) cuisine, The Blue restaurant serving an Italian cuisine and the Jazz Bar on Floor 10.\n" +
                "\n" +
                "Kempinski Nile Hotel is 5 minutes’ walk from downtown Cairo and from the Egyptian Museum. Cairo International Airport is 25 km away, the Pyramids of Giza and the Cairo Citadel are 20 minutes away by car.",
        isOpen24h = true
    ),
    Card(
        id= "14",
        title = "Intercontinental",
        assetImage = R.drawable.intercont,
        ticketsPrice = "6,940 EGP/night",
        location = "38FX+44C",
        rating = "4.3",
        Details = "Luxury hotel in the ancient city of Cairo\n" +
                "Explore Cairo's heritage amidst modern luxuries and stay at the five-star InterContinental Citystars Cairo hotel in Heliopolis, next to Stars Centre Mall. Relax in grand rooms with beautiful furnishings and views. Indulge at our 9 exquisite restaurants and bars. Need event space? Our private meeting rooms and Cairo's largest ballroom will satisfy your requirements. Our concierge gladly arranges private tours of the nearby Cairo Citadel, the Pyramids, and soon, The Grand Egyptian Museum",
        isOpen24h = true
    )
)
val sportsClubs = listOf(
    Card(
        id= "10",
        title = "Wadi Degla club",
        assetImage = R.drawable.wadidegla,
        ticketsPrice = "100EGP",
        location = "38FW+846",
        rating = "4.7/5",
        Details = "",
        isOpen24h = true
    ),
    Card(
        id= "11",
        title = "Al-Ahly club",
        assetImage = R.drawable.alahlyclub,
        ticketsPrice = "NO",
        location = "26XM+5CJ",
        rating = "4.5/5",
        Details = "",
        isOpen24h = false
    ),
    Card(
        id= "11",
        title = "El Shams club",
        assetImage = R.drawable.elshams,
        ticketsPrice = "75 EGP",
        location = "26XM+5CJ",
        rating = "4.5/5",
        Details = "The club was founded in May 1962 as sports social club and was called the Heliopolis Sporting Club (El Shams), based in the northern section of Cairo Governorate.\n" +
                "\n" +
                "El Shams football team participated only once in the Egyptian Premier League and that was in 1997–98. The team won 5, drew 9, and lost 16 matches earning the 16th place (last place).[1] As a result, the team was relegated to the Egyptian Premier B.",
        isOpen24h = false
    ),
)


