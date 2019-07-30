(ns com.amazonaws.services.cloudfront.CloudFrontCookieSigner
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudfront CloudFrontCookieSigner]))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (CloudFrontCookieSigner c : CloudFrontCookieSigner.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.services.cloudfront.CloudFrontCookieSigner[]`"
  ([]
    (CloudFrontCookieSigner/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.services.cloudfront.CloudFrontCookieSigner`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.services.cloudfront.CloudFrontCookieSigner [^java.lang.String name]
    (CloudFrontCookieSigner/valueOf name)))

(defn *get-cookies-for-canned-policy
  "Returns signed cookies that grants universal access to private content until a given date.

  protocol - The protocol used to access content using signed cookies. - `com.amazonaws.services.cloudfront.util.SignerUtils$Protocol`
  distribution-domain - The domain name of the distribution. - `java.lang.String`
  private-key-file - The private key file in DER format - `java.io.File`
  resource-path - The path for the resource. - `java.lang.String`
  key-pair-id - The key pair id corresponding to the private key file given. - `java.lang.String`
  expires-on - The expiration date till which content can be accessed using the generated cookies. - `java.util.Date`

  returns: The signed cookies. - `com.amazonaws.services.cloudfront.CloudFrontCookieSigner$CookiesForCannedPolicy`

  throws: java.security.spec.InvalidKeySpecException"
  (^com.amazonaws.services.cloudfront.CloudFrontCookieSigner$CookiesForCannedPolicy [^com.amazonaws.services.cloudfront.util.SignerUtils$Protocol protocol ^java.lang.String distribution-domain ^java.io.File private-key-file ^java.lang.String resource-path ^java.lang.String key-pair-id ^java.util.Date expires-on]
    (CloudFrontCookieSigner/getCookiesForCannedPolicy protocol distribution-domain private-key-file resource-path key-pair-id expires-on))
  (^com.amazonaws.services.cloudfront.CloudFrontCookieSigner$CookiesForCannedPolicy [^java.lang.String resource-url-or-path ^java.lang.String key-pair-id ^java.io.File private-key-file ^java.util.Date expires-on]
    (CloudFrontCookieSigner/getCookiesForCannedPolicy resource-url-or-path key-pair-id private-key-file expires-on)))

(defn *get-cookies-for-custom-policy
  "Returns signed cookies that provides tailored access to private content based on an access time window and an ip range.

  protocol - The protocol used to access content using signed cookies. - `com.amazonaws.services.cloudfront.util.SignerUtils$Protocol`
  distribution-domain - The domain name of the distribution. - `java.lang.String`
  private-key-file - Your private key file. RSA private key (.der) are supported. - `java.io.File`
  resource-path - The path for the resource. - `java.lang.String`
  key-pair-id - The key pair id corresponding to the private key file given. - `java.lang.String`
  expires-on - The expiration date till which content can be accessed using the generated cookies. - `java.util.Date`
  active-from - The date from which content can be accessed using the generated cookies. - `java.util.Date`
  ip-range - The allowed IP address range of the client making the GET request, in CIDR form (e.g. 192.168.0.1/24). - `java.lang.String`

  returns: The signed cookies. - `com.amazonaws.services.cloudfront.CloudFrontCookieSigner$CookiesForCustomPolicy`

  throws: java.security.spec.InvalidKeySpecException"
  (^com.amazonaws.services.cloudfront.CloudFrontCookieSigner$CookiesForCustomPolicy [^com.amazonaws.services.cloudfront.util.SignerUtils$Protocol protocol ^java.lang.String distribution-domain ^java.io.File private-key-file ^java.lang.String resource-path ^java.lang.String key-pair-id ^java.util.Date expires-on ^java.util.Date active-from ^java.lang.String ip-range]
    (CloudFrontCookieSigner/getCookiesForCustomPolicy protocol distribution-domain private-key-file resource-path key-pair-id expires-on active-from ip-range))
  (^com.amazonaws.services.cloudfront.CloudFrontCookieSigner$CookiesForCustomPolicy [^com.amazonaws.services.cloudfront.util.SignerUtils$Protocol protocol ^java.lang.String distribution-domain ^java.security.PrivateKey private-key ^java.lang.String resource-path ^java.lang.String key-pair-id ^java.util.Date expires-on ^java.lang.String ip-range]
    (CloudFrontCookieSigner/getCookiesForCustomPolicy protocol distribution-domain private-key resource-path key-pair-id expires-on ip-range))
  (^com.amazonaws.services.cloudfront.CloudFrontCookieSigner$CookiesForCustomPolicy [^java.lang.String resource-url-or-path ^java.security.PrivateKey private-key ^java.lang.String key-pair-id ^java.util.Date expires-on ^java.util.Date active-from ^java.lang.String ip-range]
    (CloudFrontCookieSigner/getCookiesForCustomPolicy resource-url-or-path private-key key-pair-id expires-on active-from ip-range)))

