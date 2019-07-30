(ns com.amazonaws.services.cloudfront.CloudFrontCookieSigner$CookiesForCannedPolicy
  "Contains the cookies used to access restricted content from
  CloudFront using a canned policy"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudfront CloudFrontCookieSigner$CookiesForCannedPolicy]))

(defn ->cookies-for-canned-policy
  "Constructor."
  (^CloudFrontCookieSigner$CookiesForCannedPolicy []
    (new CloudFrontCookieSigner$CookiesForCannedPolicy )))

(defn expires
  "Instance Field.

  type: java.util.Map$Entry<java.lang.String,java.lang.String>"
  (^java.util.Map$Entry [^CloudFrontCookieSigner$CookiesForCannedPolicy this]
    (-> this .-expires)))

(defn get-expires
  "returns: `java.util.Map$Entry<java.lang.String,java.lang.String>`"
  (^java.util.Map$Entry [^CloudFrontCookieSigner$CookiesForCannedPolicy this]
    (-> this (.getExpires))))

(defn set-expires
  "expires - `java.lang.String`"
  ([^CloudFrontCookieSigner$CookiesForCannedPolicy this ^java.lang.String expires]
    (-> this (.setExpires expires))))

