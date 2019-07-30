(ns com.amazonaws.regions.Regions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.regions Regions]))

(def GovCloud
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/GovCloud)

(def US_GOV_EAST_1
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/US_GOV_EAST_1)

(def US_EAST_1
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/US_EAST_1)

(def US_EAST_2
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/US_EAST_2)

(def US_WEST_1
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/US_WEST_1)

(def US_WEST_2
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/US_WEST_2)

(def EU_WEST_1
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/EU_WEST_1)

(def EU_WEST_2
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/EU_WEST_2)

(def EU_WEST_3
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/EU_WEST_3)

(def EU_CENTRAL_1
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/EU_CENTRAL_1)

(def EU_NORTH_1
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/EU_NORTH_1)

(def AP_EAST_1
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/AP_EAST_1)

(def AP_SOUTH_1
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/AP_SOUTH_1)

(def AP_SOUTHEAST_1
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/AP_SOUTHEAST_1)

(def AP_SOUTHEAST_2
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/AP_SOUTHEAST_2)

(def AP_NORTHEAST_1
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/AP_NORTHEAST_1)

(def AP_NORTHEAST_2
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/AP_NORTHEAST_2)

(def SA_EAST_1
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/SA_EAST_1)

(def CN_NORTH_1
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/CN_NORTH_1)

(def CN_NORTHWEST_1
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/CN_NORTHWEST_1)

(def CA_CENTRAL_1
  "Enum Constant.

  type: com.amazonaws.regions.Regions"
  Regions/CA_CENTRAL_1)

(def *-default-region
  "Static Constant.

  The default region that new customers in the US are encouraged to use
   when using AWS services for the first time.

  type: com.amazonaws.regions.Regions"
  Regions/DEFAULT_REGION)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Regions c : Regions.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.regions.Regions[]`"
  ([]
    (Regions/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.regions.Regions`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.regions.Regions [^java.lang.String name]
    (Regions/valueOf name)))

(defn *from-name
  "Returns a region enum corresponding to the given region name.

  region-name - The name of the region. Ex.: eu-west-1 - `java.lang.String`

  returns: Region enum representing the given region name. - `com.amazonaws.regions.Regions`"
  (^com.amazonaws.regions.Regions [^java.lang.String region-name]
    (Regions/fromName region-name)))

(defn *get-current-region
  "Returns a Region object representing the region the application is
   running in, when running in EC2. If this method is called from a non-EC2
   environment, it will return null.

  returns: `com.amazonaws.regions.Region`"
  (^com.amazonaws.regions.Region []
    (Regions/getCurrentRegion )))

(defn get-name
  "The name of this region, used in the regions.xml file to identify it.

  returns: `java.lang.String`"
  (^java.lang.String [^Regions this]
    (-> this (.getName))))

(defn get-description
  "Descriptive readable name for this region.

  returns: `java.lang.String`"
  (^java.lang.String [^Regions this]
    (-> this (.getDescription))))

