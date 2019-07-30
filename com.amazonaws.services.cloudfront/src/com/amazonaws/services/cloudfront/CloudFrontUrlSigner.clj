(ns com.amazonaws.services.cloudfront.CloudFrontUrlSigner
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudfront CloudFrontUrlSigner]))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (CloudFrontUrlSigner c : CloudFrontUrlSigner.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.services.cloudfront.CloudFrontUrlSigner[]`"
  ([]
    (CloudFrontUrlSigner/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.services.cloudfront.CloudFrontUrlSigner`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.services.cloudfront.CloudFrontUrlSigner [^java.lang.String name]
    (CloudFrontUrlSigner/valueOf name)))

(defn *get-signed-url-with-canned-policy
  "Returns a signed URL with a canned policy that grants universal access to
   private content until a given date.
   For more information, see Overview of Signed URLs.

  protocol - The protocol of the URL - `com.amazonaws.services.cloudfront.util.SignerUtils$Protocol`
  distribution-domain - The domain name of the distribution - `java.lang.String`
  private-key-file - The private key file. RSA private key (.pem) and pkcs8 (.der) files are supported. - `java.io.File`
  s-3-object-key - The s3 key of the object, or the name of the stream for rtmp - `java.lang.String`
  key-pair-id - The key pair id corresponding to the private key file given - `java.lang.String`
  date-less-than - The expiration date of the signed URL in UTC - `java.util.Date`

  returns: The signed URL. - `java.lang.String`

  throws: java.security.spec.InvalidKeySpecException"
  (^java.lang.String [^com.amazonaws.services.cloudfront.util.SignerUtils$Protocol protocol ^java.lang.String distribution-domain ^java.io.File private-key-file ^java.lang.String s-3-object-key ^java.lang.String key-pair-id ^java.util.Date date-less-than]
    (CloudFrontUrlSigner/getSignedURLWithCannedPolicy protocol distribution-domain private-key-file s-3-object-key key-pair-id date-less-than))
  (^java.lang.String [^java.lang.String resource-url-or-path ^java.lang.String key-pair-id ^java.security.PrivateKey private-key ^java.util.Date date-less-than]
    (CloudFrontUrlSigner/getSignedURLWithCannedPolicy resource-url-or-path key-pair-id private-key date-less-than)))

(defn *get-signed-url-with-custom-policy
  "Returns a signed URL that provides tailored access to private content
   based on an access time window and an ip range.
   For more information, see Overview of Signed URLs.

  protocol - The protocol of the URL - `com.amazonaws.services.cloudfront.util.SignerUtils$Protocol`
  distribution-domain - The domain name of the distribution - `java.lang.String`
  private-key-file - Your private key file. RSA private key (.pem) and pkcs8 (.der) files are supported. - `java.io.File`
  s-3-object-key - The s3 key of the object, or the name of the stream for rtmp - `java.lang.String`
  key-pair-id - The key pair id corresponding to the private key file given - `java.lang.String`
  date-less-than - The expiration date of the signed URL in UTC - `java.util.Date`
  date-greater-than - The beginning valid date of the signed URL in UTC - `java.util.Date`
  ip-range - The allowed IP address range of the client making the GET request, in CIDR form (e.g. 192.168.0.1/24). - `java.lang.String`

  returns: The signed URL. - `java.lang.String`

  throws: java.io.IOException"
  (^java.lang.String [^com.amazonaws.services.cloudfront.util.SignerUtils$Protocol protocol ^java.lang.String distribution-domain ^java.io.File private-key-file ^java.lang.String s-3-object-key ^java.lang.String key-pair-id ^java.util.Date date-less-than ^java.util.Date date-greater-than ^java.lang.String ip-range]
    (CloudFrontUrlSigner/getSignedURLWithCustomPolicy protocol distribution-domain private-key-file s-3-object-key key-pair-id date-less-than date-greater-than ip-range))
  (^java.lang.String [^java.lang.String resource-url-or-path ^java.lang.String key-pair-id ^java.security.PrivateKey private-key ^java.lang.String policy]
    (CloudFrontUrlSigner/getSignedURLWithCustomPolicy resource-url-or-path key-pair-id private-key policy)))

(defn *build-custom-policy-for-signed-url
  "Generate a policy document that describes custom access permissions to
   apply via a private distribution's signed URL.

  resource-path - An optional HTTP/S or RTMP resource path that restricts which distribution and S3 objects will be accessible in a signed URL. For standard distributions the resource URL will be \"http://\" distributionName \"/\" objectKey (may also include URL parameters. For distributions with the HTTPS required protocol, the resource URL must start with \"https://\". RTMP resources do not take the form of a URL, and instead the resource path is nothing but the stream's name. The '*' and '?' characters can be used as a wildcards to allow multi-character or single-character matches respectively: * : All distributions/objects will be accessible a1b2c3d4e5f6g7.cloudfront.net/* : All objects within the distribution a1b2c3d4e5f6g7 will be accessible a1b2c3d4e5f6g7.cloudfront.net/path/to/object.txt : Only the S3 object named path/to/object.txt in the distribution a1b2c3d4e5f6g7 will be accessible. If this parameter is null the policy will permit access to all distributions and S3 objects associated with the certificate keypair used to generate the signed URL. - `java.lang.String`
  epoch-date-less-than - The UTC time and date when the signed URL will expire. REQUIRED. - `java.util.Date`
  limit-to-ip-address-cidr - An optional range of client IP addresses that will be allowed to access the distribution, specified as a CIDR range. If null, the CIDR will be omitted and any client will be permitted. - `java.lang.String`
  epoch-date-greater-than - An optional UTC time and date when the signed URL will become active. If null, the signed URL will be active as soon as it is created. - `java.util.Date`

  returns: A policy document describing the access permission to apply when
           generating a signed URL. - `java.lang.String`"
  (^java.lang.String [^java.lang.String resource-path ^java.util.Date epoch-date-less-than ^java.lang.String limit-to-ip-address-cidr ^java.util.Date epoch-date-greater-than]
    (CloudFrontUrlSigner/buildCustomPolicyForSignedUrl resource-path epoch-date-less-than limit-to-ip-address-cidr epoch-date-greater-than)))

