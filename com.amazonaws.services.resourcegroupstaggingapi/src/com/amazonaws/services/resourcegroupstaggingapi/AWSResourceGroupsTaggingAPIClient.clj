(ns com.amazonaws.services.resourcegroupstaggingapi.AWSResourceGroupsTaggingAPIClient
  "Client for accessing AWS Resource Groups Tagging API. All service calls made using this client are blocking, and will
  not return until the service call completes.

  Resource Groups Tagging API

  This guide describes the API operations for the resource groups tagging.


  A tag is a label that you assign to an AWS resource. A tag consists of a key and a value, both of which you define.
  For example, if you have two Amazon EC2 instances, you might assign both a tag key of \"Stack.\" But the value of
  \"Stack\" might be \"Testing\" for one and \"Production\" for the other.


  Tagging can help you organize your resources and enables you to simplify resource management, access management and
  cost allocation.


  You can use the resource groups tagging API operations to complete the following tasks:




  Tag and untag supported resources located in the specified region for the AWS account




  Use tag-based filters to search for resources located in the specified region for the AWS account




  List all existing tag keys in the specified region for the AWS account




  List all existing values for the specified key in the specified region for the AWS account




  To make full use of the resource groups tagging API operations, you might need additional IAM permissions, including
  permission to access the resources of individual services as well as permission to view and apply tags to those
  resources. For more information, see Obtaining Permissions for Resource Groups and Tag Editor.


  You can use the Resource Groups Tagging API to tag resources for the following AWS services.




  Alexa for Business (a4b)




  API Gateway




  AWS AppStream




  AWS AppSync




  Amazon Athena




  Amazon Aurora




  AWS Certificate Manager




  AWS Certificate Manager Private CA




  Amazon Cloud Directory




  AWS CloudFormation




  Amazon CloudFront




  AWS CloudHSM




  AWS CloudTrail




  Amazon CloudWatch (alarms only)




  Amazon CloudWatch Events




  Amazon CloudWatch Logs




  AWS CodeBuild




  AWS CodeStar




  Amazon Cognito Identity




  Amazon Cognito User Pools




  Amazon Comprehend




  AWS Config




  AWS Data Pipeline




  AWS Database Migration Service




  AWS Datasync




  AWS Direct Connect




  AWS Directory Service




  Amazon DynamoDB




  Amazon EBS




  Amazon EC2




  Amazon ECR




  Amazon ECS




  AWS Elastic Beanstalk




  Amazon Elastic File System




  Elastic Load Balancing




  Amazon ElastiCache




  Amazon Elasticsearch Service




  AWS Elemental MediaLive




  AWS Elemental MediaPackage




  AWS Elemental MediaTailor




  Amazon EMR




  Amazon FSx




  Amazon Glacier




  AWS Glue




  Amazon Inspector




  AWS IoT Analytics




  AWS IoT Core




  AWS IoT Device Defender




  AWS IoT Device Management




  AWS IoT Greengrass




  AWS Key Management Service




  Amazon Kinesis




  Amazon Kinesis Data Analytics




  Amazon Kinesis Data Firehose




  AWS Lambda




  AWS License Manager




  Amazon Machine Learning




  Amazon MQ




  Amazon MSK




  Amazon Neptune




  AWS OpsWorks




  Amazon RDS




  Amazon Redshift




  AWS Resource Access Manager




  AWS Resource Groups




  AWS RoboMaker




  Amazon Route 53




  Amazon Route 53 Resolver




  Amazon S3 (buckets only)




  Amazon SageMaker




  AWS Secrets Manager




  AWS Service Catalog




  Amazon Simple Notification Service (SNS)




  Amazon Simple Queue Service (SQS)




  AWS Simple System Manager (SSM)




  AWS Step Functions




  AWS Storage Gateway




  AWS Transfer for SFTP




  Amazon VPC




  Amazon WorkSpaces"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.resourcegroupstaggingapi AWSResourceGroupsTaggingAPIClient]))

(defn *builder
  "returns: `com.amazonaws.services.resourcegroupstaggingapi.AWSResourceGroupsTaggingAPIClientBuilder`"
  (^com.amazonaws.services.resourcegroupstaggingapi.AWSResourceGroupsTaggingAPIClientBuilder []
    (AWSResourceGroupsTaggingAPIClient/builder )))

(defn get-resources
  "Returns all the tagged or previously tagged resources that are located in the specified region for the AWS
   account. You can optionally specify filters (tags and resource types) in your request, depending on what
   information you want returned. The response includes all tags that are associated with the requested resources.



   You can check the PaginationToken response parameter to determine if a query completed. Queries can
   occasionally return fewer results on a page than allowed. The PaginationToken response parameter
   value is null only when there are no more results to display.

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesRequest`

  returns: Result of the GetResources operation returned by the service. - `com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesResult`

  throws: com.amazonaws.services.resourcegroupstaggingapi.model.InvalidParameterException - A parameter is missing or a malformed string or invalid or out-of-range value was supplied for the request parameter."
  (^com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesResult [^AWSResourceGroupsTaggingAPIClient this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesRequest request]
    (-> this (.getResources request))))

(defn get-tag-keys
  "Returns all tag keys in the specified region for the AWS account.

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest`

  returns: Result of the GetTagKeys operation returned by the service. - `com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysResult`

  throws: com.amazonaws.services.resourcegroupstaggingapi.model.InvalidParameterException - A parameter is missing or a malformed string or invalid or out-of-range value was supplied for the request parameter."
  (^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysResult [^AWSResourceGroupsTaggingAPIClient this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest request]
    (-> this (.getTagKeys request))))

(defn get-tag-values
  "Returns all tag values for the specified key in the specified region for the AWS account.

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest`

  returns: Result of the GetTagValues operation returned by the service. - `com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesResult`

  throws: com.amazonaws.services.resourcegroupstaggingapi.model.InvalidParameterException - A parameter is missing or a malformed string or invalid or out-of-range value was supplied for the request parameter."
  (^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesResult [^AWSResourceGroupsTaggingAPIClient this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest request]
    (-> this (.getTagValues request))))

(defn tag-resources
  "Applies one or more tags to the specified resources. Note the following:




   Not all resources can have tags. For a list of resources that support tagging, see Supported Resources in the
   AWS Resource Groups User Guide.




   Each resource can have up to 50 tags. For other limits, see Tag Restrictions
   in the Amazon EC2 User Guide for Linux Instances.




   You can only tag resources that are located in the specified region for the AWS account.




   To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as
   well as permissions for adding tags. For more information, see Obtaining
   Permissions for Tagging in the AWS Resource Groups User Guide.

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest`

  returns: Result of the TagResources operation returned by the service. - `com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesResult`

  throws: com.amazonaws.services.resourcegroupstaggingapi.model.InvalidParameterException - A parameter is missing or a malformed string or invalid or out-of-range value was supplied for the request parameter."
  (^com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesResult [^AWSResourceGroupsTaggingAPIClient this ^com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest request]
    (-> this (.tagResources request))))

(defn untag-resources
  "Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that
   key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were
   already removed. Note the following:




   To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to
   as well as permissions for removing tags. For more information, see Obtaining
   Permissions for Tagging in the AWS Resource Groups User Guide.




   You can only tag resources that are located in the specified region for the AWS account.

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest`

  returns: Result of the UntagResources operation returned by the service. - `com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesResult`

  throws: com.amazonaws.services.resourcegroupstaggingapi.model.InvalidParameterException - A parameter is missing or a malformed string or invalid or out-of-range value was supplied for the request parameter."
  (^com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesResult [^AWSResourceGroupsTaggingAPIClient this ^com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest request]
    (-> this (.untagResources request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSResourceGroupsTaggingAPIClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

