(ns com.amazonaws.auth.RegionAwareSigner
  "A signer that needs to know which region it is talking to."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth RegionAwareSigner]))

(defn set-region-name
  "Configure this signer with the name of the region it will be used
   to sign requests for.

  value - The name of the region. - `java.lang.String`"
  ([^RegionAwareSigner this ^java.lang.String value]
    (-> this (.setRegionName value))))

