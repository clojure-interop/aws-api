(ns com.amazonaws.services.ec2.AmazonEC2Client
  "Client for accessing Amazon EC2. All service calls made using this client are blocking, and will not return until the
  service call completes.

  Amazon Elastic Compute Cloud

  Amazon Elastic Compute Cloud (Amazon EC2) provides secure and resizable computing capacity in the AWS cloud. Using
  Amazon EC2 eliminates the need to invest in hardware up front, so you can develop and deploy applications faster.


  To learn more, see the following resources:




  Amazon EC2: Amazon EC2 product page, Amazon EC2 documentation




  Amazon EBS: Amazon EBS product page, Amazon EBS documentation




  Amazon VPC: Amazon VPC product page, Amazon VPC documentation




  AWS VPN: AWS VPN product page, AWS VPN documentation"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ec2 AmazonEC2Client]))

(defn ->amazon-ec-2-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon EC2 (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonEC2Client [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonEC2Client aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonEC2Client [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonEC2Client aws-credentials client-configuration))
  (^AmazonEC2Client [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonEC2Client client-configuration))
  (^AmazonEC2Client []
    (new AmazonEC2Client )))

(defn *builder
  "returns: `com.amazonaws.services.ec2.AmazonEC2ClientBuilder`"
  (^com.amazonaws.services.ec2.AmazonEC2ClientBuilder []
    (AmazonEC2Client/builder )))

(defn describe-traffic-mirror-targets
  "Information about one or more Traffic Mirror targets.

  request - `com.amazonaws.services.ec2.model.DescribeTrafficMirrorTargetsRequest`

  returns: Result of the DescribeTrafficMirrorTargets operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeTrafficMirrorTargetsResult`"
  (^com.amazonaws.services.ec2.model.DescribeTrafficMirrorTargetsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeTrafficMirrorTargetsRequest request]
    (-> this (.describeTrafficMirrorTargets request))))

(defn modify-fleet
  "Modifies the specified EC2 Fleet.


   While the EC2 Fleet is being modified, it is in the modifying state.

  request - `com.amazonaws.services.ec2.model.ModifyFleetRequest`

  returns: Result of the ModifyFleet operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyFleetResult`"
  (^com.amazonaws.services.ec2.model.ModifyFleetResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyFleetRequest request]
    (-> this (.modifyFleet request))))

(defn create-vpc
  "Creates a VPC with the specified IPv4 CIDR block. The smallest VPC you can create uses a /28 netmask (16 IPv4
   addresses), and the largest uses a /16 netmask (65,536 IPv4 addresses). For more information about how large to
   make your VPC, see Your VPC and
   Subnets in the Amazon Virtual Private Cloud User Guide.


   You can optionally request an Amazon-provided IPv6 CIDR block for the VPC. The IPv6 CIDR block uses a /56 prefix
   length, and is allocated from Amazon's pool of IPv6 addresses. You cannot choose the IPv6 range for your VPC.


   By default, each instance you launch in the VPC has the default DHCP options, which include only a default DNS
   server that we provide (AmazonProvidedDNS). For more information, see DHCP Options Sets in the
   Amazon Virtual Private Cloud User Guide.


   You can specify the instance tenancy value for the VPC when you create it. You can't change this value for the
   VPC after you create it. For more information, see Dedicated Instances in the
   Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateVpcRequest`

  returns: Result of the CreateVpc operation returned by the service. - `com.amazonaws.services.ec2.model.CreateVpcResult`"
  (^com.amazonaws.services.ec2.model.CreateVpcResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateVpcRequest request]
    (-> this (.createVpc request))))

(defn describe-id-format
  "Describes the ID format settings for your resources on a per-Region basis, for example, to view which resource
   types are enabled for longer IDs. This request only returns information about resource types whose ID formats can
   be modified; it does not return information about other resource types.


   The following resource types support longer IDs: bundle | conversion-task |
   customer-gateway | dhcp-options | elastic-ip-allocation |
   elastic-ip-association | export-task | flow-log | image |
   import-task | instance | internet-gateway | network-acl |
   network-acl-association | network-interface | network-interface-attachment
   | prefix-list | reservation | route-table |
   route-table-association | security-group | snapshot | subnet
   | subnet-cidr-block-association | volume | vpc |
   vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection |
   vpn-connection | vpn-gateway.


   These settings apply to the IAM user who makes the request; they do not apply to the entire AWS account. By
   default, an IAM user defaults to the same settings as the root user, unless they explicitly override the settings
   by running the ModifyIdFormat command. Resources created with longer IDs are visible to all IAM users,
   regardless of these settings and provided that they have permission to use the relevant Describe
   command for the resource type.

  request - `com.amazonaws.services.ec2.model.DescribeIdFormatRequest`

  returns: Result of the DescribeIdFormat operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeIdFormatResult`"
  (^com.amazonaws.services.ec2.model.DescribeIdFormatResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeIdFormatRequest request]
    (-> this (.describeIdFormat request)))
  (^com.amazonaws.services.ec2.model.DescribeIdFormatResult [^AmazonEC2Client this]
    (-> this (.describeIdFormat))))

(defn delete-tags
  "Deletes the specified set of tags from the specified set of resources.


   To list the current tags, use DescribeTags. For more information about tags, see Tagging Your Resources in the
   Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteTagsResult`"
  (^com.amazonaws.services.ec2.model.DeleteTagsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteTagsRequest request]
    (-> this (.deleteTags request))))

(defn create-route-table
  "Creates a route table for the specified VPC. After you create a route table, you can add routes and associate the
   table with a subnet.


   For more information, see Route
   Tables in the Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateRouteTableRequest`

  returns: Result of the CreateRouteTable operation returned by the service. - `com.amazonaws.services.ec2.model.CreateRouteTableResult`"
  (^com.amazonaws.services.ec2.model.CreateRouteTableResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateRouteTableRequest request]
    (-> this (.createRouteTable request))))

(defn apply-security-groups-to-client-vpn-target-network
  "Applies a security group to the association between the target network and the Client VPN endpoint. This action
   replaces the existing security groups with the specified security groups.

  request - `com.amazonaws.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkRequest`

  returns: Result of the ApplySecurityGroupsToClientVpnTargetNetwork operation returned by the service. - `com.amazonaws.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkResult`"
  (^com.amazonaws.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkRequest request]
    (-> this (.applySecurityGroupsToClientVpnTargetNetwork request))))

(defn delete-route-table
  "Deletes the specified route table. You must disassociate the route table from any subnets before you can delete
   it. You can't delete the main route table.

  request - `com.amazonaws.services.ec2.model.DeleteRouteTableRequest`

  returns: Result of the DeleteRouteTable operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteRouteTableResult`"
  (^com.amazonaws.services.ec2.model.DeleteRouteTableResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteRouteTableRequest request]
    (-> this (.deleteRouteTable request))))

(defn disable-vgw-route-propagation
  "Disables a virtual private gateway (VGW) from propagating routes to a specified route table of a VPC.

  request - `com.amazonaws.services.ec2.model.DisableVgwRoutePropagationRequest`

  returns: Result of the DisableVgwRoutePropagation operation returned by the service. - `com.amazonaws.services.ec2.model.DisableVgwRoutePropagationResult`"
  (^com.amazonaws.services.ec2.model.DisableVgwRoutePropagationResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DisableVgwRoutePropagationRequest request]
    (-> this (.disableVgwRoutePropagation request))))

(defn describe-instance-status
  "Describes the status of the specified instances or all of your instances. By default, only running instances are
   described, unless you specifically indicate to return the status of all instances.


   Instance status includes the following components:




   Status checks - Amazon EC2 performs status checks on running EC2 instances to identify hardware and
   software issues. For more information, see Status
   Checks for Your Instances and Troubleshooting
   Instances with Failed Status Checks in the Amazon Elastic Compute Cloud User Guide.




   Scheduled events - Amazon EC2 can schedule events (such as reboot, stop, or terminate) for your instances
   related to hardware issues, software updates, or system maintenance. For more information, see Scheduled
   Events for Your Instances in the Amazon Elastic Compute Cloud User Guide.




   Instance state - You can manage your instances from the moment you launch them through their termination.
   For more information, see Instance Lifecycle in
   the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeInstanceStatusRequest`

  returns: Result of the DescribeInstanceStatus operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeInstanceStatusResult`"
  (^com.amazonaws.services.ec2.model.DescribeInstanceStatusResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeInstanceStatusRequest request]
    (-> this (.describeInstanceStatus request)))
  (^com.amazonaws.services.ec2.model.DescribeInstanceStatusResult [^AmazonEC2Client this]
    (-> this (.describeInstanceStatus))))

(defn delete-network-acl-entry
  "Deletes the specified ingress or egress entry (rule) from the specified network ACL.

  request - `com.amazonaws.services.ec2.model.DeleteNetworkAclEntryRequest`

  returns: Result of the DeleteNetworkAclEntry operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteNetworkAclEntryResult`"
  (^com.amazonaws.services.ec2.model.DeleteNetworkAclEntryResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteNetworkAclEntryRequest request]
    (-> this (.deleteNetworkAclEntry request))))

(defn modify-instance-capacity-reservation-attributes
  "Modifies the Capacity Reservation settings for a stopped instance. Use this action to configure an instance to
   target a specific Capacity Reservation, run in any open Capacity Reservation with matching
   attributes, or run On-Demand Instance capacity.

  request - `com.amazonaws.services.ec2.model.ModifyInstanceCapacityReservationAttributesRequest`

  returns: Result of the ModifyInstanceCapacityReservationAttributes operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyInstanceCapacityReservationAttributesResult`"
  (^com.amazonaws.services.ec2.model.ModifyInstanceCapacityReservationAttributesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyInstanceCapacityReservationAttributesRequest request]
    (-> this (.modifyInstanceCapacityReservationAttributes request))))

(defn create-subnet
  "Creates a subnet in an existing VPC.


   When you create each subnet, you provide the VPC ID and IPv4 CIDR block for the subnet. After you create a
   subnet, you can't change its CIDR block. The size of the subnet's IPv4 CIDR block can be the same as a VPC's IPv4
   CIDR block, or a subset of a VPC's IPv4 CIDR block. If you create more than one subnet in a VPC, the subnets'
   CIDR blocks must not overlap. The smallest IPv4 subnet (and VPC) you can create uses a /28 netmask (16 IPv4
   addresses), and the largest uses a /16 netmask (65,536 IPv4 addresses).


   If you've associated an IPv6 CIDR block with your VPC, you can create a subnet with an IPv6 CIDR block that uses
   a /64 prefix length.



   AWS reserves both the first four and the last IPv4 address in each subnet's CIDR block. They're not available for
   use.



   If you add more than one subnet to a VPC, they're set up in a star topology with a logical router in the middle.


   If you launch an instance in a VPC using an Amazon EBS-backed AMI, the IP address doesn't change if you stop and
   restart the instance (unlike a similar instance launched outside a VPC, which gets a new IP address when
   restarted). It's therefore possible to have a subnet with no running instances (they're all stopped), but no
   remaining IP addresses available.


   For more information about subnets, see Your VPC and Subnets in the
   Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateSubnetRequest`

  returns: Result of the CreateSubnet operation returned by the service. - `com.amazonaws.services.ec2.model.CreateSubnetResult`"
  (^com.amazonaws.services.ec2.model.CreateSubnetResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateSubnetRequest request]
    (-> this (.createSubnet request))))

(defn describe-snapshot-attribute
  "Describes the specified attribute of the specified snapshot. You can specify only one attribute at a time.


   For more information about EBS snapshots, see Amazon EBS Snapshots in the
   Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeSnapshotAttributeRequest`

  returns: Result of the DescribeSnapshotAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSnapshotAttributeResult`"
  (^com.amazonaws.services.ec2.model.DescribeSnapshotAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeSnapshotAttributeRequest request]
    (-> this (.describeSnapshotAttribute request))))

(defn report-instance-status
  "Submits feedback about the status of an instance. The instance must be in the running state. If your
   experience with the instance differs from the instance status returned by DescribeInstanceStatus, use
   ReportInstanceStatus to report your experience with the instance. Amazon EC2 collects this information to
   improve the accuracy of status checks.


   Use of this action does not change the value returned by DescribeInstanceStatus.

  request - `com.amazonaws.services.ec2.model.ReportInstanceStatusRequest`

  returns: Result of the ReportInstanceStatus operation returned by the service. - `com.amazonaws.services.ec2.model.ReportInstanceStatusResult`"
  (^com.amazonaws.services.ec2.model.ReportInstanceStatusResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ReportInstanceStatusRequest request]
    (-> this (.reportInstanceStatus request))))

(defn describe-launch-templates
  "Describes one or more launch templates.

  request - `com.amazonaws.services.ec2.model.DescribeLaunchTemplatesRequest`

  returns: Result of the DescribeLaunchTemplates operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeLaunchTemplatesResult`"
  (^com.amazonaws.services.ec2.model.DescribeLaunchTemplatesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeLaunchTemplatesRequest request]
    (-> this (.describeLaunchTemplates request))))

(defn describe-classic-link-instances
  "Describes one or more of your linked EC2-Classic instances. This request only returns information about
   EC2-Classic instances linked to a VPC through ClassicLink. You cannot use this request to return information
   about other instances.

  request - `com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesRequest`

  returns: Result of the DescribeClassicLinkInstances operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesResult`"
  (^com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesRequest request]
    (-> this (.describeClassicLinkInstances request)))
  (^com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesResult [^AmazonEC2Client this]
    (-> this (.describeClassicLinkInstances))))

(defn describe-launch-template-versions
  "Describes one or more versions of a specified launch template. You can describe all versions, individual
   versions, or a range of versions.

  request - `com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsRequest`

  returns: Result of the DescribeLaunchTemplateVersions operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsRequest request]
    (-> this (.describeLaunchTemplateVersions request))))

(defn deregister-image
  "Deregisters the specified AMI. After you deregister an AMI, it can't be used to launch new instances; however, it
   doesn't affect any instances that you've already launched from the AMI. You'll continue to incur usage costs for
   those instances until you terminate them.


   When you deregister an Amazon EBS-backed AMI, it doesn't affect the snapshot that was created for the root volume
   of the instance during the AMI creation process. When you deregister an instance store-backed AMI, it doesn't
   affect the files that you uploaded to Amazon S3 when you created the AMI.

  request - `com.amazonaws.services.ec2.model.DeregisterImageRequest`

  returns: Result of the DeregisterImage operation returned by the service. - `com.amazonaws.services.ec2.model.DeregisterImageResult`"
  (^com.amazonaws.services.ec2.model.DeregisterImageResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeregisterImageRequest request]
    (-> this (.deregisterImage request))))

(defn delete-security-group
  "Deletes a security group.


   If you attempt to delete a security group that is associated with an instance, or is referenced by another
   security group, the operation fails with InvalidGroup.InUse in EC2-Classic or
   DependencyViolation in EC2-VPC.

  request - `com.amazonaws.services.ec2.model.DeleteSecurityGroupRequest`

  returns: Result of the DeleteSecurityGroup operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteSecurityGroupResult`"
  (^com.amazonaws.services.ec2.model.DeleteSecurityGroupResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteSecurityGroupRequest request]
    (-> this (.deleteSecurityGroup request))))

(defn describe-volumes-modifications
  "Reports the current modification status of EBS volumes.


   Current-generation EBS volumes support modification of attributes including type, size, and (for io1
   volumes) IOPS provisioning while either attached to or detached from an instance. Following an action from the
   API or the console to modify a volume, the status of the modification may be modifying,
   optimizing, completed, or failed. If a volume has never been modified,
   then certain elements of the returned VolumeModification objects are null.


   You can also use CloudWatch Events to check the status of a modification to an EBS volume. For information about
   CloudWatch Events, see the Amazon
   CloudWatch Events User Guide. For more information, see Monitoring
   Volume Modifications\" in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeVolumesModificationsRequest`

  returns: Result of the DescribeVolumesModifications operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVolumesModificationsResult`"
  (^com.amazonaws.services.ec2.model.DescribeVolumesModificationsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeVolumesModificationsRequest request]
    (-> this (.describeVolumesModifications request))))

(defn reset-ebs-default-kms-key-id
  "Resets the default customer master key (CMK) for EBS encryption for your account in this Region to the AWS
   managed CMK for EBS.


   After resetting the default CMK to the AWS managed CMK, you can continue to encrypt by a customer managed CMK by
   specifying it when you create the volume. For more information, see Amazon EBS Encryption in the
   Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.ResetEbsDefaultKmsKeyIdRequest`

  returns: Result of the ResetEbsDefaultKmsKeyId operation returned by the service. - `com.amazonaws.services.ec2.model.ResetEbsDefaultKmsKeyIdResult`"
  (^com.amazonaws.services.ec2.model.ResetEbsDefaultKmsKeyIdResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ResetEbsDefaultKmsKeyIdRequest request]
    (-> this (.resetEbsDefaultKmsKeyId request))))

(defn import-volume
  "Creates an import volume task using metadata from the specified disk image.For more information, see Importing Disks to Amazon EBS.


   For information about the import manifest referenced by this API action, see VM Import Manifest.

  request - `com.amazonaws.services.ec2.model.ImportVolumeRequest`

  returns: Result of the ImportVolume operation returned by the service. - `com.amazonaws.services.ec2.model.ImportVolumeResult`"
  (^com.amazonaws.services.ec2.model.ImportVolumeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ImportVolumeRequest request]
    (-> this (.importVolume request))))

(defn modify-client-vpn-endpoint
  "Modifies the specified Client VPN endpoint. You can only modify an endpoint's server certificate information,
   client connection logging information, DNS server, and description. Modifying the DNS server resets existing
   client connections.

  request - `com.amazonaws.services.ec2.model.ModifyClientVpnEndpointRequest`

  returns: Result of the ModifyClientVpnEndpoint operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyClientVpnEndpointResult`"
  (^com.amazonaws.services.ec2.model.ModifyClientVpnEndpointResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyClientVpnEndpointRequest request]
    (-> this (.modifyClientVpnEndpoint request))))

(defn describe-internet-gateways
  "Describes one or more of your internet gateways.

  request - `com.amazonaws.services.ec2.model.DescribeInternetGatewaysRequest`

  returns: Result of the DescribeInternetGateways operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeInternetGatewaysResult`"
  (^com.amazonaws.services.ec2.model.DescribeInternetGatewaysResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeInternetGatewaysRequest request]
    (-> this (.describeInternetGateways request)))
  (^com.amazonaws.services.ec2.model.DescribeInternetGatewaysResult [^AmazonEC2Client this]
    (-> this (.describeInternetGateways))))

(defn withdraw-byoip-cidr
  "Stops advertising an IPv4 address range that is provisioned as an address pool.


   You can perform this operation at most once every 10 seconds, even if you specify different address ranges each
   time.


   It can take a few minutes before traffic to the specified addresses stops routing to AWS because of BGP
   propagation delays.

  request - `com.amazonaws.services.ec2.model.WithdrawByoipCidrRequest`

  returns: Result of the WithdrawByoipCidr operation returned by the service. - `com.amazonaws.services.ec2.model.WithdrawByoipCidrResult`"
  (^com.amazonaws.services.ec2.model.WithdrawByoipCidrResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.WithdrawByoipCidrRequest request]
    (-> this (.withdrawByoipCidr request))))

(defn describe-scheduled-instances
  "Describes the specified Scheduled Instances or all your Scheduled Instances.

  request - `com.amazonaws.services.ec2.model.DescribeScheduledInstancesRequest`

  returns: Result of the DescribeScheduledInstances operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeScheduledInstancesResult`"
  (^com.amazonaws.services.ec2.model.DescribeScheduledInstancesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeScheduledInstancesRequest request]
    (-> this (.describeScheduledInstances request))))

(defn describe-tags
  "Describes the specified tags for your EC2 resources.


   For more information about tags, see Tagging Your Resources in the
   Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeTagsResult`"
  (^com.amazonaws.services.ec2.model.DescribeTagsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeTagsRequest request]
    (-> this (.describeTags request)))
  (^com.amazonaws.services.ec2.model.DescribeTagsResult [^AmazonEC2Client this]
    (-> this (.describeTags))))

(defn replace-transit-gateway-route
  "Replaces the specified route in the specified transit gateway route table.

  request - `com.amazonaws.services.ec2.model.ReplaceTransitGatewayRouteRequest`

  returns: Result of the ReplaceTransitGatewayRoute operation returned by the service. - `com.amazonaws.services.ec2.model.ReplaceTransitGatewayRouteResult`"
  (^com.amazonaws.services.ec2.model.ReplaceTransitGatewayRouteResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ReplaceTransitGatewayRouteRequest request]
    (-> this (.replaceTransitGatewayRoute request))))

(defn describe-spot-fleet-instances
  "Describes the running instances for the specified Spot Fleet.

  request - `com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesRequest`

  returns: Result of the DescribeSpotFleetInstances operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesResult`"
  (^com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesRequest request]
    (-> this (.describeSpotFleetInstances request))))

(defn import-snapshot
  "Imports a disk into an EBS snapshot.

  request - `com.amazonaws.services.ec2.model.ImportSnapshotRequest`

  returns: Result of the ImportSnapshot operation returned by the service. - `com.amazonaws.services.ec2.model.ImportSnapshotResult`"
  (^com.amazonaws.services.ec2.model.ImportSnapshotResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ImportSnapshotRequest request]
    (-> this (.importSnapshot request)))
  (^com.amazonaws.services.ec2.model.ImportSnapshotResult [^AmazonEC2Client this]
    (-> this (.importSnapshot))))

(defn run-instances
  "Launches the specified number of instances using an AMI for which you have permissions.


   You can specify a number of options, or leave the default options. The following rules apply:




   [EC2-VPC] If you don't specify a subnet ID, we choose a default subnet from your default VPC for you. If you
   don't have a default VPC, you must specify a subnet ID in the request.




   [EC2-Classic] If don't specify an Availability Zone, we choose one for you.




   Some instance types must be launched into a VPC. If you do not have a default VPC, or if you do not specify a
   subnet ID, the request fails. For more information, see Instance Types
   Available Only in a VPC.




   [EC2-VPC] All instances have a network interface with a primary private IPv4 address. If you don't specify this
   address, we choose one from the IPv4 range of your subnet.




   Not all instance types support IPv6 addresses. For more information, see Instance Types.




   If you don't specify a security group ID, we use the default security group. For more information, see Security Groups.




   If any of the AMIs have a product code attached for which the user has not subscribed, the request fails.




   You can create a launch
   template, which is a resource that contains the parameters to launch an instance. When you launch an instance
   using RunInstances, you can specify the launch template instead of specifying the launch parameters.


   To ensure faster instance launches, break up large requests into smaller batches. For example, create five
   separate launch requests for 100 instances each instead of one launch request for 500 instances.


   An instance is ready for you to use when it's in the running state. You can check the state of your
   instance using DescribeInstances. You can tag instances and EBS volumes during launch, after launch, or
   both. For more information, see CreateTags and Tagging Your Amazon EC2 Resources.


   Linux instances have access to the public key of the key pair at boot. You can use this key to provide secure
   access to the instance. Amazon EC2 public images use this feature to provide secure access without passwords. For
   more information, see Key
   Pairs in the Amazon Elastic Compute Cloud User Guide.


   For troubleshooting, see What To Do If
   An Instance Immediately Terminates, and Troubleshooting Connecting to Your Instance in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.RunInstancesRequest`

  returns: Result of the RunInstances operation returned by the service. - `com.amazonaws.services.ec2.model.RunInstancesResult`"
  (^com.amazonaws.services.ec2.model.RunInstancesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.RunInstancesRequest request]
    (-> this (.runInstances request))))

(defn describe-network-acls
  "Describes one or more of your network ACLs.


   For more information, see Network
   ACLs in the Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeNetworkAclsRequest`

  returns: Result of the DescribeNetworkAcls operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeNetworkAclsResult`"
  (^com.amazonaws.services.ec2.model.DescribeNetworkAclsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeNetworkAclsRequest request]
    (-> this (.describeNetworkAcls request)))
  (^com.amazonaws.services.ec2.model.DescribeNetworkAclsResult [^AmazonEC2Client this]
    (-> this (.describeNetworkAcls))))

(defn modify-image-attribute
  "Modifies the specified attribute of the specified AMI. You can specify only one attribute at a time. You can use
   the Attribute parameter to specify the attribute or one of the following parameters:
   Description, LaunchPermission, or ProductCode.


   AWS Marketplace product codes cannot be modified. Images with an AWS Marketplace product code cannot be made
   public.


   To enable the SriovNetSupport enhanced networking attribute of an image, enable SriovNetSupport on an instance
   and create an AMI from the instance.

  request - `com.amazonaws.services.ec2.model.ModifyImageAttributeRequest`

  returns: Result of the ModifyImageAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyImageAttributeResult`"
  (^com.amazonaws.services.ec2.model.ModifyImageAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyImageAttributeRequest request]
    (-> this (.modifyImageAttribute request))))

(defn describe-spot-datafeed-subscription
  "Describes the data feed for Spot Instances. For more information, see Spot Instance Data Feed in
   the Amazon EC2 User Guide for Linux Instances.

  request - `com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionRequest`

  returns: Result of the DescribeSpotDatafeedSubscription operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionResult`"
  (^com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionRequest request]
    (-> this (.describeSpotDatafeedSubscription request)))
  (^com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionResult [^AmazonEC2Client this]
    (-> this (.describeSpotDatafeedSubscription))))

(defn describe-nat-gateways
  "Describes one or more of your NAT gateways.

  request - `com.amazonaws.services.ec2.model.DescribeNatGatewaysRequest`

  returns: Result of the DescribeNatGateways operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeNatGatewaysResult`"
  (^com.amazonaws.services.ec2.model.DescribeNatGatewaysResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeNatGatewaysRequest request]
    (-> this (.describeNatGateways request))))

(defn create-flow-logs
  "Creates one or more flow logs to capture information about IP traffic for a specific network interface, subnet,
   or VPC.


   Flow log data for a monitored network interface is recorded as flow log records, which are log events consisting
   of fields that describe the traffic flow. For more information, see Flow Log Records in
   the Amazon Virtual Private Cloud User Guide.


   When publishing to CloudWatch Logs, flow log records are published to a log group, and each network interface has
   a unique log stream in the log group. When publishing to Amazon S3, flow log records for all of the monitored
   network interfaces are published to a single log file object that is stored in the specified bucket.


   For more information, see VPC Flow
   Logs in the Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateFlowLogsRequest`

  returns: Result of the CreateFlowLogs operation returned by the service. - `com.amazonaws.services.ec2.model.CreateFlowLogsResult`"
  (^com.amazonaws.services.ec2.model.CreateFlowLogsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateFlowLogsRequest request]
    (-> this (.createFlowLogs request))))

(defn describe-volumes
  "Describes the specified EBS volumes or all of your EBS volumes.


   If you are describing a long list of volumes, you can paginate the output to make the list more manageable. The
   MaxResults parameter sets the maximum number of results returned in a single page. If the list of
   results exceeds your MaxResults value, then that number of results is returned along with a
   NextToken value that can be passed to a subsequent DescribeVolumes request to retrieve
   the remaining results.


   For more information about EBS volumes, see Amazon EBS Volumes in the
   Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeVolumesRequest`

  returns: Result of the DescribeVolumes operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVolumesResult`"
  (^com.amazonaws.services.ec2.model.DescribeVolumesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeVolumesRequest request]
    (-> this (.describeVolumes request)))
  (^com.amazonaws.services.ec2.model.DescribeVolumesResult [^AmazonEC2Client this]
    (-> this (.describeVolumes))))

(defn get-transit-gateway-attachment-propagations
  "Lists the route tables to which the specified resource attachment propagates routes.

  request - `com.amazonaws.services.ec2.model.GetTransitGatewayAttachmentPropagationsRequest`

  returns: Result of the GetTransitGatewayAttachmentPropagations operation returned by the service. - `com.amazonaws.services.ec2.model.GetTransitGatewayAttachmentPropagationsResult`"
  (^com.amazonaws.services.ec2.model.GetTransitGatewayAttachmentPropagationsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.GetTransitGatewayAttachmentPropagationsRequest request]
    (-> this (.getTransitGatewayAttachmentPropagations request))))

(defn request-spot-fleet
  "Creates a Spot Fleet request.


   The Spot Fleet request specifies the total target capacity and the On-Demand target capacity. Amazon EC2
   calculates the difference between the total capacity and On-Demand capacity, and launches the difference as Spot
   capacity.


   You can submit a single request that includes multiple launch specifications that vary by instance type, AMI,
   Availability Zone, or subnet.


   By default, the Spot Fleet requests Spot Instances in the Spot pool where the price per unit is the lowest. Each
   launch specification can include its own instance weighting that reflects the value of the instance type to your
   application workload.


   Alternatively, you can specify that the Spot Fleet distribute the target capacity across the Spot pools included
   in its launch specifications. By ensuring that the Spot Instances in your Spot Fleet are in different Spot pools,
   you can improve the availability of your fleet.


   You can specify tags for the Spot Instances. You cannot tag other resource types in a Spot Fleet request because
   only the instance resource type is supported.


   For more information, see Spot Fleet Requests in
   the Amazon EC2 User Guide for Linux Instances.

  request - `com.amazonaws.services.ec2.model.RequestSpotFleetRequest`

  returns: Result of the RequestSpotFleet operation returned by the service. - `com.amazonaws.services.ec2.model.RequestSpotFleetResult`"
  (^com.amazonaws.services.ec2.model.RequestSpotFleetResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.RequestSpotFleetRequest request]
    (-> this (.requestSpotFleet request))))

(defn describe-network-interfaces
  "Describes one or more of your network interfaces.

  request - `com.amazonaws.services.ec2.model.DescribeNetworkInterfacesRequest`

  returns: Result of the DescribeNetworkInterfaces operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeNetworkInterfacesResult`"
  (^com.amazonaws.services.ec2.model.DescribeNetworkInterfacesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeNetworkInterfacesRequest request]
    (-> this (.describeNetworkInterfaces request)))
  (^com.amazonaws.services.ec2.model.DescribeNetworkInterfacesResult [^AmazonEC2Client this]
    (-> this (.describeNetworkInterfaces))))

(defn modify-volume
  "You can modify several parameters of an existing EBS volume, including volume size, volume type, and IOPS
   capacity. If your EBS volume is attached to a current-generation EC2 instance type, you may be able to apply
   these changes without stopping the instance or detaching the volume from it. For more information about modifying
   an EBS volume running Linux, see Modifying the Size, IOPS, or
   Type of an EBS Volume on Linux. For more information about modifying an EBS volume running Windows, see Modifying the Size, IOPS, or
   Type of an EBS Volume on Windows.


   When you complete a resize operation on your volume, you need to extend the volume's file-system size to take
   advantage of the new storage capacity. For information about extending a Linux file system, see Extending a Linux File System. For information about extending a Windows file system, see Extending a Windows File System.


   You can use CloudWatch Events to check the status of a modification to an EBS volume. For information about
   CloudWatch Events, see the Amazon
   CloudWatch Events User Guide. You can also track the status of a modification using
   DescribeVolumesModifications. For information about tracking status changes using either method, see Monitoring
   Volume Modifications.


   With previous-generation instance types, resizing an EBS volume may require detaching and reattaching the volume
   or stopping and restarting the instance. For more information, see Modifying the Size, IOPS, or
   Type of an EBS Volume on Linux and Modifying the Size, IOPS, or
   Type of an EBS Volume on Windows.


   If you reach the maximum volume modification rate per volume limit, you will need to wait at least six hours
   before applying further modifications to the affected EBS volume.

  request - `com.amazonaws.services.ec2.model.ModifyVolumeRequest`

  returns: Result of the ModifyVolume operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVolumeResult`"
  (^com.amazonaws.services.ec2.model.ModifyVolumeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyVolumeRequest request]
    (-> this (.modifyVolume request))))

(defn create-client-vpn-route
  "Adds a route to a network to a Client VPN endpoint. Each Client VPN endpoint has a route table that describes the
   available destination network routes. Each route in the route table specifies the path for traﬃc to speciﬁc
   resources or networks.

  request - `com.amazonaws.services.ec2.model.CreateClientVpnRouteRequest`

  returns: Result of the CreateClientVpnRoute operation returned by the service. - `com.amazonaws.services.ec2.model.CreateClientVpnRouteResult`"
  (^com.amazonaws.services.ec2.model.CreateClientVpnRouteResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateClientVpnRouteRequest request]
    (-> this (.createClientVpnRoute request))))

(defn describe-spot-fleet-requests
  "Describes your Spot Fleet requests.


   Spot Fleet requests are deleted 48 hours after they are canceled and their instances are terminated.

  request - `com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsRequest`

  returns: Result of the DescribeSpotFleetRequests operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsResult`"
  (^com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsRequest request]
    (-> this (.describeSpotFleetRequests request)))
  (^com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsResult [^AmazonEC2Client this]
    (-> this (.describeSpotFleetRequests))))

(defn describe-instance-attribute
  "Describes the specified attribute of the specified instance. You can specify only one attribute at a time. Valid
   attribute values are: instanceType | kernel | ramdisk |
   userData | disableApiTermination | instanceInitiatedShutdownBehavior |
   rootDeviceName | blockDeviceMapping | productCodes |
   sourceDestCheck | groupSet | ebsOptimized | sriovNetSupport

  request - `com.amazonaws.services.ec2.model.DescribeInstanceAttributeRequest`

  returns: Result of the DescribeInstanceAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeInstanceAttributeResult`"
  (^com.amazonaws.services.ec2.model.DescribeInstanceAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeInstanceAttributeRequest request]
    (-> this (.describeInstanceAttribute request))))

(defn waiters
  "returns: `com.amazonaws.services.ec2.waiters.AmazonEC2Waiters`"
  (^com.amazonaws.services.ec2.waiters.AmazonEC2Waiters [^AmazonEC2Client this]
    (-> this (.waiters))))

(defn modify-traffic-mirror-filter-network-services
  "Allows or restricts mirroring network services.


   By default, Amazon DNS network services are not eligible for Traffic Mirror. Use AddNetworkServices
   to add network services to a Traffic Mirror filter. When a network service is added to the Traffic Mirror filter,
   all traffic related to that network service will be mirrored. When you no longer want to mirror network services,
   use RemoveNetworkServices to remove the network services from the Traffic Mirror filter.


   FFor information about filter rule properties, see Network Services in the Traffic Mirroring User Guide .

  request - `com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesRequest`

  returns: Result of the ModifyTrafficMirrorFilterNetworkServices operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesResult`"
  (^com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesRequest request]
    (-> this (.modifyTrafficMirrorFilterNetworkServices request))))

(defn replace-route-table-association
  "Changes the route table associated with a given subnet in a VPC. After the operation completes, the subnet uses
   the routes in the new route table it's associated with. For more information about route tables, see Route Tables in the Amazon
   Virtual Private Cloud User Guide.


   You can also use ReplaceRouteTableAssociation to change which table is the main route table in the VPC. You just
   specify the main route table's association ID and the route table to be the new main route table.

  request - `com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationRequest`

  returns: Result of the ReplaceRouteTableAssociation operation returned by the service. - `com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationResult`"
  (^com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationRequest request]
    (-> this (.replaceRouteTableAssociation request))))

(defn accept-reserved-instances-exchange-quote
  "Accepts the Convertible Reserved Instance exchange quote described in the
   GetReservedInstancesExchangeQuote call.

  request - `com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteRequest`

  returns: Result of the AcceptReservedInstancesExchangeQuote operation returned by the service. - `com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteResult`"
  (^com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteRequest request]
    (-> this (.acceptReservedInstancesExchangeQuote request))))

(defn delete-vpc-endpoints
  "Deletes one or more specified VPC endpoints. Deleting a gateway endpoint also deletes the endpoint routes in the
   route tables that were associated with the endpoint. Deleting an interface endpoint deletes the endpoint network
   interfaces.

  request - `com.amazonaws.services.ec2.model.DeleteVpcEndpointsRequest`

  returns: Result of the DeleteVpcEndpoints operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteVpcEndpointsResult`"
  (^com.amazonaws.services.ec2.model.DeleteVpcEndpointsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteVpcEndpointsRequest request]
    (-> this (.deleteVpcEndpoints request))))

(defn search-transit-gateway-routes
  "Searches for routes in the specified transit gateway route table.

  request - `com.amazonaws.services.ec2.model.SearchTransitGatewayRoutesRequest`

  returns: Result of the SearchTransitGatewayRoutes operation returned by the service. - `com.amazonaws.services.ec2.model.SearchTransitGatewayRoutesResult`"
  (^com.amazonaws.services.ec2.model.SearchTransitGatewayRoutesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.SearchTransitGatewayRoutesRequest request]
    (-> this (.searchTransitGatewayRoutes request))))

(defn create-reserved-instances-listing
  "Creates a listing for Amazon EC2 Standard Reserved Instances to be sold in the Reserved Instance Marketplace. You
   can submit one Standard Reserved Instance listing at a time. To get a list of your Standard Reserved Instances,
   you can use the DescribeReservedInstances operation.



   Only Standard Reserved Instances can be sold in the Reserved Instance Marketplace. Convertible Reserved Instances
   cannot be sold.



   The Reserved Instance Marketplace matches sellers who want to resell Standard Reserved Instance capacity that
   they no longer need with buyers who want to purchase additional capacity. Reserved Instances bought and sold
   through the Reserved Instance Marketplace work like any other Reserved Instances.


   To sell your Standard Reserved Instances, you must first register as a seller in the Reserved Instance
   Marketplace. After completing the registration process, you can create a Reserved Instance Marketplace listing of
   some or all of your Standard Reserved Instances, and specify the upfront price to receive for them. Your Standard
   Reserved Instance listings then become available for purchase. To view the details of your Standard Reserved
   Instance listing, you can use the DescribeReservedInstancesListings operation.


   For more information, see Reserved Instance
   Marketplace in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateReservedInstancesListingRequest`

  returns: Result of the CreateReservedInstancesListing operation returned by the service. - `com.amazonaws.services.ec2.model.CreateReservedInstancesListingResult`"
  (^com.amazonaws.services.ec2.model.CreateReservedInstancesListingResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateReservedInstancesListingRequest request]
    (-> this (.createReservedInstancesListing request))))

(defn cancel-conversion-task
  "Cancels an active conversion task. The task can be the import of an instance or volume. The action removes all
   artifacts of the conversion, including a partially uploaded volume or instance. If the conversion is complete or
   is in the process of transferring the final disk image, the command fails and returns an exception.


   For more information, see Importing a
   Virtual Machine Using the Amazon EC2 CLI.

  request - `com.amazonaws.services.ec2.model.CancelConversionTaskRequest`

  returns: Result of the CancelConversionTask operation returned by the service. - `com.amazonaws.services.ec2.model.CancelConversionTaskResult`"
  (^com.amazonaws.services.ec2.model.CancelConversionTaskResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CancelConversionTaskRequest request]
    (-> this (.cancelConversionTask request))))

(defn accept-vpc-endpoint-connections
  "Accepts one or more interface VPC endpoint connection requests to your VPC endpoint service.

  request - `com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsRequest`

  returns: Result of the AcceptVpcEndpointConnections operation returned by the service. - `com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsResult`"
  (^com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsRequest request]
    (-> this (.acceptVpcEndpointConnections request))))

(defn describe-vpc-peering-connections
  "Describes one or more of your VPC peering connections.

  request - `com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsRequest`

  returns: Result of the DescribeVpcPeeringConnections operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsRequest request]
    (-> this (.describeVpcPeeringConnections request)))
  (^com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsResult [^AmazonEC2Client this]
    (-> this (.describeVpcPeeringConnections))))

(defn create-transit-gateway
  "Creates a transit gateway.


   You can use a transit gateway to interconnect your virtual private clouds (VPC) and on-premises networks. After
   the transit gateway enters the available state, you can attach your VPCs and VPN connections to the
   transit gateway.


   To attach your VPCs, use CreateTransitGatewayVpcAttachment.


   To attach a VPN connection, use CreateCustomerGateway to create a customer gateway and specify the ID of
   the customer gateway and the ID of the transit gateway in a call to CreateVpnConnection.


   When you create a transit gateway, we create a default transit gateway route table and use it as the default
   association route table and the default propagation route table. You can use
   CreateTransitGatewayRouteTable to create additional transit gateway route tables. If you disable automatic
   route propagation, we do not create a default transit gateway route table. You can use
   EnableTransitGatewayRouteTablePropagation to propagate routes from a resource attachment to a transit
   gateway route table. If you disable automatic associations, you can use AssociateTransitGatewayRouteTable
   to associate a resource attachment with a transit gateway route table.

  request - `com.amazonaws.services.ec2.model.CreateTransitGatewayRequest`

  returns: Result of the CreateTransitGateway operation returned by the service. - `com.amazonaws.services.ec2.model.CreateTransitGatewayResult`"
  (^com.amazonaws.services.ec2.model.CreateTransitGatewayResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateTransitGatewayRequest request]
    (-> this (.createTransitGateway request))))

(defn describe-key-pairs
  "Describes the specified key pairs or all of your key pairs.


   For more information about key pairs, see Key Pairs in the Amazon
   Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeKeyPairsRequest`

  returns: Result of the DescribeKeyPairs operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeKeyPairsResult`"
  (^com.amazonaws.services.ec2.model.DescribeKeyPairsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeKeyPairsRequest request]
    (-> this (.describeKeyPairs request)))
  (^com.amazonaws.services.ec2.model.DescribeKeyPairsResult [^AmazonEC2Client this]
    (-> this (.describeKeyPairs))))

(defn enable-ebs-encryption-by-default
  "Enables EBS encryption by default for your account in the current Region.


   After you enable encryption by default, the EBS volumes that you create are are always encrypted, either using
   the default CMK or the CMK that you specified when you created each volume. For more information, see Amazon EBS Encryption in the
   Amazon Elastic Compute Cloud User Guide.


   You can specify the default CMK for encryption by default using ModifyEbsDefaultKmsKeyId or
   ResetEbsDefaultKmsKeyId.


   Enabling encryption by default has no effect on the encryption status of your existing volumes.


   After you enable encryption by default, you can no longer launch instances using instance types that do not
   support encryption. For more information, see Supported Instance Types.

  request - `com.amazonaws.services.ec2.model.EnableEbsEncryptionByDefaultRequest`

  returns: Result of the EnableEbsEncryptionByDefault operation returned by the service. - `com.amazonaws.services.ec2.model.EnableEbsEncryptionByDefaultResult`"
  (^com.amazonaws.services.ec2.model.EnableEbsEncryptionByDefaultResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.EnableEbsEncryptionByDefaultRequest request]
    (-> this (.enableEbsEncryptionByDefault request))))

(defn assign-private-ip-addresses
  "Assigns one or more secondary private IP addresses to the specified network interface.


   You can specify one or more specific secondary IP addresses, or you can specify the number of secondary IP
   addresses to be automatically assigned within the subnet's CIDR block range. The number of secondary IP addresses
   that you can assign to an instance varies by instance type. For information about instance types, see Instance Types in the
   Amazon Elastic Compute Cloud User Guide. For more information about Elastic IP addresses, see Elastic IP Addresses
   in the Amazon Elastic Compute Cloud User Guide.


   When you move a secondary private IP address to another network interface, any Elastic IP address that is
   associated with the IP address is also moved.


   Remapping an IP address is an asynchronous operation. When you move an IP address from one network interface to
   another, check network/interfaces/macs/mac/local-ipv4s in the instance metadata to confirm that the
   remapping is complete.

  request - `com.amazonaws.services.ec2.model.AssignPrivateIpAddressesRequest`

  returns: Result of the AssignPrivateIpAddresses operation returned by the service. - `com.amazonaws.services.ec2.model.AssignPrivateIpAddressesResult`"
  (^com.amazonaws.services.ec2.model.AssignPrivateIpAddressesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AssignPrivateIpAddressesRequest request]
    (-> this (.assignPrivateIpAddresses request))))

(defn describe-identity-id-format
  "Describes the ID format settings for resources for the specified IAM user, IAM role, or root user. For example,
   you can view the resource types that are enabled for longer IDs. This request only returns information about
   resource types whose ID formats can be modified; it does not return information about other resource types. For
   more information, see Resource
   IDs in the Amazon Elastic Compute Cloud User Guide.


   The following resource types support longer IDs: bundle | conversion-task |
   customer-gateway | dhcp-options | elastic-ip-allocation |
   elastic-ip-association | export-task | flow-log | image |
   import-task | instance | internet-gateway | network-acl |
   network-acl-association | network-interface | network-interface-attachment
   | prefix-list | reservation | route-table |
   route-table-association | security-group | snapshot | subnet
   | subnet-cidr-block-association | volume | vpc |
   vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection |
   vpn-connection | vpn-gateway.


   These settings apply to the principal specified in the request. They do not apply to the principal that makes the
   request.

  request - `com.amazonaws.services.ec2.model.DescribeIdentityIdFormatRequest`

  returns: Result of the DescribeIdentityIdFormat operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeIdentityIdFormatResult`"
  (^com.amazonaws.services.ec2.model.DescribeIdentityIdFormatResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeIdentityIdFormatRequest request]
    (-> this (.describeIdentityIdFormat request))))

(defn delete-spot-datafeed-subscription
  "Deletes the data feed for Spot Instances.

  request - `com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionRequest`

  returns: Result of the DeleteSpotDatafeedSubscription operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionResult`"
  (^com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionRequest request]
    (-> this (.deleteSpotDatafeedSubscription request)))
  (^com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionResult [^AmazonEC2Client this]
    (-> this (.deleteSpotDatafeedSubscription))))

(defn describe-reserved-instances-offerings
  "Describes Reserved Instance offerings that are available for purchase. With Reserved Instances, you purchase the
   right to launch instances for a period of time. During that time period, you do not receive insufficient capacity
   errors, and you pay a lower usage rate than the rate charged for On-Demand instances for the actual time used.


   If you have listed your own Reserved Instances for sale in the Reserved Instance Marketplace, they will be
   excluded from these results. This is to ensure that you do not purchase your own Reserved Instances.


   For more information, see Reserved Instance
   Marketplace in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsRequest`

  returns: Result of the DescribeReservedInstancesOfferings operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsResult`"
  (^com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsRequest request]
    (-> this (.describeReservedInstancesOfferings request)))
  (^com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsResult [^AmazonEC2Client this]
    (-> this (.describeReservedInstancesOfferings))))

(defn modify-snapshot-attribute
  "Adds or removes permission settings for the specified snapshot. You may add or remove specified AWS account IDs
   from a snapshot's list of create volume permissions, but you cannot do both in a single operation. If you need to
   both add and remove account IDs for a snapshot, you must use multiple operations.


   Encrypted snapshots and snapshots with AWS Marketplace product codes cannot be made public. Snapshots encrypted
   with your default CMK cannot be shared with other accounts.


   For more information about modifying snapshot permissions, see Sharing
   Snapshots in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.ModifySnapshotAttributeRequest`

  returns: Result of the ModifySnapshotAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ModifySnapshotAttributeResult`"
  (^com.amazonaws.services.ec2.model.ModifySnapshotAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifySnapshotAttributeRequest request]
    (-> this (.modifySnapshotAttribute request))))

(defn delete-client-vpn-route
  "Deletes a route from a Client VPN endpoint. You can only delete routes that you manually added using the
   CreateClientVpnRoute action. You cannot delete routes that were automatically added when associating a
   subnet. To remove routes that have been automatically added, disassociate the target subnet from the Client VPN
   endpoint.

  request - `com.amazonaws.services.ec2.model.DeleteClientVpnRouteRequest`

  returns: Result of the DeleteClientVpnRoute operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteClientVpnRouteResult`"
  (^com.amazonaws.services.ec2.model.DeleteClientVpnRouteResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteClientVpnRouteRequest request]
    (-> this (.deleteClientVpnRoute request))))

(defn modify-transit-gateway-vpc-attachment
  "Modifies the specified VPC attachment.

  request - `com.amazonaws.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequest`

  returns: Result of the ModifyTransitGatewayVpcAttachment operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyTransitGatewayVpcAttachmentResult`"
  (^com.amazonaws.services.ec2.model.ModifyTransitGatewayVpcAttachmentResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequest request]
    (-> this (.modifyTransitGatewayVpcAttachment request))))

(defn modify-vpc-endpoint
  "Modifies attributes of a specified VPC endpoint. The attributes that you can modify depend on the type of VPC
   endpoint (interface or gateway). For more information, see VPC Endpoints in the Amazon
   Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.ModifyVpcEndpointRequest`

  returns: Result of the ModifyVpcEndpoint operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVpcEndpointResult`"
  (^com.amazonaws.services.ec2.model.ModifyVpcEndpointResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointRequest request]
    (-> this (.modifyVpcEndpoint request))))

(defn detach-internet-gateway
  "Detaches an internet gateway from a VPC, disabling connectivity between the internet and the VPC. The VPC must
   not contain any running instances with Elastic IP addresses or public IPv4 addresses.

  request - `com.amazonaws.services.ec2.model.DetachInternetGatewayRequest`

  returns: Result of the DetachInternetGateway operation returned by the service. - `com.amazonaws.services.ec2.model.DetachInternetGatewayResult`"
  (^com.amazonaws.services.ec2.model.DetachInternetGatewayResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DetachInternetGatewayRequest request]
    (-> this (.detachInternetGateway request))))

(defn describe-addresses
  "Describes the specified Elastic IP addresses or all of your Elastic IP addresses.


   An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see Elastic IP Addresses
   in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeAddressesRequest`

  returns: Result of the DescribeAddresses operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeAddressesResult`"
  (^com.amazonaws.services.ec2.model.DescribeAddressesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeAddressesRequest request]
    (-> this (.describeAddresses request)))
  (^com.amazonaws.services.ec2.model.DescribeAddressesResult [^AmazonEC2Client this]
    (-> this (.describeAddresses))))

(defn copy-snapshot
  "Copies a point-in-time snapshot of an EBS volume and stores it in Amazon S3. You can copy the snapshot within the
   same Region or from one Region to another. You can use the snapshot to create EBS volumes or Amazon Machine
   Images (AMIs).


   Copies of encrypted EBS snapshots remain encrypted. Copies of unencrypted snapshots remain unencrypted, unless
   you enable encryption for the snapshot copy operation. By default, encrypted snapshot copies use the default AWS
   Key Management Service (AWS KMS) customer master key (CMK); however, you can specify a different CMK.


   To copy an encrypted snapshot that has been shared from another account, you must have permissions for the CMK
   used to encrypt the snapshot.


   Snapshots created by copying another snapshot have an arbitrary volume ID that should not be used for any
   purpose.


   For more information, see Copying an Amazon EBS
   Snapshot in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CopySnapshotRequest`

  returns: Result of the CopySnapshot operation returned by the service. - `com.amazonaws.services.ec2.model.CopySnapshotResult`"
  (^com.amazonaws.services.ec2.model.CopySnapshotResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CopySnapshotRequest request]
    (-> this (.copySnapshot request))))

(defn release-address
  "Releases the specified Elastic IP address.


   [EC2-Classic, default VPC] Releasing an Elastic IP address automatically disassociates it from any instance that
   it's associated with. To disassociate an Elastic IP address without releasing it, use DisassociateAddress.


   [Nondefault VPC] You must use DisassociateAddress to disassociate the Elastic IP address before you can
   release it. Otherwise, Amazon EC2 returns an error (InvalidIPAddress.InUse).


   After releasing an Elastic IP address, it is released to the IP address pool. Be sure to update your DNS records
   and any servers or devices that communicate with the address. If you attempt to release an Elastic IP address
   that you already released, you'll get an AuthFailure error if the address is already allocated to
   another AWS account.


   [EC2-VPC] After you release an Elastic IP address for use in a VPC, you might be able to recover it. For more
   information, see AllocateAddress.

  request - `com.amazonaws.services.ec2.model.ReleaseAddressRequest`

  returns: Result of the ReleaseAddress operation returned by the service. - `com.amazonaws.services.ec2.model.ReleaseAddressResult`"
  (^com.amazonaws.services.ec2.model.ReleaseAddressResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ReleaseAddressRequest request]
    (-> this (.releaseAddress request))))

(defn delete-volume
  "Deletes the specified EBS volume. The volume must be in the available state (not attached to an
   instance).


   The volume can remain in the deleting state for several minutes.


   For more information, see Deleting an Amazon EBS
   Volume in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DeleteVolumeRequest`

  returns: Result of the DeleteVolume operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteVolumeResult`"
  (^com.amazonaws.services.ec2.model.DeleteVolumeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteVolumeRequest request]
    (-> this (.deleteVolume request))))

(defn create-vpn-connection
  "Creates a VPN connection between an existing virtual private gateway and a VPN customer gateway. The supported
   connection types is ipsec.1.


   The response includes information that you need to give to your network administrator to configure your customer
   gateway.



   We strongly recommend that you use HTTPS when calling this operation because the response contains sensitive
   cryptographic information for configuring your customer gateway.



   If you decide to shut down your VPN connection for any reason and later create a new VPN connection, you must
   reconfigure your customer gateway with the new information returned from this call.


   This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error.


   For more information, see AWS Site-to-Site
   VPN in the AWS Site-to-Site VPN User Guide.

  request - `com.amazonaws.services.ec2.model.CreateVpnConnectionRequest`

  returns: Result of the CreateVpnConnection operation returned by the service. - `com.amazonaws.services.ec2.model.CreateVpnConnectionResult`"
  (^com.amazonaws.services.ec2.model.CreateVpnConnectionResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateVpnConnectionRequest request]
    (-> this (.createVpnConnection request))))

(defn describe-prefix-lists
  "Describes available AWS services in a prefix list format, which includes the prefix list name and prefix list ID
   of the service and the IP address range for the service. A prefix list ID is required for creating an outbound
   security group rule that allows traffic from a VPC to access an AWS service through a gateway VPC endpoint.
   Currently, the services that support this action are Amazon S3 and Amazon DynamoDB.

  request - `com.amazonaws.services.ec2.model.DescribePrefixListsRequest`

  returns: Result of the DescribePrefixLists operation returned by the service. - `com.amazonaws.services.ec2.model.DescribePrefixListsResult`"
  (^com.amazonaws.services.ec2.model.DescribePrefixListsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribePrefixListsRequest request]
    (-> this (.describePrefixLists request)))
  (^com.amazonaws.services.ec2.model.DescribePrefixListsResult [^AmazonEC2Client this]
    (-> this (.describePrefixLists))))

(defn modify-fpga-image-attribute
  "Modifies the specified attribute of the specified Amazon FPGA Image (AFI).

  request - `com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeRequest`

  returns: Result of the ModifyFpgaImageAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeResult`"
  (^com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeRequest request]
    (-> this (.modifyFpgaImageAttribute request))))

(defn disable-vpc-classic-link-dns-support
  "Disables ClassicLink DNS support for a VPC. If disabled, DNS hostnames resolve to public IP addresses when
   addressed between a linked EC2-Classic instance and instances in the VPC to which it's linked. For more
   information, see ClassicLink in the Amazon
   Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportRequest`

  returns: Result of the DisableVpcClassicLinkDnsSupport operation returned by the service. - `com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportResult`"
  (^com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportRequest request]
    (-> this (.disableVpcClassicLinkDnsSupport request))))

(defn describe-reserved-instances-listings
  "Describes your account's Reserved Instance listings in the Reserved Instance Marketplace.


   The Reserved Instance Marketplace matches sellers who want to resell Reserved Instance capacity that they no
   longer need with buyers who want to purchase additional capacity. Reserved Instances bought and sold through the
   Reserved Instance Marketplace work like any other Reserved Instances.


   As a seller, you choose to list some or all of your Reserved Instances, and you specify the upfront price to
   receive for them. Your Reserved Instances are then listed in the Reserved Instance Marketplace and are available
   for purchase.


   As a buyer, you specify the configuration of the Reserved Instance to purchase, and the Marketplace matches what
   you're searching for with what's available. The Marketplace first sells the lowest priced Reserved Instances to
   you, and continues to sell available Reserved Instance listings to you until your demand is met. You are charged
   based on the total price of all of the listings that you purchase.


   For more information, see Reserved Instance
   Marketplace in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsRequest`

  returns: Result of the DescribeReservedInstancesListings operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsResult`"
  (^com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsRequest request]
    (-> this (.describeReservedInstancesListings request)))
  (^com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsResult [^AmazonEC2Client this]
    (-> this (.describeReservedInstancesListings))))

(defn describe-byoip-cidrs
  "Describes the IP address ranges that were specified in calls to ProvisionByoipCidr.


   To describe the address pools that were created when you provisioned the address ranges, use
   DescribePublicIpv4Pools.

  request - `com.amazonaws.services.ec2.model.DescribeByoipCidrsRequest`

  returns: Result of the DescribeByoipCidrs operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeByoipCidrsResult`"
  (^com.amazonaws.services.ec2.model.DescribeByoipCidrsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeByoipCidrsRequest request]
    (-> this (.describeByoipCidrs request))))

(defn modify-network-interface-attribute
  "Modifies the specified network interface attribute. You can specify only one attribute at a time. You can use
   this action to attach and detach security groups from an existing EC2 instance.

  request - `com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeRequest`

  returns: Result of the ModifyNetworkInterfaceAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeResult`"
  (^com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeRequest request]
    (-> this (.modifyNetworkInterfaceAttribute request))))

(defn describe-vpc-endpoint-connection-notifications
  "Describes the connection notifications for VPC endpoints and VPC endpoint services.

  request - `com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsRequest`

  returns: Result of the DescribeVpcEndpointConnectionNotifications operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsRequest request]
    (-> this (.describeVpcEndpointConnectionNotifications request))))

(defn delete-fpga-image
  "Deletes the specified Amazon FPGA Image (AFI).

  request - `com.amazonaws.services.ec2.model.DeleteFpgaImageRequest`

  returns: Result of the DeleteFpgaImage operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteFpgaImageResult`"
  (^com.amazonaws.services.ec2.model.DeleteFpgaImageResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteFpgaImageRequest request]
    (-> this (.deleteFpgaImage request))))

(defn create-vpc-endpoint-connection-notification
  "Creates a connection notification for a specified VPC endpoint or VPC endpoint service. A connection notification
   notifies you of specific endpoint events. You must create an SNS topic to receive notifications. For more
   information, see Create a Topic in the
   Amazon Simple Notification Service Developer Guide.


   You can create a connection notification for interface endpoints only.

  request - `com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationRequest`

  returns: Result of the CreateVpcEndpointConnectionNotification operation returned by the service. - `com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationResult`"
  (^com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationRequest request]
    (-> this (.createVpcEndpointConnectionNotification request))))

(defn describe-iam-instance-profile-associations
  "Describes your IAM instance profile associations.

  request - `com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsRequest`

  returns: Result of the DescribeIamInstanceProfileAssociations operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsResult`"
  (^com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsRequest request]
    (-> this (.describeIamInstanceProfileAssociations request))))

(defn modify-vpn-connection
  "Modifies the target gateway of a AWS Site-to-Site VPN connection. The following migration options are available:




   An existing virtual private gateway to a new virtual private gateway




   An existing virtual private gateway to a transit gateway




   An existing transit gateway to a new transit gateway




   An existing transit gateway to a virtual private gateway




   Before you perform the migration to the new gateway, you must configure the new gateway. Use
   CreateVpnGateway to create a virtual private gateway, or CreateTransitGateway to create a transit
   gateway.


   This step is required when you migrate from a virtual private gateway with static routes to a transit gateway.


   You must delete the static routes before you migrate to the new gateway.


   Keep a copy of the static route before you delete it. You will need to add back these routes to the transit
   gateway after the VPN connection migration is complete.


   After you migrate to the new gateway, you might need to modify your VPC route table. Use CreateRoute and
   DeleteRoute to make the changes described in VPN Gateway
   Target Modification Required VPC Route Table Updates in the AWS Site-to-Site VPN User Guide.


   When the new gateway is a transit gateway, modify the transit gateway route table to allow traffic between the
   VPC and the AWS Site-to-Site VPN connection. Use CreateTransitGatewayRoute to add the routes.


   If you deleted VPN static routes, you must add the static routes to the transit gateway route table.


   After you perform this operation, the AWS VPN endpoint's IP addresses on the AWS side and the tunnel options
   remain intact. Your s2slong; connection will be temporarily unavailable for approximately 10 minutes while we
   provision the new endpoints

  request - `com.amazonaws.services.ec2.model.ModifyVpnConnectionRequest`

  returns: Result of the ModifyVpnConnection operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVpnConnectionResult`"
  (^com.amazonaws.services.ec2.model.ModifyVpnConnectionResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyVpnConnectionRequest request]
    (-> this (.modifyVpnConnection request))))

(defn create-launch-template
  "Creates a launch template. A launch template contains the parameters to launch an instance. When you launch an
   instance using RunInstances, you can specify a launch template instead of providing the launch parameters
   in the request.

  request - `com.amazonaws.services.ec2.model.CreateLaunchTemplateRequest`

  returns: Result of the CreateLaunchTemplate operation returned by the service. - `com.amazonaws.services.ec2.model.CreateLaunchTemplateResult`"
  (^com.amazonaws.services.ec2.model.CreateLaunchTemplateResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateLaunchTemplateRequest request]
    (-> this (.createLaunchTemplate request))))

(defn assign-ipv-6-addresses
  "Assigns one or more IPv6 addresses to the specified network interface. You can specify one or more specific IPv6
   addresses, or you can specify the number of IPv6 addresses to be automatically assigned from within the subnet's
   IPv6 CIDR block range. You can assign as many IPv6 addresses to a network interface as you can assign private
   IPv4 addresses, and the limit varies per instance type. For information, see IP Addresses Per
   Network Interface Per Instance Type in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.AssignIpv6AddressesRequest`

  returns: Result of the AssignIpv6Addresses operation returned by the service. - `com.amazonaws.services.ec2.model.AssignIpv6AddressesResult`"
  (^com.amazonaws.services.ec2.model.AssignIpv6AddressesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AssignIpv6AddressesRequest request]
    (-> this (.assignIpv6Addresses request))))

(defn enable-vpc-classic-link-dns-support
  "Enables a VPC to support DNS hostname resolution for ClassicLink. If enabled, the DNS hostname of a linked
   EC2-Classic instance resolves to its private IP address when addressed from an instance in the VPC to which it's
   linked. Similarly, the DNS hostname of an instance in a VPC resolves to its private IP address when addressed
   from a linked EC2-Classic instance. For more information, see ClassicLink in the Amazon
   Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportRequest`

  returns: Result of the EnableVpcClassicLinkDnsSupport operation returned by the service. - `com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportResult`"
  (^com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportRequest request]
    (-> this (.enableVpcClassicLinkDnsSupport request))))

(defn import-client-vpn-client-certificate-revocation-list
  "Uploads a client certificate revocation list to the specified Client VPN endpoint. Uploading a client certificate
   revocation list overwrites the existing client certificate revocation list.


   Uploading a client certificate revocation list resets existing client connections.

  request - `com.amazonaws.services.ec2.model.ImportClientVpnClientCertificateRevocationListRequest`

  returns: Result of the ImportClientVpnClientCertificateRevocationList operation returned by the service. - `com.amazonaws.services.ec2.model.ImportClientVpnClientCertificateRevocationListResult`"
  (^com.amazonaws.services.ec2.model.ImportClientVpnClientCertificateRevocationListResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ImportClientVpnClientCertificateRevocationListRequest request]
    (-> this (.importClientVpnClientCertificateRevocationList request))))

(defn describe-elastic-gpus
  "Describes the Elastic Graphics accelerator associated with your instances. For more information about Elastic
   Graphics, see Amazon
   Elastic Graphics.

  request - `com.amazonaws.services.ec2.model.DescribeElasticGpusRequest`

  returns: Result of the DescribeElasticGpus operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeElasticGpusResult`"
  (^com.amazonaws.services.ec2.model.DescribeElasticGpusResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeElasticGpusRequest request]
    (-> this (.describeElasticGpus request))))

(defn create-vpn-gateway
  "Creates a virtual private gateway. A virtual private gateway is the endpoint on the VPC side of your VPN
   connection. You can create a virtual private gateway before creating the VPC itself.


   For more information, see AWS Site-to-Site
   VPN in the AWS Site-to-Site VPN User Guide.

  request - `com.amazonaws.services.ec2.model.CreateVpnGatewayRequest`

  returns: Result of the CreateVpnGateway operation returned by the service. - `com.amazonaws.services.ec2.model.CreateVpnGatewayResult`"
  (^com.amazonaws.services.ec2.model.CreateVpnGatewayResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateVpnGatewayRequest request]
    (-> this (.createVpnGateway request))))

(defn modify-reserved-instances
  "Modifies the Availability Zone, instance count, instance type, or network platform (EC2-Classic or EC2-VPC) of
   your Reserved Instances. The Reserved Instances to be modified must be identical, except for Availability Zone,
   network platform, and instance type.


   For more information, see Modifying Reserved Instances in
   the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.ModifyReservedInstancesRequest`

  returns: Result of the ModifyReservedInstances operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyReservedInstancesResult`"
  (^com.amazonaws.services.ec2.model.ModifyReservedInstancesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyReservedInstancesRequest request]
    (-> this (.modifyReservedInstances request))))

(defn describe-vpc-endpoints
  "Describes one or more of your VPC endpoints.

  request - `com.amazonaws.services.ec2.model.DescribeVpcEndpointsRequest`

  returns: Result of the DescribeVpcEndpoints operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcEndpointsResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcEndpointsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointsRequest request]
    (-> this (.describeVpcEndpoints request)))
  (^com.amazonaws.services.ec2.model.DescribeVpcEndpointsResult [^AmazonEC2Client this]
    (-> this (.describeVpcEndpoints))))

(defn get-console-screenshot
  "Retrieve a JPG-format screenshot of a running instance to help with troubleshooting.


   The returned content is Base64-encoded.

  request - `com.amazonaws.services.ec2.model.GetConsoleScreenshotRequest`

  returns: Result of the GetConsoleScreenshot operation returned by the service. - `com.amazonaws.services.ec2.model.GetConsoleScreenshotResult`"
  (^com.amazonaws.services.ec2.model.GetConsoleScreenshotResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.GetConsoleScreenshotRequest request]
    (-> this (.getConsoleScreenshot request))))

(defn reset-snapshot-attribute
  "Resets permission settings for the specified snapshot.


   For more information about modifying snapshot permissions, see Sharing
   Snapshots in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.ResetSnapshotAttributeRequest`

  returns: Result of the ResetSnapshotAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ResetSnapshotAttributeResult`"
  (^com.amazonaws.services.ec2.model.ResetSnapshotAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ResetSnapshotAttributeRequest request]
    (-> this (.resetSnapshotAttribute request))))

(defn create-fleet
  "Launches an EC2 Fleet.


   You can create a single EC2 Fleet that includes multiple launch specifications that vary by instance type, AMI,
   Availability Zone, or subnet.


   For more information, see Launching
   an EC2 Fleet in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateFleetRequest`

  returns: Result of the CreateFleet operation returned by the service. - `com.amazonaws.services.ec2.model.CreateFleetResult`"
  (^com.amazonaws.services.ec2.model.CreateFleetResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateFleetRequest request]
    (-> this (.createFleet request))))

(defn get-transit-gateway-route-table-associations
  "Gets information about the associations for the specified transit gateway route table.

  request - `com.amazonaws.services.ec2.model.GetTransitGatewayRouteTableAssociationsRequest`

  returns: Result of the GetTransitGatewayRouteTableAssociations operation returned by the service. - `com.amazonaws.services.ec2.model.GetTransitGatewayRouteTableAssociationsResult`"
  (^com.amazonaws.services.ec2.model.GetTransitGatewayRouteTableAssociationsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.GetTransitGatewayRouteTableAssociationsRequest request]
    (-> this (.getTransitGatewayRouteTableAssociations request))))

(defn associate-iam-instance-profile
  "Associates an IAM instance profile with a running or stopped instance. You cannot associate more than one IAM
   instance profile with an instance.

  request - `com.amazonaws.services.ec2.model.AssociateIamInstanceProfileRequest`

  returns: Result of the AssociateIamInstanceProfile operation returned by the service. - `com.amazonaws.services.ec2.model.AssociateIamInstanceProfileResult`"
  (^com.amazonaws.services.ec2.model.AssociateIamInstanceProfileResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AssociateIamInstanceProfileRequest request]
    (-> this (.associateIamInstanceProfile request))))

(defn delete-vpc
  "Deletes the specified VPC. You must detach or delete all gateways and resources that are associated with the VPC
   before you can delete it. For example, you must terminate all instances running in the VPC, delete all security
   groups associated with the VPC (except the default one), delete all route tables associated with the VPC (except
   the default one), and so on.

  request - `com.amazonaws.services.ec2.model.DeleteVpcRequest`

  returns: Result of the DeleteVpc operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteVpcResult`"
  (^com.amazonaws.services.ec2.model.DeleteVpcResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteVpcRequest request]
    (-> this (.deleteVpc request))))

(defn modify-ebs-default-kms-key-id
  "Changes the default customer master key (CMK) for EBS encryption by default for your account in this Region.


   AWS creates a unique AWS managed CMK in each Region for use with encryption by default. If you change the default
   CMK to a customer managed CMK, it is used instead of the AWS managed CMK. To reset the default CMK to the AWS
   managed CMK for EBS, use ResetEbsDefaultKmsKeyId.


   If you delete or disable the customer managed CMK that you specified for use with encryption by default, your
   instances will fail to launch.


   For more information, see Amazon
   EBS Encryption in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.ModifyEbsDefaultKmsKeyIdRequest`

  returns: Result of the ModifyEbsDefaultKmsKeyId operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyEbsDefaultKmsKeyIdResult`"
  (^com.amazonaws.services.ec2.model.ModifyEbsDefaultKmsKeyIdResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyEbsDefaultKmsKeyIdRequest request]
    (-> this (.modifyEbsDefaultKmsKeyId request))))

(defn associate-subnet-cidr-block
  "Associates a CIDR block with your subnet. You can only associate a single IPv6 CIDR block with your subnet. An
   IPv6 CIDR block must have a prefix length of /64.

  request - `com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockRequest`

  returns: Result of the AssociateSubnetCidrBlock operation returned by the service. - `com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockResult`"
  (^com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockRequest request]
    (-> this (.associateSubnetCidrBlock request))))

(defn revoke-security-group-egress
  "[VPC only] Removes the specified egress rules from a security group for EC2-VPC. This action doesn't apply to
   security groups for use in EC2-Classic. To remove a rule, the values that you specify (for example, ports) must
   match the existing rule's values exactly.


   Each rule consists of the protocol and the IPv4 or IPv6 CIDR range or source security group. For the TCP and UDP
   protocols, you must also specify the destination port or range of ports. For the ICMP protocol, you must also
   specify the ICMP type and code. If the security group rule has a description, you do not have to specify the
   description to revoke the rule.


   Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay
   might occur.

  request - `com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressRequest`

  returns: Result of the RevokeSecurityGroupEgress operation returned by the service. - `com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressResult`"
  (^com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressRequest request]
    (-> this (.revokeSecurityGroupEgress request))))

(defn unassign-ipv-6-addresses
  "Unassigns one or more IPv6 addresses from a network interface.

  request - `com.amazonaws.services.ec2.model.UnassignIpv6AddressesRequest`

  returns: Result of the UnassignIpv6Addresses operation returned by the service. - `com.amazonaws.services.ec2.model.UnassignIpv6AddressesResult`"
  (^com.amazonaws.services.ec2.model.UnassignIpv6AddressesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.UnassignIpv6AddressesRequest request]
    (-> this (.unassignIpv6Addresses request))))

(defn export-client-vpn-client-configuration
  "Downloads the contents of the Client VPN endpoint configuration file for the specified Client VPN endpoint. The
   Client VPN endpoint configuration file includes the Client VPN endpoint and certificate information clients need
   to establish a connection with the Client VPN endpoint.

  request - `com.amazonaws.services.ec2.model.ExportClientVpnClientConfigurationRequest`

  returns: Result of the ExportClientVpnClientConfiguration operation returned by the service. - `com.amazonaws.services.ec2.model.ExportClientVpnClientConfigurationResult`"
  (^com.amazonaws.services.ec2.model.ExportClientVpnClientConfigurationResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ExportClientVpnClientConfigurationRequest request]
    (-> this (.exportClientVpnClientConfiguration request))))

(defn reject-vpc-peering-connection
  "Rejects a VPC peering connection request. The VPC peering connection must be in the
   pending-acceptance state. Use the DescribeVpcPeeringConnections request to view your
   outstanding VPC peering connection requests. To delete an active VPC peering connection, or to delete a VPC
   peering connection request that you initiated, use DeleteVpcPeeringConnection.

  request - `com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionRequest`

  returns: Result of the RejectVpcPeeringConnection operation returned by the service. - `com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionResult`"
  (^com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionRequest request]
    (-> this (.rejectVpcPeeringConnection request))))

(defn create-traffic-mirror-filter-rule
  "Creates a Traffic Mirror rule.


   A Traffic Mirror rule defines the Traffic Mirror source traffic to mirror.


   You need the Traffic Mirror filter ID when you create the rule.

  request - `com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRuleRequest`

  returns: Result of the CreateTrafficMirrorFilterRule operation returned by the service. - `com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRuleResult`"
  (^com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRuleResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRuleRequest request]
    (-> this (.createTrafficMirrorFilterRule request))))

(defn update-security-group-rule-descriptions-egress
  "[VPC only] Updates the description of an egress (outbound) security group rule. You can replace an existing
   description, or add a description to a rule that did not have one previously.


   You specify the description as part of the IP permissions structure. You can remove a description for a security
   group rule by omitting the description parameter in the request.

  request - `com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressRequest`

  returns: Result of the UpdateSecurityGroupRuleDescriptionsEgress operation returned by the service. - `com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressResult`"
  (^com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressRequest request]
    (-> this (.updateSecurityGroupRuleDescriptionsEgress request))))

(defn delete-vpc-endpoint-service-configurations
  "Deletes one or more VPC endpoint service configurations in your account. Before you delete the endpoint service
   configuration, you must reject any Available or PendingAcceptance interface endpoint
   connections that are attached to the service.

  request - `com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsRequest`

  returns: Result of the DeleteVpcEndpointServiceConfigurations operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsResult`"
  (^com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsRequest request]
    (-> this (.deleteVpcEndpointServiceConfigurations request))))

(defn describe-network-interface-permissions
  "Describes the permissions for your network interfaces.

  request - `com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsRequest`

  returns: Result of the DescribeNetworkInterfacePermissions operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsRequest request]
    (-> this (.describeNetworkInterfacePermissions request))))

(defn create-security-group
  "Creates a security group.


   A security group acts as a virtual firewall for your instance to control inbound and outbound traffic. For more
   information, see Amazon
   EC2 Security Groups in the Amazon Elastic Compute Cloud User Guide and Security Groups for Your
   VPC in the Amazon Virtual Private Cloud User Guide.


   When you create a security group, you specify a friendly name of your choice. You can have a security group for
   use in EC2-Classic with the same name as a security group for use in a VPC. However, you can't have two security
   groups for use in EC2-Classic with the same name or two security groups for use in a VPC with the same name.


   You have a default security group for use in EC2-Classic and a default security group for use in your VPC. If you
   don't specify a security group when you launch an instance, the instance is launched into the appropriate default
   security group. A default security group includes a default rule that grants instances unrestricted network
   access to each other.


   You can add or remove rules from your security groups using AuthorizeSecurityGroupIngress,
   AuthorizeSecurityGroupEgress, RevokeSecurityGroupIngress, and RevokeSecurityGroupEgress.


   For more information about VPC security group limits, see Amazon VPC Limits.

  request - `com.amazonaws.services.ec2.model.CreateSecurityGroupRequest`

  returns: Result of the CreateSecurityGroup operation returned by the service. - `com.amazonaws.services.ec2.model.CreateSecurityGroupResult`"
  (^com.amazonaws.services.ec2.model.CreateSecurityGroupResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateSecurityGroupRequest request]
    (-> this (.createSecurityGroup request))))

(defn describe-fpga-images
  "Describes the Amazon FPGA Images (AFIs) available to you. These include public AFIs, private AFIs that you own,
   and AFIs owned by other AWS accounts for which you have load permissions.

  request - `com.amazonaws.services.ec2.model.DescribeFpgaImagesRequest`

  returns: Result of the DescribeFpgaImages operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeFpgaImagesResult`"
  (^com.amazonaws.services.ec2.model.DescribeFpgaImagesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeFpgaImagesRequest request]
    (-> this (.describeFpgaImages request))))

(defn cancel-reserved-instances-listing
  "Cancels the specified Reserved Instance listing in the Reserved Instance Marketplace.


   For more information, see Reserved Instance
   Marketplace in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CancelReservedInstancesListingRequest`

  returns: Result of the CancelReservedInstancesListing operation returned by the service. - `com.amazonaws.services.ec2.model.CancelReservedInstancesListingResult`"
  (^com.amazonaws.services.ec2.model.CancelReservedInstancesListingResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CancelReservedInstancesListingRequest request]
    (-> this (.cancelReservedInstancesListing request))))

(defn describe-capacity-reservations
  "Describes one or more of your Capacity Reservations. The results describe only the Capacity Reservations in the
   AWS Region that you're currently using.

  request - `com.amazonaws.services.ec2.model.DescribeCapacityReservationsRequest`

  returns: Result of the DescribeCapacityReservations operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeCapacityReservationsResult`"
  (^com.amazonaws.services.ec2.model.DescribeCapacityReservationsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeCapacityReservationsRequest request]
    (-> this (.describeCapacityReservations request))))

(defn describe-aggregate-id-format
  "Describes the longer ID format settings for all resource types in a specific Region. This request is useful for
   performing a quick audit to determine whether a specific Region is fully opted in for longer IDs (17-character
   IDs).


   This request only returns information about resource types that support longer IDs.


   The following resource types support longer IDs: bundle | conversion-task |
   customer-gateway | dhcp-options | elastic-ip-allocation |
   elastic-ip-association | export-task | flow-log | image |
   import-task | instance | internet-gateway | network-acl |
   network-acl-association | network-interface | network-interface-attachment
   | prefix-list | reservation | route-table |
   route-table-association | security-group | snapshot | subnet
   | subnet-cidr-block-association | volume | vpc |
   vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection |
   vpn-connection | vpn-gateway.

  request - `com.amazonaws.services.ec2.model.DescribeAggregateIdFormatRequest`

  returns: Result of the DescribeAggregateIdFormat operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeAggregateIdFormatResult`"
  (^com.amazonaws.services.ec2.model.DescribeAggregateIdFormatResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeAggregateIdFormatRequest request]
    (-> this (.describeAggregateIdFormat request))))

(defn export-client-vpn-client-certificate-revocation-list
  "Downloads the client certificate revocation list for the specified Client VPN endpoint.

  request - `com.amazonaws.services.ec2.model.ExportClientVpnClientCertificateRevocationListRequest`

  returns: Result of the ExportClientVpnClientCertificateRevocationList operation returned by the service. - `com.amazonaws.services.ec2.model.ExportClientVpnClientCertificateRevocationListResult`"
  (^com.amazonaws.services.ec2.model.ExportClientVpnClientCertificateRevocationListResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ExportClientVpnClientCertificateRevocationListRequest request]
    (-> this (.exportClientVpnClientCertificateRevocationList request))))

(defn allocate-hosts
  "Allocates a Dedicated Host to your account. At a minimum, specify the instance size type, Availability Zone, and
   quantity of hosts to allocate.

  request - `com.amazonaws.services.ec2.model.AllocateHostsRequest`

  returns: Result of the AllocateHosts operation returned by the service. - `com.amazonaws.services.ec2.model.AllocateHostsResult`"
  (^com.amazonaws.services.ec2.model.AllocateHostsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AllocateHostsRequest request]
    (-> this (.allocateHosts request))))

(defn describe-transit-gateways
  "Describes one or more transit gateways. By default, all transit gateways are described. Alternatively, you can
   filter the results.

  request - `com.amazonaws.services.ec2.model.DescribeTransitGatewaysRequest`

  returns: Result of the DescribeTransitGateways operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeTransitGatewaysResult`"
  (^com.amazonaws.services.ec2.model.DescribeTransitGatewaysResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeTransitGatewaysRequest request]
    (-> this (.describeTransitGateways request))))

(defn modify-instance-placement
  "Modifies the placement attributes for a specified instance. You can do the following:




   Modify the affinity between an instance and a Dedicated Host. When
   affinity is set to host and the instance is not associated with a specific Dedicated Host, the next
   time the instance is launched, it is automatically associated with the host on which it lands. If the instance is
   restarted or rebooted, this relationship persists.




   Change the Dedicated Host with which an instance is associated.




   Change the instance tenancy of an instance from host to dedicated, or from
   dedicated to host.




   Move an instance to or from a placement group.




   At least one attribute for affinity, host ID, tenancy, or placement group name must be specified in the request.
   Affinity and tenancy can be modified in the same request.


   To modify the host ID, tenancy, placement group, or partition for an instance, the instance must be in the
   stopped state.

  request - `com.amazonaws.services.ec2.model.ModifyInstancePlacementRequest`

  returns: Result of the ModifyInstancePlacement operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyInstancePlacementResult`"
  (^com.amazonaws.services.ec2.model.ModifyInstancePlacementResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyInstancePlacementRequest request]
    (-> this (.modifyInstancePlacement request))))

(defn describe-traffic-mirror-filters
  "Describes one or more Traffic Mirror filters.

  request - `com.amazonaws.services.ec2.model.DescribeTrafficMirrorFiltersRequest`

  returns: Result of the DescribeTrafficMirrorFilters operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeTrafficMirrorFiltersResult`"
  (^com.amazonaws.services.ec2.model.DescribeTrafficMirrorFiltersResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeTrafficMirrorFiltersRequest request]
    (-> this (.describeTrafficMirrorFilters request))))

(defn attach-volume
  "Attaches an EBS volume to a running or stopped instance and exposes it to the instance with the specified device
   name.


   Encrypted EBS volumes must be attached to instances that support Amazon EBS encryption. For more information, see
   Amazon EBS Encryption in the
   Amazon Elastic Compute Cloud User Guide.


   After you attach an EBS volume, you must make it available. For more information, see Making an EBS Volume Available
   For Use.


   If a volume has an AWS Marketplace product code:




   The volume can be attached only to a stopped instance.




   AWS Marketplace product codes are copied from the volume to the instance.




   You must be subscribed to the product.




   The instance type and operating system of the instance must support the product. For example, you can't detach a
   volume from a Windows instance and attach it to a Linux instance.




   For more information, see Attaching Amazon EBS
   Volumes in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.AttachVolumeRequest`

  returns: Result of the AttachVolume operation returned by the service. - `com.amazonaws.services.ec2.model.AttachVolumeResult`"
  (^com.amazonaws.services.ec2.model.AttachVolumeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AttachVolumeRequest request]
    (-> this (.attachVolume request))))

(defn create-vpc-peering-connection
  "Requests a VPC peering connection between two VPCs: a requester VPC that you own and an accepter VPC with which
   to create the connection. The accepter VPC can belong to another AWS account and can be in a different Region to
   the requester VPC. The requester VPC and accepter VPC cannot have overlapping CIDR blocks.



   Limitations and rules apply to a VPC peering connection. For more information, see the limitations section in the VPC Peering Guide.



   The owner of the accepter VPC must accept the peering request to activate the peering connection. The VPC peering
   connection request expires after 7 days, after which it cannot be accepted or rejected.


   If you create a VPC peering connection request between VPCs with overlapping CIDR blocks, the VPC peering
   connection has a status of failed.

  request - `com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionRequest`

  returns: Result of the CreateVpcPeeringConnection operation returned by the service. - `com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionResult`"
  (^com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionRequest request]
    (-> this (.createVpcPeeringConnection request)))
  (^com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionResult [^AmazonEC2Client this]
    (-> this (.createVpcPeeringConnection))))

(defn describe-volume-attribute
  "Describes the specified attribute of the specified volume. You can specify only one attribute at a time.


   For more information about EBS volumes, see Amazon EBS Volumes in the
   Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeVolumeAttributeRequest`

  returns: Result of the DescribeVolumeAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVolumeAttributeResult`"
  (^com.amazonaws.services.ec2.model.DescribeVolumeAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeVolumeAttributeRequest request]
    (-> this (.describeVolumeAttribute request))))

(defn modify-spot-fleet-request
  "Modifies the specified Spot Fleet request.


   You can only modify a Spot Fleet request of type maintain.


   While the Spot Fleet request is being modified, it is in the modifying state.


   To scale up your Spot Fleet, increase its target capacity. The Spot Fleet launches the additional Spot Instances
   according to the allocation strategy for the Spot Fleet request. If the allocation strategy is
   lowestPrice, the Spot Fleet launches instances using the Spot pool with the lowest price. If the
   allocation strategy is diversified, the Spot Fleet distributes the instances across the Spot pools.


   To scale down your Spot Fleet, decrease its target capacity. First, the Spot Fleet cancels any open requests that
   exceed the new target capacity. You can request that the Spot Fleet terminate Spot Instances until the size of
   the fleet no longer exceeds the new target capacity. If the allocation strategy is lowestPrice, the
   Spot Fleet terminates the instances with the highest price per unit. If the allocation strategy is
   diversified, the Spot Fleet terminates instances across the Spot pools. Alternatively, you can
   request that the Spot Fleet keep the fleet at its current size, but not replace any Spot Instances that are
   interrupted or that you terminate manually.


   If you are finished with your Spot Fleet for now, but will use it again later, you can set the target capacity to
   0.

  request - `com.amazonaws.services.ec2.model.ModifySpotFleetRequestRequest`

  returns: Result of the ModifySpotFleetRequest operation returned by the service. - `com.amazonaws.services.ec2.model.ModifySpotFleetRequestResult`"
  (^com.amazonaws.services.ec2.model.ModifySpotFleetRequestResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifySpotFleetRequestRequest request]
    (-> this (.modifySpotFleetRequest request))))

(defn get-ebs-encryption-by-default
  "Describes whether EBS encryption by default is enabled for your account in the current Region.


   For more information, see Amazon
   EBS Encryption in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.GetEbsEncryptionByDefaultRequest`

  returns: Result of the GetEbsEncryptionByDefault operation returned by the service. - `com.amazonaws.services.ec2.model.GetEbsEncryptionByDefaultResult`"
  (^com.amazonaws.services.ec2.model.GetEbsEncryptionByDefaultResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.GetEbsEncryptionByDefaultRequest request]
    (-> this (.getEbsEncryptionByDefault request))))

(defn describe-traffic-mirror-sessions
  "Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described.
   Alternatively, you can filter the results.

  request - `com.amazonaws.services.ec2.model.DescribeTrafficMirrorSessionsRequest`

  returns: Result of the DescribeTrafficMirrorSessions operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeTrafficMirrorSessionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeTrafficMirrorSessionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeTrafficMirrorSessionsRequest request]
    (-> this (.describeTrafficMirrorSessions request))))

(defn create-capacity-reservation
  "Creates a new Capacity Reservation with the specified attributes.


   Capacity Reservations enable you to reserve capacity for your Amazon EC2 instances in a specific Availability
   Zone for any duration. This gives you the flexibility to selectively add capacity reservations and still get the
   Regional RI discounts for that usage. By creating Capacity Reservations, you ensure that you always have access
   to Amazon EC2 capacity when you need it, for as long as you need it. For more information, see Capacity
   Reservations in the Amazon Elastic Compute Cloud User Guide.


   Your request to create a Capacity Reservation could fail if Amazon EC2 does not have sufficient capacity to
   fulfill the request. If your request fails due to Amazon EC2 capacity constraints, either try again at a later
   time, try in a different Availability Zone, or request a smaller capacity reservation. If your application is
   flexible across instance types and sizes, try to create a Capacity Reservation with different instance
   attributes.


   Your request could also fail if the requested quantity exceeds your On-Demand Instance limit for the selected
   instance type. If your request fails due to limit constraints, increase your On-Demand Instance limit for the
   required instance type and try again. For more information about increasing your instance limits, see Amazon EC2 Service Limits
   in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateCapacityReservationRequest`

  returns: Result of the CreateCapacityReservation operation returned by the service. - `com.amazonaws.services.ec2.model.CreateCapacityReservationResult`"
  (^com.amazonaws.services.ec2.model.CreateCapacityReservationResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateCapacityReservationRequest request]
    (-> this (.createCapacityReservation request))))

(defn describe-route-tables
  "Describes one or more of your route tables.


   Each subnet in your VPC must be associated with a route table. If a subnet is not explicitly associated with any
   route table, it is implicitly associated with the main route table. This command does not return the subnet ID
   for implicit associations.


   For more information, see Route
   Tables in the Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeRouteTablesRequest`

  returns: Result of the DescribeRouteTables operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeRouteTablesResult`"
  (^com.amazonaws.services.ec2.model.DescribeRouteTablesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeRouteTablesRequest request]
    (-> this (.describeRouteTables request)))
  (^com.amazonaws.services.ec2.model.DescribeRouteTablesResult [^AmazonEC2Client this]
    (-> this (.describeRouteTables))))

(defn describe-vpc-endpoint-connections
  "Describes the VPC endpoint connections to your VPC endpoint services, including any endpoints that are pending
   your acceptance.

  request - `com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsRequest`

  returns: Result of the DescribeVpcEndpointConnections operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsRequest request]
    (-> this (.describeVpcEndpointConnections request))))

(defn describe-fleet-instances
  "Describes the running instances for the specified EC2 Fleet.

  request - `com.amazonaws.services.ec2.model.DescribeFleetInstancesRequest`

  returns: Result of the DescribeFleetInstances operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeFleetInstancesResult`"
  (^com.amazonaws.services.ec2.model.DescribeFleetInstancesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeFleetInstancesRequest request]
    (-> this (.describeFleetInstances request))))

(defn describe-vpc-endpoint-service-configurations
  "Describes the VPC endpoint service configurations in your account (your services).

  request - `com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsRequest`

  returns: Result of the DescribeVpcEndpointServiceConfigurations operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsRequest request]
    (-> this (.describeVpcEndpointServiceConfigurations request))))

(defn reject-vpc-endpoint-connections
  "Rejects one or more VPC endpoint connection requests to your VPC endpoint service.

  request - `com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsRequest`

  returns: Result of the RejectVpcEndpointConnections operation returned by the service. - `com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsResult`"
  (^com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsRequest request]
    (-> this (.rejectVpcEndpointConnections request))))

(defn enable-vpc-classic-link
  "Enables a VPC for ClassicLink. You can then link EC2-Classic instances to your ClassicLink-enabled VPC to allow
   communication over private IP addresses. You cannot enable your VPC for ClassicLink if any of your VPC route
   tables have existing routes for address ranges within the 10.0.0.0/8 IP address range, excluding
   local routes for VPCs in the 10.0.0.0/16 and 10.1.0.0/16 IP address ranges. For more
   information, see ClassicLink in the Amazon
   Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.EnableVpcClassicLinkRequest`

  returns: Result of the EnableVpcClassicLink operation returned by the service. - `com.amazonaws.services.ec2.model.EnableVpcClassicLinkResult`"
  (^com.amazonaws.services.ec2.model.EnableVpcClassicLinkResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.EnableVpcClassicLinkRequest request]
    (-> this (.enableVpcClassicLink request))))

(defn describe-vpc-endpoint-service-permissions
  "Describes the principals (service consumers) that are permitted to discover your VPC endpoint service.

  request - `com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsRequest`

  returns: Result of the DescribeVpcEndpointServicePermissions operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsRequest request]
    (-> this (.describeVpcEndpointServicePermissions request))))

(defn update-security-group-rule-descriptions-ingress
  "Updates the description of an ingress (inbound) security group rule. You can replace an existing description, or
   add a description to a rule that did not have one previously.


   You specify the description as part of the IP permissions structure. You can remove a description for a security
   group rule by omitting the description parameter in the request.

  request - `com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressRequest`

  returns: Result of the UpdateSecurityGroupRuleDescriptionsIngress operation returned by the service. - `com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressResult`"
  (^com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressRequest request]
    (-> this (.updateSecurityGroupRuleDescriptionsIngress request))))

(defn enable-vgw-route-propagation
  "Enables a virtual private gateway (VGW) to propagate routes to the specified route table of a VPC.

  request - `com.amazonaws.services.ec2.model.EnableVgwRoutePropagationRequest`

  returns: Result of the EnableVgwRoutePropagation operation returned by the service. - `com.amazonaws.services.ec2.model.EnableVgwRoutePropagationResult`"
  (^com.amazonaws.services.ec2.model.EnableVgwRoutePropagationResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.EnableVgwRoutePropagationRequest request]
    (-> this (.enableVgwRoutePropagation request))))

(defn describe-customer-gateways
  "Describes one or more of your VPN customer gateways.


   For more information, see AWS Site-to-Site
   VPN in the AWS Site-to-Site VPN User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeCustomerGatewaysRequest`

  returns: Result of the DescribeCustomerGateways operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeCustomerGatewaysResult`"
  (^com.amazonaws.services.ec2.model.DescribeCustomerGatewaysResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeCustomerGatewaysRequest request]
    (-> this (.describeCustomerGateways request)))
  (^com.amazonaws.services.ec2.model.DescribeCustomerGatewaysResult [^AmazonEC2Client this]
    (-> this (.describeCustomerGateways))))

(defn create-network-acl
  "Creates a network ACL in a VPC. Network ACLs provide an optional layer of security (in addition to security
   groups) for the instances in your VPC.


   For more information, see Network
   ACLs in the Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateNetworkAclRequest`

  returns: Result of the CreateNetworkAcl operation returned by the service. - `com.amazonaws.services.ec2.model.CreateNetworkAclResult`"
  (^com.amazonaws.services.ec2.model.CreateNetworkAclResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateNetworkAclRequest request]
    (-> this (.createNetworkAcl request))))

(defn register-image
  "Registers an AMI. When you're creating an AMI, this is the final step you must complete before you can launch an
   instance from the AMI. For more information about creating AMIs, see Creating Your Own AMIs in the
   Amazon Elastic Compute Cloud User Guide.



   For Amazon EBS-backed instances, CreateImage creates and registers the AMI in a single request, so you
   don't have to register the AMI yourself.



   You can also use RegisterImage to create an Amazon EBS-backed Linux AMI from a snapshot of a root
   device volume. You specify the snapshot using the block device mapping. For more information, see Launching a Linux
   Instance from a Backup in the Amazon Elastic Compute Cloud User Guide.


   You can't register an image where a secondary (non-root) snapshot has AWS Marketplace product codes.


   Some Linux distributions, such as Red Hat Enterprise Linux (RHEL) and SUSE Linux Enterprise Server (SLES), use
   the EC2 billing product code associated with an AMI to verify the subscription status for package updates.
   Creating an AMI from an EBS snapshot does not maintain this billing code, and instances launched from such an AMI
   are not able to connect to package update infrastructure. If you purchase a Reserved Instance offering for one of
   these Linux distributions and launch instances using an AMI that does not contain the required billing code, your
   Reserved Instance is not applied to these instances.


   To create an AMI for operating systems that require a billing code, see CreateImage.


   If needed, you can deregister an AMI at any time. Any modifications you make to an AMI backed by an instance
   store volume invalidates its registration. If you make changes to an image, deregister the previous image and
   register the new image.

  request - `com.amazonaws.services.ec2.model.RegisterImageRequest`

  returns: Result of the RegisterImage operation returned by the service. - `com.amazonaws.services.ec2.model.RegisterImageResult`"
  (^com.amazonaws.services.ec2.model.RegisterImageResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.RegisterImageRequest request]
    (-> this (.registerImage request))))

(defn describe-spot-fleet-request-history
  "Describes the events for the specified Spot Fleet request during the specified time.


   Spot Fleet events are delayed by up to 30 seconds before they can be described. This ensures that you can query
   by the last evaluated time and not miss a recorded event. Spot Fleet events are available for 48 hours.

  request - `com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryRequest`

  returns: Result of the DescribeSpotFleetRequestHistory operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryResult`"
  (^com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryRequest request]
    (-> this (.describeSpotFleetRequestHistory request))))

(defn run-scheduled-instances
  "Launches the specified Scheduled Instances.


   Before you can launch a Scheduled Instance, you must purchase it and obtain an identifier using
   PurchaseScheduledInstances.


   You must launch a Scheduled Instance during its scheduled time period. You can't stop or reboot a Scheduled
   Instance, but you can terminate it as needed. If you terminate a Scheduled Instance before the current scheduled
   time period ends, you can launch it again after a few minutes. For more information, see Scheduled Instances
   in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.RunScheduledInstancesRequest`

  returns: Result of the RunScheduledInstances operation returned by the service. - `com.amazonaws.services.ec2.model.RunScheduledInstancesResult`"
  (^com.amazonaws.services.ec2.model.RunScheduledInstancesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.RunScheduledInstancesRequest request]
    (-> this (.runScheduledInstances request))))

(defn create-internet-gateway
  "Creates an internet gateway for use with a VPC. After creating the internet gateway, you attach it to a VPC using
   AttachInternetGateway.


   For more information about your VPC and internet gateway, see the Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateInternetGatewayRequest`

  returns: Result of the CreateInternetGateway operation returned by the service. - `com.amazonaws.services.ec2.model.CreateInternetGatewayResult`"
  (^com.amazonaws.services.ec2.model.CreateInternetGatewayResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateInternetGatewayRequest request]
    (-> this (.createInternetGateway request)))
  (^com.amazonaws.services.ec2.model.CreateInternetGatewayResult [^AmazonEC2Client this]
    (-> this (.createInternetGateway))))

(defn detach-vpn-gateway
  "Detaches a virtual private gateway from a VPC. You do this if you're planning to turn off the VPC and not use it
   anymore. You can confirm a virtual private gateway has been completely detached from a VPC by describing the
   virtual private gateway (any attachments to the virtual private gateway are also described).


   You must wait for the attachment's state to switch to detached before you can delete the VPC or
   attach a different VPC to the virtual private gateway.

  request - `com.amazonaws.services.ec2.model.DetachVpnGatewayRequest`

  returns: Result of the DetachVpnGateway operation returned by the service. - `com.amazonaws.services.ec2.model.DetachVpnGatewayResult`"
  (^com.amazonaws.services.ec2.model.DetachVpnGatewayResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DetachVpnGatewayRequest request]
    (-> this (.detachVpnGateway request))))

(defn create-route
  "Creates a route in a route table within a VPC.


   You must specify one of the following targets: internet gateway or virtual private gateway, NAT instance, NAT
   gateway, VPC peering connection, network interface, or egress-only internet gateway.


   When determining how to route traffic, we use the route with the most specific match. For example, traffic is
   destined for the IPv4 address 192.0.2.3, and the route table includes the following two IPv4 routes:




   192.0.2.0/24 (goes to some target A)




   192.0.2.0/28 (goes to some target B)




   Both routes apply to the traffic destined for 192.0.2.3. However, the second route in the list
   covers a smaller number of IP addresses and is therefore more specific, so we use that route to determine where
   to target the traffic.


   For more information about route tables, see Route Tables in the Amazon
   Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateRouteRequest`

  returns: Result of the CreateRoute operation returned by the service. - `com.amazonaws.services.ec2.model.CreateRouteResult`"
  (^com.amazonaws.services.ec2.model.CreateRouteResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateRouteRequest request]
    (-> this (.createRoute request))))

(defn delete-subnet
  "Deletes the specified subnet. You must terminate all running instances in the subnet before you can delete the
   subnet.

  request - `com.amazonaws.services.ec2.model.DeleteSubnetRequest`

  returns: Result of the DeleteSubnet operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteSubnetResult`"
  (^com.amazonaws.services.ec2.model.DeleteSubnetResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteSubnetRequest request]
    (-> this (.deleteSubnet request))))

(defn describe-client-vpn-authorization-rules
  "Describes the authorization rules for a specified Client VPN endpoint.

  request - `com.amazonaws.services.ec2.model.DescribeClientVpnAuthorizationRulesRequest`

  returns: Result of the DescribeClientVpnAuthorizationRules operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeClientVpnAuthorizationRulesResult`"
  (^com.amazonaws.services.ec2.model.DescribeClientVpnAuthorizationRulesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeClientVpnAuthorizationRulesRequest request]
    (-> this (.describeClientVpnAuthorizationRules request))))

(defn create-transit-gateway-route-table
  "Creates a route table for the specified transit gateway.

  request - `com.amazonaws.services.ec2.model.CreateTransitGatewayRouteTableRequest`

  returns: Result of the CreateTransitGatewayRouteTable operation returned by the service. - `com.amazonaws.services.ec2.model.CreateTransitGatewayRouteTableResult`"
  (^com.amazonaws.services.ec2.model.CreateTransitGatewayRouteTableResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateTransitGatewayRouteTableRequest request]
    (-> this (.createTransitGatewayRouteTable request))))

(defn delete-vpn-connection-route
  "Deletes the specified static route associated with a VPN connection between an existing virtual private gateway
   and a VPN customer gateway. The static route allows traffic to be routed from the virtual private gateway to the
   VPN customer gateway.

  request - `com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteRequest`

  returns: Result of the DeleteVpnConnectionRoute operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteResult`"
  (^com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteRequest request]
    (-> this (.deleteVpnConnectionRoute request))))

(defn create-vpn-connection-route
  "Creates a static route associated with a VPN connection between an existing virtual private gateway and a VPN
   customer gateway. The static route allows traffic to be routed from the virtual private gateway to the VPN
   customer gateway.


   For more information, see AWS Site-to-Site
   VPN in the AWS Site-to-Site VPN User Guide.

  request - `com.amazonaws.services.ec2.model.CreateVpnConnectionRouteRequest`

  returns: Result of the CreateVpnConnectionRoute operation returned by the service. - `com.amazonaws.services.ec2.model.CreateVpnConnectionRouteResult`"
  (^com.amazonaws.services.ec2.model.CreateVpnConnectionRouteResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateVpnConnectionRouteRequest request]
    (-> this (.createVpnConnectionRoute request))))

(defn disassociate-transit-gateway-route-table
  "Disassociates a resource attachment from a transit gateway route table.

  request - `com.amazonaws.services.ec2.model.DisassociateTransitGatewayRouteTableRequest`

  returns: Result of the DisassociateTransitGatewayRouteTable operation returned by the service. - `com.amazonaws.services.ec2.model.DisassociateTransitGatewayRouteTableResult`"
  (^com.amazonaws.services.ec2.model.DisassociateTransitGatewayRouteTableResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DisassociateTransitGatewayRouteTableRequest request]
    (-> this (.disassociateTransitGatewayRouteTable request))))

(defn monitor-instances
  "Enables detailed monitoring for a running instance. Otherwise, basic monitoring is enabled. For more information,
   see Monitoring Your Instances
   and Volumes in the Amazon Elastic Compute Cloud User Guide.


   To disable detailed monitoring, see .

  request - `com.amazonaws.services.ec2.model.MonitorInstancesRequest`

  returns: Result of the MonitorInstances operation returned by the service. - `com.amazonaws.services.ec2.model.MonitorInstancesResult`"
  (^com.amazonaws.services.ec2.model.MonitorInstancesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.MonitorInstancesRequest request]
    (-> this (.monitorInstances request))))

(defn get-console-output
  "Gets the console output for the specified instance. For Linux instances, the instance console output displays the
   exact console output that would normally be displayed on a physical monitor attached to a computer. For Windows
   instances, the instance console output includes the last three system event log errors.


   By default, the console output returns buffered information that was posted shortly after an instance transition
   state (start, stop, reboot, or terminate). This information is available for at least one hour after the most
   recent post. Only the most recent 64 KB of console output is available.


   You can optionally retrieve the latest serial console output at any time during the instance lifecycle. This
   option is supported on instance types that use the Nitro hypervisor.


   For more information, see Instance Console Output in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.GetConsoleOutputRequest`

  returns: Result of the GetConsoleOutput operation returned by the service. - `com.amazonaws.services.ec2.model.GetConsoleOutputResult`"
  (^com.amazonaws.services.ec2.model.GetConsoleOutputResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.GetConsoleOutputRequest request]
    (-> this (.getConsoleOutput request))))

(defn bundle-instance
  "Bundles an Amazon instance store-backed Windows instance.


   During bundling, only the root device volume (C:\\) is bundled. Data on other instance store volumes is not
   preserved.



   This action is not applicable for Linux/Unix instances or Windows instances that are backed by Amazon EBS.

  request - `com.amazonaws.services.ec2.model.BundleInstanceRequest`

  returns: Result of the BundleInstance operation returned by the service. - `com.amazonaws.services.ec2.model.BundleInstanceResult`"
  (^com.amazonaws.services.ec2.model.BundleInstanceResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.BundleInstanceRequest request]
    (-> this (.bundleInstance request))))

(defn create-transit-gateway-route
  "Creates a static route for the specified transit gateway route table.

  request - `com.amazonaws.services.ec2.model.CreateTransitGatewayRouteRequest`

  returns: Result of the CreateTransitGatewayRoute operation returned by the service. - `com.amazonaws.services.ec2.model.CreateTransitGatewayRouteResult`"
  (^com.amazonaws.services.ec2.model.CreateTransitGatewayRouteResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateTransitGatewayRouteRequest request]
    (-> this (.createTransitGatewayRoute request))))

(defn disable-transit-gateway-route-table-propagation
  "Disables the specified resource attachment from propagating routes to the specified propagation route table.

  request - `com.amazonaws.services.ec2.model.DisableTransitGatewayRouteTablePropagationRequest`

  returns: Result of the DisableTransitGatewayRouteTablePropagation operation returned by the service. - `com.amazonaws.services.ec2.model.DisableTransitGatewayRouteTablePropagationResult`"
  (^com.amazonaws.services.ec2.model.DisableTransitGatewayRouteTablePropagationResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DisableTransitGatewayRouteTablePropagationRequest request]
    (-> this (.disableTransitGatewayRouteTablePropagation request))))

(defn provision-byoip-cidr
  "Provisions an address range for use with your AWS resources through bring your own IP addresses (BYOIP) and
   creates a corresponding address pool. After the address range is provisioned, it is ready to be advertised using
   AdvertiseByoipCidr.


   AWS verifies that you own the address range and are authorized to advertise it. You must ensure that the address
   range is registered to you and that you created an RPKI ROA to authorize Amazon ASNs 16509 and 14618 to advertise
   the address range. For more information, see Bring Your Own IP Addresses (BYOIP)
   in the Amazon Elastic Compute Cloud User Guide.


   Provisioning an address range is an asynchronous operation, so the call returns immediately, but the address
   range is not ready to use until its status changes from pending-provision to
   provisioned. To monitor the status of an address range, use DescribeByoipCidrs. To allocate
   an Elastic IP address from your address pool, use AllocateAddress with either the specific address from
   the address pool or the ID of the address pool.

  request - `com.amazonaws.services.ec2.model.ProvisionByoipCidrRequest`

  returns: Result of the ProvisionByoipCidr operation returned by the service. - `com.amazonaws.services.ec2.model.ProvisionByoipCidrResult`"
  (^com.amazonaws.services.ec2.model.ProvisionByoipCidrResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ProvisionByoipCidrRequest request]
    (-> this (.provisionByoipCidr request))))

(defn associate-transit-gateway-route-table
  "Associates the specified attachment with the specified transit gateway route table. You can associate only one
   route table with an attachment.

  request - `com.amazonaws.services.ec2.model.AssociateTransitGatewayRouteTableRequest`

  returns: Result of the AssociateTransitGatewayRouteTable operation returned by the service. - `com.amazonaws.services.ec2.model.AssociateTransitGatewayRouteTableResult`"
  (^com.amazonaws.services.ec2.model.AssociateTransitGatewayRouteTableResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AssociateTransitGatewayRouteTableRequest request]
    (-> this (.associateTransitGatewayRouteTable request))))

(defn accept-vpc-peering-connection
  "Accept a VPC peering connection request. To accept a request, the VPC peering connection must be in the
   pending-acceptance state, and you must be the owner of the peer VPC. Use
   DescribeVpcPeeringConnections to view your outstanding VPC peering connection requests.


   For an inter-Region VPC peering connection request, you must accept the VPC peering connection in the Region of
   the accepter VPC.

  request - `com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionRequest`

  returns: Result of the AcceptVpcPeeringConnection operation returned by the service. - `com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionResult`"
  (^com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionRequest request]
    (-> this (.acceptVpcPeeringConnection request)))
  (^com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionResult [^AmazonEC2Client this]
    (-> this (.acceptVpcPeeringConnection))))

(defn create-key-pair
  "Creates a 2048-bit RSA key pair with the specified name. Amazon EC2 stores the public key and displays the
   private key for you to save to a file. The private key is returned as an unencrypted PEM encoded PKCS#1 private
   key. If a key with the specified name already exists, Amazon EC2 returns an error.


   You can have up to five thousand key pairs per Region.


   The key pair returned to you is available only in the Region in which you create it. If you prefer, you can
   create your own key pair using a third-party tool and upload it to any Region using ImportKeyPair.


   For more information, see Key
   Pairs in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateKeyPairRequest`

  returns: Result of the CreateKeyPair operation returned by the service. - `com.amazonaws.services.ec2.model.CreateKeyPairResult`"
  (^com.amazonaws.services.ec2.model.CreateKeyPairResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateKeyPairRequest request]
    (-> this (.createKeyPair request))))

(defn create-default-subnet
  "Creates a default subnet with a size /20 IPv4 CIDR block in the specified Availability Zone in your
   default VPC. You can have only one default subnet per Availability Zone. For more information, see Creating a Default
   Subnet in the Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateDefaultSubnetRequest`

  returns: Result of the CreateDefaultSubnet operation returned by the service. - `com.amazonaws.services.ec2.model.CreateDefaultSubnetResult`"
  (^com.amazonaws.services.ec2.model.CreateDefaultSubnetResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateDefaultSubnetRequest request]
    (-> this (.createDefaultSubnet request))))

(defn modify-identity-id-format
  "Modifies the ID format of a resource for a specified IAM user, IAM role, or the root user for an account; or all
   IAM users, IAM roles, and the root user for an account. You can specify that resources should receive longer IDs
   (17-character IDs) when they are created.


   This request can only be used to modify longer ID settings for resource types that are within the opt-in period.
   Resources currently in their opt-in period include: bundle | conversion-task |
   customer-gateway | dhcp-options | elastic-ip-allocation |
   elastic-ip-association | export-task | flow-log | image |
   import-task | internet-gateway | network-acl |
   network-acl-association | network-interface | network-interface-attachment
   | prefix-list | route-table | route-table-association |
   security-group | subnet | subnet-cidr-block-association | vpc
   | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection |
   vpn-connection | vpn-gateway.


   For more information, see Resource IDs in the Amazon
   Elastic Compute Cloud User Guide.


   This setting applies to the principal specified in the request; it does not apply to the principal that makes the
   request.


   Resources created with longer IDs are visible to all IAM roles and users, regardless of these settings and
   provided that they have permission to use the relevant Describe command for the resource type.

  request - `com.amazonaws.services.ec2.model.ModifyIdentityIdFormatRequest`

  returns: Result of the ModifyIdentityIdFormat operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyIdentityIdFormatResult`"
  (^com.amazonaws.services.ec2.model.ModifyIdentityIdFormatResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyIdentityIdFormatRequest request]
    (-> this (.modifyIdentityIdFormat request))))

(defn create-traffic-mirror-session
  "Creates a Traffic Mirror session.


   A Traffic Mirror session actively copies packets from a Traffic Mirror source to a Traffic Mirror target. Create
   a filter, and then assign it to the session to define a subset of the traffic to mirror, for example all TCP
   traffic.


   The Traffic Mirror source and the Traffic Mirror target (monitoring appliances) can be in the same VPC, or in a
   different VPC connected via VPC peering or a transit gateway.


   By default, no traffic is mirrored. Use CreateTrafficMirrorFilter to create filter rules that specify the
   traffic to mirror.

  request - `com.amazonaws.services.ec2.model.CreateTrafficMirrorSessionRequest`

  returns: Result of the CreateTrafficMirrorSession operation returned by the service. - `com.amazonaws.services.ec2.model.CreateTrafficMirrorSessionResult`"
  (^com.amazonaws.services.ec2.model.CreateTrafficMirrorSessionResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorSessionRequest request]
    (-> this (.createTrafficMirrorSession request))))

(defn create-tags
  "Adds or overwrites the specified tags for the specified Amazon EC2 resource or resources. Each resource can have
   a maximum of 50 tags. Each tag consists of a key and optional value. Tag keys must be unique per resource.


   For more information about tags, see Tagging Your Resources in the
   Amazon Elastic Compute Cloud User Guide. For more information about creating IAM policies that control
   users' access to resources based on tags, see Supported
   Resource-Level Permissions for Amazon EC2 API Actions in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateTagsRequest`

  returns: Result of the CreateTags operation returned by the service. - `com.amazonaws.services.ec2.model.CreateTagsResult`"
  (^com.amazonaws.services.ec2.model.CreateTagsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateTagsRequest request]
    (-> this (.createTags request))))

(defn reset-image-attribute
  "Resets an attribute of an AMI to its default value.



   The productCodes attribute can't be reset.

  request - `com.amazonaws.services.ec2.model.ResetImageAttributeRequest`

  returns: Result of the ResetImageAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ResetImageAttributeResult`"
  (^com.amazonaws.services.ec2.model.ResetImageAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ResetImageAttributeRequest request]
    (-> this (.resetImageAttribute request))))

(defn describe-vpcs
  "Describes one or more of your VPCs.

  request - `com.amazonaws.services.ec2.model.DescribeVpcsRequest`

  returns: Result of the DescribeVpcs operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcsResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeVpcsRequest request]
    (-> this (.describeVpcs request)))
  (^com.amazonaws.services.ec2.model.DescribeVpcsResult [^AmazonEC2Client this]
    (-> this (.describeVpcs))))

(defn cancel-spot-instance-requests
  "Cancels one or more Spot Instance requests.



   Canceling a Spot Instance request does not terminate running Spot Instances associated with the request.

  request - `com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsRequest`

  returns: Result of the CancelSpotInstanceRequests operation returned by the service. - `com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsResult`"
  (^com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsRequest request]
    (-> this (.cancelSpotInstanceRequests request))))

(defn associate-dhcp-options
  "Associates a set of DHCP options (that you've previously created) with the specified VPC, or associates no DHCP
   options with the VPC.


   After you associate the options with the VPC, any existing instances and all new instances that you launch in
   that VPC use the options. You don't need to restart or relaunch the instances. They automatically pick up the
   changes within a few hours, depending on how frequently the instance renews its DHCP lease. You can explicitly
   renew the lease using the operating system on the instance.


   For more information, see DHCP
   Options Sets in the Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.AssociateDhcpOptionsRequest`

  returns: Result of the AssociateDhcpOptions operation returned by the service. - `com.amazonaws.services.ec2.model.AssociateDhcpOptionsResult`"
  (^com.amazonaws.services.ec2.model.AssociateDhcpOptionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AssociateDhcpOptionsRequest request]
    (-> this (.associateDhcpOptions request))))

(defn describe-principal-id-format
  "Describes the ID format settings for the root user and all IAM roles and IAM users that have explicitly specified
   a longer ID (17-character ID) preference.


   By default, all IAM roles and IAM users default to the same ID settings as the root user, unless they explicitly
   override the settings. This request is useful for identifying those IAM users and IAM roles that have overridden
   the default ID settings.


   The following resource types support longer IDs: bundle | conversion-task |
   customer-gateway | dhcp-options | elastic-ip-allocation |
   elastic-ip-association | export-task | flow-log | image |
   import-task | instance | internet-gateway | network-acl |
   network-acl-association | network-interface | network-interface-attachment
   | prefix-list | reservation | route-table |
   route-table-association | security-group | snapshot | subnet
   | subnet-cidr-block-association | volume | vpc |
   vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection |
   vpn-connection | vpn-gateway.

  request - `com.amazonaws.services.ec2.model.DescribePrincipalIdFormatRequest`

  returns: Result of the DescribePrincipalIdFormat operation returned by the service. - `com.amazonaws.services.ec2.model.DescribePrincipalIdFormatResult`"
  (^com.amazonaws.services.ec2.model.DescribePrincipalIdFormatResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribePrincipalIdFormatRequest request]
    (-> this (.describePrincipalIdFormat request))))

(defn dry-run
  "Checks whether you have the required permissions for the provided Amazon EC2 operation, without actually running
   it. The returned DryRunResult object contains the information of whether the dry-run was successful. This method
   will throw exception when the service response does not clearly indicate whether you have the permission.

  request - The request object for any Amazon EC2 operation supported with dry-run. - `com.amazonaws.services.ec2.model.DryRunSupportedRequest`

  returns: A DryRunResult object that contains the information of whether the dry-run was successful. - `<X extends com.amazonaws.AmazonWebServiceRequest> com.amazonaws.services.ec2.model.DryRunResult<X>`

  throws: com.amazonaws.AmazonClientException - If any internal errors are encountered inside the client while attempting to make the request or handle the response. Or if the service response does not clearly indicate whether you have the permission."
  ([^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DryRunSupportedRequest request]
    (-> this (.dryRun request))))

(defn replace-iam-instance-profile-association
  "Replaces an IAM instance profile for the specified running instance. You can use this action to change the IAM
   instance profile that's associated with an instance without having to disassociate the existing IAM instance
   profile first.


   Use DescribeIamInstanceProfileAssociations to get the association ID.

  request - `com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationRequest`

  returns: Result of the ReplaceIamInstanceProfileAssociation operation returned by the service. - `com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationResult`"
  (^com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationRequest request]
    (-> this (.replaceIamInstanceProfileAssociation request))))

(defn describe-placement-groups
  "Describes the specified placement groups or all of your placement groups. For more information, see Placement Groups in the
   Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribePlacementGroupsRequest`

  returns: Result of the DescribePlacementGroups operation returned by the service. - `com.amazonaws.services.ec2.model.DescribePlacementGroupsResult`"
  (^com.amazonaws.services.ec2.model.DescribePlacementGroupsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribePlacementGroupsRequest request]
    (-> this (.describePlacementGroups request)))
  (^com.amazonaws.services.ec2.model.DescribePlacementGroupsResult [^AmazonEC2Client this]
    (-> this (.describePlacementGroups))))

(defn associate-route-table
  "Associates a subnet with a route table. The subnet and route table must be in the same VPC. This association
   causes traffic originating from the subnet to be routed according to the routes in the route table. The action
   returns an association ID, which you need in order to disassociate the route table from the subnet later. A route
   table can be associated with multiple subnets.


   For more information, see Route
   Tables in the Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.AssociateRouteTableRequest`

  returns: Result of the AssociateRouteTable operation returned by the service. - `com.amazonaws.services.ec2.model.AssociateRouteTableResult`"
  (^com.amazonaws.services.ec2.model.AssociateRouteTableResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AssociateRouteTableRequest request]
    (-> this (.associateRouteTable request))))

(defn reject-transit-gateway-vpc-attachment
  "Rejects a request to attach a VPC to a transit gateway.


   The VPC attachment must be in the pendingAcceptance state. Use
   DescribeTransitGatewayVpcAttachments to view your pending VPC attachment requests. Use
   AcceptTransitGatewayVpcAttachment to accept a VPC attachment request.

  request - `com.amazonaws.services.ec2.model.RejectTransitGatewayVpcAttachmentRequest`

  returns: Result of the RejectTransitGatewayVpcAttachment operation returned by the service. - `com.amazonaws.services.ec2.model.RejectTransitGatewayVpcAttachmentResult`"
  (^com.amazonaws.services.ec2.model.RejectTransitGatewayVpcAttachmentResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.RejectTransitGatewayVpcAttachmentRequest request]
    (-> this (.rejectTransitGatewayVpcAttachment request))))

(defn describe-account-attributes
  "Describes attributes of your AWS account. The following are the supported account attributes:




   supported-platforms: Indicates whether your account can launch instances into EC2-Classic and
   EC2-VPC, or only into EC2-VPC.




   default-vpc: The ID of the default VPC for your account, or none.




   max-instances: The maximum number of On-Demand Instances that you can run.




   vpc-max-security-groups-per-interface: The maximum number of security groups that you can assign to
   a network interface.




   max-elastic-ips: The maximum number of Elastic IP addresses that you can allocate for use with
   EC2-Classic.




   vpc-max-elastic-ips: The maximum number of Elastic IP addresses that you can allocate for use with
   EC2-VPC.

  request - `com.amazonaws.services.ec2.model.DescribeAccountAttributesRequest`

  returns: Result of the DescribeAccountAttributes operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeAccountAttributesResult`"
  (^com.amazonaws.services.ec2.model.DescribeAccountAttributesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeAccountAttributesRequest request]
    (-> this (.describeAccountAttributes request)))
  (^com.amazonaws.services.ec2.model.DescribeAccountAttributesResult [^AmazonEC2Client this]
    (-> this (.describeAccountAttributes))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AmazonEC2Client this]
    (-> this (.shutdown))))

(defn reset-instance-attribute
  "Resets an attribute of an instance to its default value. To reset the kernel or ramdisk
   , the instance must be in a stopped state. To reset the sourceDestCheck, the instance can be either
   running or stopped.


   The sourceDestCheck attribute controls whether source/destination checking is enabled. The default
   value is true, which means checking is enabled. This value must be false for a NAT
   instance to perform NAT. For more information, see NAT Instances in the
   Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.ResetInstanceAttributeRequest`

  returns: Result of the ResetInstanceAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ResetInstanceAttributeResult`"
  (^com.amazonaws.services.ec2.model.ResetInstanceAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ResetInstanceAttributeRequest request]
    (-> this (.resetInstanceAttribute request))))

(defn disassociate-address
  "Disassociates an Elastic IP address from the instance or network interface it's associated with.


   An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see Elastic IP Addresses
   in the Amazon Elastic Compute Cloud User Guide.


   This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error.

  request - `com.amazonaws.services.ec2.model.DisassociateAddressRequest`

  returns: Result of the DisassociateAddress operation returned by the service. - `com.amazonaws.services.ec2.model.DisassociateAddressResult`"
  (^com.amazonaws.services.ec2.model.DisassociateAddressResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DisassociateAddressRequest request]
    (-> this (.disassociateAddress request))))

(defn disassociate-subnet-cidr-block
  "Disassociates a CIDR block from a subnet. Currently, you can disassociate an IPv6 CIDR block only. You must
   detach or delete all gateways and resources that are associated with the CIDR block before you can disassociate
   it.

  request - `com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockRequest`

  returns: Result of the DisassociateSubnetCidrBlock operation returned by the service. - `com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockResult`"
  (^com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockRequest request]
    (-> this (.disassociateSubnetCidrBlock request))))

(defn delete-snapshot
  "Deletes the specified snapshot.


   When you make periodic snapshots of a volume, the snapshots are incremental, and only the blocks on the device
   that have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the
   data not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all
   active snapshots will have access to all the information needed to restore the volume.


   You cannot delete a snapshot of the root device of an EBS volume used by a registered AMI. You must first
   de-register the AMI before you can delete the snapshot.


   For more information, see Deleting an Amazon EBS
   Snapshot in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DeleteSnapshotRequest`

  returns: Result of the DeleteSnapshot operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteSnapshotResult`"
  (^com.amazonaws.services.ec2.model.DeleteSnapshotResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteSnapshotRequest request]
    (-> this (.deleteSnapshot request))))

(defn get-reserved-instances-exchange-quote
  "Returns a quote and exchange information for exchanging one or more specified Convertible Reserved Instances for
   a new Convertible Reserved Instance. If the exchange cannot be performed, the reason is returned in the response.
   Use AcceptReservedInstancesExchangeQuote to perform the exchange.

  request - `com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteRequest`

  returns: Result of the GetReservedInstancesExchangeQuote operation returned by the service. - `com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteResult`"
  (^com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteRequest request]
    (-> this (.getReservedInstancesExchangeQuote request))))

(defn create-placement-group
  "Creates a placement group in which to launch instances. The strategy of the placement group determines how the
   instances are organized within the group.


   A cluster placement group is a logical grouping of instances within a single Availability Zone that
   benefit from low network latency, high network throughput. A spread placement group places instances
   on distinct hardware. A partition placement group places groups of instances in different
   partitions, where instances in one partition do not share the same hardware with instances in another partition.


   For more information, see Placement Groups in the
   Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreatePlacementGroupRequest`

  returns: Result of the CreatePlacementGroup operation returned by the service. - `com.amazonaws.services.ec2.model.CreatePlacementGroupResult`"
  (^com.amazonaws.services.ec2.model.CreatePlacementGroupResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreatePlacementGroupRequest request]
    (-> this (.createPlacementGroup request))))

(defn terminate-client-vpn-connections
  "Terminates active Client VPN endpoint connections. This action can be used to terminate a specific client
   connection, or up to five connections established by a specific user.

  request - `com.amazonaws.services.ec2.model.TerminateClientVpnConnectionsRequest`

  returns: Result of the TerminateClientVpnConnections operation returned by the service. - `com.amazonaws.services.ec2.model.TerminateClientVpnConnectionsResult`"
  (^com.amazonaws.services.ec2.model.TerminateClientVpnConnectionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.TerminateClientVpnConnectionsRequest request]
    (-> this (.terminateClientVpnConnections request))))

(defn modify-vpc-endpoint-connection-notification
  "Modifies a connection notification for VPC endpoint or VPC endpoint service. You can change the SNS topic for the
   notification, or the events for which to be notified.

  request - `com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationRequest`

  returns: Result of the ModifyVpcEndpointConnectionNotification operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationResult`"
  (^com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationRequest request]
    (-> this (.modifyVpcEndpointConnectionNotification request))))

(defn import-image
  "Import single or multi-volume disk images or EBS snapshots into an Amazon Machine Image (AMI). For more
   information, see Importing a VM as an
   Image Using VM Import/Export in the VM Import/Export User Guide.

  request - `com.amazonaws.services.ec2.model.ImportImageRequest`

  returns: Result of the ImportImage operation returned by the service. - `com.amazonaws.services.ec2.model.ImportImageResult`"
  (^com.amazonaws.services.ec2.model.ImportImageResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ImportImageRequest request]
    (-> this (.importImage request)))
  (^com.amazonaws.services.ec2.model.ImportImageResult [^AmazonEC2Client this]
    (-> this (.importImage))))

(defn describe-scheduled-instance-availability
  "Finds available schedules that meet the specified criteria.


   You can search for an available schedule no more than 3 months in advance. You must meet the minimum required
   duration of 1,200 hours per year. For example, the minimum daily schedule is 4 hours, the minimum weekly schedule
   is 24 hours, and the minimum monthly schedule is 100 hours.


   After you find a schedule that meets your needs, call PurchaseScheduledInstances to purchase Scheduled
   Instances with that schedule.

  request - `com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityRequest`

  returns: Result of the DescribeScheduledInstanceAvailability operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityResult`"
  (^com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityRequest request]
    (-> this (.describeScheduledInstanceAvailability request))))

(defn get-launch-template-data
  "Retrieves the configuration data of the specified instance. You can use this data to create a launch template.

  request - `com.amazonaws.services.ec2.model.GetLaunchTemplateDataRequest`

  returns: Result of the GetLaunchTemplateData operation returned by the service. - `com.amazonaws.services.ec2.model.GetLaunchTemplateDataResult`"
  (^com.amazonaws.services.ec2.model.GetLaunchTemplateDataResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.GetLaunchTemplateDataRequest request]
    (-> this (.getLaunchTemplateData request))))

(defn describe-transit-gateway-vpc-attachments
  "Describes one or more VPC attachments. By default, all VPC attachments are described. Alternatively, you can
   filter the results.

  request - `com.amazonaws.services.ec2.model.DescribeTransitGatewayVpcAttachmentsRequest`

  returns: Result of the DescribeTransitGatewayVpcAttachments operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeTransitGatewayVpcAttachmentsResult`"
  (^com.amazonaws.services.ec2.model.DescribeTransitGatewayVpcAttachmentsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeTransitGatewayVpcAttachmentsRequest request]
    (-> this (.describeTransitGatewayVpcAttachments request))))

(defn create-launch-template-version
  "Creates a new version for a launch template. You can specify an existing version of launch template from which to
   base the new version.


   Launch template versions are numbered in the order in which they are created. You cannot specify, change, or
   replace the numbering of launch template versions.

  request - `com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionRequest`

  returns: Result of the CreateLaunchTemplateVersion operation returned by the service. - `com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionResult`"
  (^com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionRequest request]
    (-> this (.createLaunchTemplateVersion request))))

(defn describe-fpga-image-attribute
  "Describes the specified attribute of the specified Amazon FPGA Image (AFI).

  request - `com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeRequest`

  returns: Result of the DescribeFpgaImageAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeResult`"
  (^com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeRequest request]
    (-> this (.describeFpgaImageAttribute request))))

(defn modify-traffic-mirror-session
  "Modifies a Traffic Mirror session.

  request - `com.amazonaws.services.ec2.model.ModifyTrafficMirrorSessionRequest`

  returns: Result of the ModifyTrafficMirrorSession operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyTrafficMirrorSessionResult`"
  (^com.amazonaws.services.ec2.model.ModifyTrafficMirrorSessionResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyTrafficMirrorSessionRequest request]
    (-> this (.modifyTrafficMirrorSession request))))

(defn create-default-vpc
  "Creates a default VPC with a size /16 IPv4 CIDR block and a default subnet in each Availability
   Zone. For more information about the components of a default VPC, see Default VPC and Default Subnets in
   the Amazon Virtual Private Cloud User Guide. You cannot specify the components of the default VPC
   yourself.


   If you deleted your previous default VPC, you can create a default VPC. You cannot have more than one default VPC
   per Region.


   If your account supports EC2-Classic, you cannot use this action to create a default VPC in a Region that
   supports EC2-Classic. If you want a default VPC in a Region that supports EC2-Classic, see
   \"I really want a default VPC for my existing EC2 account. Is that possible?\" in the Default VPCs FAQ.

  request - `com.amazonaws.services.ec2.model.CreateDefaultVpcRequest`

  returns: Result of the CreateDefaultVpc operation returned by the service. - `com.amazonaws.services.ec2.model.CreateDefaultVpcResult`"
  (^com.amazonaws.services.ec2.model.CreateDefaultVpcResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateDefaultVpcRequest request]
    (-> this (.createDefaultVpc request))))

(defn delete-transit-gateway
  "Deletes the specified transit gateway.

  request - `com.amazonaws.services.ec2.model.DeleteTransitGatewayRequest`

  returns: Result of the DeleteTransitGateway operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteTransitGatewayResult`"
  (^com.amazonaws.services.ec2.model.DeleteTransitGatewayResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayRequest request]
    (-> this (.deleteTransitGateway request))))

(defn allocate-address
  "Allocates an Elastic IP address to your AWS account. After you allocate the Elastic IP address you can associate
   it with an instance or network interface. After you release an Elastic IP address, it is released to the IP
   address pool and can be allocated to a different AWS account.


   You can allocate an Elastic IP address from an address pool owned by AWS or from an address pool created from a
   public IPv4 address range that you have brought to AWS for use with your AWS resources using bring your own IP
   addresses (BYOIP). For more information, see Bring Your Own IP Addresses (BYOIP)
   in the Amazon Elastic Compute Cloud User Guide.


   [EC2-VPC] If you release an Elastic IP address, you might be able to recover it. You cannot recover an Elastic IP
   address that you released after it is allocated to another AWS account. You cannot recover an Elastic IP address
   for EC2-Classic. To attempt to recover an Elastic IP address that you released, specify it in this operation.


   An Elastic IP address is for use either in the EC2-Classic platform or in a VPC. By default, you can allocate 5
   Elastic IP addresses for EC2-Classic per Region and 5 Elastic IP addresses for EC2-VPC per Region.


   For more information, see Elastic IP Addresses
   in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.AllocateAddressRequest`

  returns: Result of the AllocateAddress operation returned by the service. - `com.amazonaws.services.ec2.model.AllocateAddressResult`"
  (^com.amazonaws.services.ec2.model.AllocateAddressResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AllocateAddressRequest request]
    (-> this (.allocateAddress request)))
  (^com.amazonaws.services.ec2.model.AllocateAddressResult [^AmazonEC2Client this]
    (-> this (.allocateAddress))))

(defn detach-volume
  "Detaches an EBS volume from an instance. Make sure to unmount any file systems on the device within your
   operating system before detaching the volume. Failure to do so can result in the volume becoming stuck in the
   busy state while detaching. If this happens, detachment can be delayed indefinitely until you
   unmount the volume, force detachment, reboot the instance, or all three. If an EBS volume is the root device of
   an instance, it can't be detached while the instance is running. To detach the root volume, stop the instance
   first.


   When a volume with an AWS Marketplace product code is detached from an instance, the product code is no longer
   associated with the instance.


   For more information, see Detaching an Amazon EBS
   Volume in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DetachVolumeRequest`

  returns: Result of the DetachVolume operation returned by the service. - `com.amazonaws.services.ec2.model.DetachVolumeResult`"
  (^com.amazonaws.services.ec2.model.DetachVolumeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DetachVolumeRequest request]
    (-> this (.detachVolume request))))

(defn delete-transit-gateway-vpc-attachment
  "Deletes the specified VPC attachment.

  request - `com.amazonaws.services.ec2.model.DeleteTransitGatewayVpcAttachmentRequest`

  returns: Result of the DeleteTransitGatewayVpcAttachment operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteTransitGatewayVpcAttachmentResult`"
  (^com.amazonaws.services.ec2.model.DeleteTransitGatewayVpcAttachmentResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayVpcAttachmentRequest request]
    (-> this (.deleteTransitGatewayVpcAttachment request))))

(defn describe-fleets
  "Describes the specified EC2 Fleets or all your EC2 Fleets.

  request - `com.amazonaws.services.ec2.model.DescribeFleetsRequest`

  returns: Result of the DescribeFleets operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeFleetsResult`"
  (^com.amazonaws.services.ec2.model.DescribeFleetsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeFleetsRequest request]
    (-> this (.describeFleets request))))

(defn start-instances
  "Starts an Amazon EBS-backed instance that you've previously stopped.


   Instances that use Amazon EBS volumes as their root devices can be quickly stopped and started. When an instance
   is stopped, the compute resources are released and you are not billed for instance usage. However, your root
   partition Amazon EBS volume remains and continues to persist your data, and you are charged for Amazon EBS volume
   usage. You can restart your instance at any time. Every time you start your Windows instance, Amazon EC2 charges
   you for a full instance hour. If you stop and restart your Windows instance, a new instance hour begins and
   Amazon EC2 charges you for another full instance hour even if you are still within the same 60-minute period when
   it was stopped. Every time you start your Linux instance, Amazon EC2 charges a one-minute minimum for instance
   usage, and thereafter charges per second for instance usage.


   Before stopping an instance, make sure it is in a state from which it can be restarted. Stopping an instance does
   not preserve data stored in RAM.


   Performing this operation on an instance that uses an instance store as its root device returns an error.


   For more information, see Stopping
   Instances in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.StartInstancesRequest`

  returns: Result of the StartInstances operation returned by the service. - `com.amazonaws.services.ec2.model.StartInstancesResult`"
  (^com.amazonaws.services.ec2.model.StartInstancesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.StartInstancesRequest request]
    (-> this (.startInstances request))))

(defn terminate-instances
  "Shuts down the specified instances. This operation is idempotent; if you terminate an instance more than once,
   each call succeeds.


   If you specify multiple instances and the request fails (for example, because of a single incorrect instance ID),
   none of the instances are terminated.


   Terminated instances remain visible after termination (for approximately one hour).


   By default, Amazon EC2 deletes all EBS volumes that were attached when the instance launched. Volumes attached
   after instance launch continue running.


   You can stop, start, and terminate EBS-backed instances. You can only terminate instance store-backed instances.
   What happens to an instance differs if you stop it or terminate it. For example, when you stop an instance, the
   root device and any other devices attached to the instance persist. When you terminate an instance, any attached
   EBS volumes with the DeleteOnTermination block device mapping parameter set to true are
   automatically deleted. For more information about the differences between stopping and terminating instances, see
   Instance Lifecycle
   in the Amazon Elastic Compute Cloud User Guide.


   For more information about troubleshooting, see Troubleshooting Terminating Your Instance in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.TerminateInstancesRequest`

  returns: Result of the TerminateInstances operation returned by the service. - `com.amazonaws.services.ec2.model.TerminateInstancesResult`"
  (^com.amazonaws.services.ec2.model.TerminateInstancesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.TerminateInstancesRequest request]
    (-> this (.terminateInstances request))))

(defn unassign-private-ip-addresses
  "Unassigns one or more secondary private IP addresses from a network interface.

  request - `com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesRequest`

  returns: Result of the UnassignPrivateIpAddresses operation returned by the service. - `com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesResult`"
  (^com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesRequest request]
    (-> this (.unassignPrivateIpAddresses request))))

(defn describe-reserved-instances-modifications
  "Describes the modifications made to your Reserved Instances. If no parameter is specified, information about all
   your Reserved Instances modification requests is returned. If a modification ID is specified, only information
   about the specific modification is returned.


   For more information, see Modifying Reserved Instances in
   the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsRequest`

  returns: Result of the DescribeReservedInstancesModifications operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsResult`"
  (^com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsRequest request]
    (-> this (.describeReservedInstancesModifications request)))
  (^com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsResult [^AmazonEC2Client this]
    (-> this (.describeReservedInstancesModifications))))

(defn modify-instance-credit-specification
  "Modifies the credit option for CPU usage on a running or stopped T2 or T3 instance. The credit options are
   standard and unlimited.


   For more information, see Burstable
   Performance Instances in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationRequest`

  returns: Result of the ModifyInstanceCreditSpecification operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationResult`"
  (^com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationRequest request]
    (-> this (.modifyInstanceCreditSpecification request))))

(defn describe-snapshots
  "Describes the specified EBS snapshots available to you or all of the EBS snapshots available to you.


   The snapshots available to you include public snapshots, private snapshots that you own, and private snapshots
   owned by other AWS accounts for which you have explicit create volume permissions.


   The create volume permissions fall into the following categories:




   public: The owner of the snapshot granted create volume permissions for the snapshot to the
   all group. All AWS accounts have create volume permissions for these snapshots.




   explicit: The owner of the snapshot granted create volume permissions to a specific AWS account.




   implicit: An AWS account has implicit create volume permissions for all snapshots it owns.




   The list of snapshots returned can be modified by specifying snapshot IDs, snapshot owners, or AWS accounts with
   create volume permissions. If no options are specified, Amazon EC2 returns all snapshots for which you have
   create volume permissions.


   If you specify one or more snapshot IDs, only snapshots that have the specified IDs are returned. If you specify
   an invalid snapshot ID, an error is returned. If you specify a snapshot ID for which you do not have access, it
   is not included in the returned results.


   If you specify one or more snapshot owners using the OwnerIds option, only snapshots from the
   specified owners and for which you have access are returned. The results can include the AWS account IDs of the
   specified owners, amazon for snapshots owned by Amazon, or self for snapshots that you
   own.


   If you specify a list of restorable users, only snapshots with create snapshot permissions for those users are
   returned. You can specify AWS account IDs (if you own the snapshots), self for snapshots for which
   you own or have explicit permissions, or all for public snapshots.


   If you are describing a long list of snapshots, you can paginate the output to make the list more manageable. The
   MaxResults parameter sets the maximum number of results returned in a single page. If the list of
   results exceeds your MaxResults value, then that number of results is returned along with a
   NextToken value that can be passed to a subsequent DescribeSnapshots request to
   retrieve the remaining results.


   For more information about EBS snapshots, see Amazon EBS Snapshots in the
   Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeSnapshotsRequest`

  returns: Result of the DescribeSnapshots operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSnapshotsResult`"
  (^com.amazonaws.services.ec2.model.DescribeSnapshotsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeSnapshotsRequest request]
    (-> this (.describeSnapshots request)))
  (^com.amazonaws.services.ec2.model.DescribeSnapshotsResult [^AmazonEC2Client this]
    (-> this (.describeSnapshots))))

(defn move-address-to-vpc
  "Moves an Elastic IP address from the EC2-Classic platform to the EC2-VPC platform. The Elastic IP address must be
   allocated to your account for more than 24 hours, and it must not be associated with an instance. After the
   Elastic IP address is moved, it is no longer available for use in the EC2-Classic platform, unless you move it
   back using the RestoreAddressToClassic request. You cannot move an Elastic IP address that was originally
   allocated for use in the EC2-VPC platform to the EC2-Classic platform.

  request - `com.amazonaws.services.ec2.model.MoveAddressToVpcRequest`

  returns: Result of the MoveAddressToVpc operation returned by the service. - `com.amazonaws.services.ec2.model.MoveAddressToVpcResult`"
  (^com.amazonaws.services.ec2.model.MoveAddressToVpcResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.MoveAddressToVpcRequest request]
    (-> this (.moveAddressToVpc request))))

(defn describe-instance-credit-specifications
  "Describes the credit option for CPU usage of the specified T2 or T3 instances. The credit options are
   standard and unlimited.


   If you do not specify an instance ID, Amazon EC2 returns T2 and T3 instances with the unlimited
   credit option, as well as instances that were previously configured as T2 or T3 with the unlimited
   credit option. For example, if you resize a T2 instance, while it is configured as unlimited, to an
   M4 instance, Amazon EC2 returns the M4 instance.


   If you specify one or more instance IDs, Amazon EC2 returns the credit option (standard or
   unlimited) of those instances. If you specify an instance ID that is not valid, such as an instance
   that is not a T2 or T3 instance, an error is returned.


   Recently terminated instances might appear in the returned results. This interval is usually less than one hour.


   If an Availability Zone is experiencing a service disruption and you specify instance IDs in the affected zone,
   or do not specify any instance IDs at all, the call fails. If you specify only instance IDs in an unaffected
   zone, the call works normally.


   For more information, see Burstable
   Performance Instances in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsRequest`

  returns: Result of the DescribeInstanceCreditSpecifications operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsResult`"
  (^com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsRequest request]
    (-> this (.describeInstanceCreditSpecifications request))))

(defn describe-vpc-attribute
  "Describes the specified attribute of the specified VPC. You can specify only one attribute at a time.

  request - `com.amazonaws.services.ec2.model.DescribeVpcAttributeRequest`

  returns: Result of the DescribeVpcAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcAttributeResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeVpcAttributeRequest request]
    (-> this (.describeVpcAttribute request))))

(defn describe-bundle-tasks
  "Describes the specified bundle tasks or all of your bundle tasks.



   Completed bundle tasks are listed for only a limited time. If your bundle task is no longer in the list, you can
   still register an AMI from it. Just use RegisterImage with the Amazon S3 bucket name and image
   manifest name you provided to the bundle task.

  request - `com.amazonaws.services.ec2.model.DescribeBundleTasksRequest`

  returns: Result of the DescribeBundleTasks operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeBundleTasksResult`"
  (^com.amazonaws.services.ec2.model.DescribeBundleTasksResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeBundleTasksRequest request]
    (-> this (.describeBundleTasks request)))
  (^com.amazonaws.services.ec2.model.DescribeBundleTasksResult [^AmazonEC2Client this]
    (-> this (.describeBundleTasks))))

(defn describe-vpc-classic-link-dns-support
  "Describes the ClassicLink DNS support status of one or more VPCs. If enabled, the DNS hostname of a linked
   EC2-Classic instance resolves to its private IP address when addressed from an instance in the VPC to which it's
   linked. Similarly, the DNS hostname of an instance in a VPC resolves to its private IP address when addressed
   from a linked EC2-Classic instance. For more information, see ClassicLink in the Amazon
   Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportRequest`

  returns: Result of the DescribeVpcClassicLinkDnsSupport operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportRequest request]
    (-> this (.describeVpcClassicLinkDnsSupport request))))

(defn describe-spot-price-history
  "Describes the Spot price history. For more information, see Spot Instance
   Pricing History in the Amazon EC2 User Guide for Linux Instances.


   When you specify a start and end time, this operation returns the prices of the instance types within the time
   range that you specified and the time when the price changed. The price is valid within the time period that you
   specified; the response merely indicates the last time that the price changed.

  request - `com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryRequest`

  returns: Result of the DescribeSpotPriceHistory operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryResult`"
  (^com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryRequest request]
    (-> this (.describeSpotPriceHistory request)))
  (^com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryResult [^AmazonEC2Client this]
    (-> this (.describeSpotPriceHistory))))

(defn revoke-client-vpn-ingress
  "Removes an ingress authorization rule from a Client VPN endpoint.

  request - `com.amazonaws.services.ec2.model.RevokeClientVpnIngressRequest`

  returns: Result of the RevokeClientVpnIngress operation returned by the service. - `com.amazonaws.services.ec2.model.RevokeClientVpnIngressResult`"
  (^com.amazonaws.services.ec2.model.RevokeClientVpnIngressResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.RevokeClientVpnIngressRequest request]
    (-> this (.revokeClientVpnIngress request))))

(defn modify-instance-attribute
  "Modifies the specified attribute of the specified instance. You can specify only one attribute at a time.


   Note: Using this action to change the security groups associated with an elastic network interface (ENI)
   attached to an instance in a VPC can result in an error if the instance has more than one ENI. To change the
   security groups associated with an ENI attached to an instance that has multiple ENIs, we recommend that you use
   the ModifyNetworkInterfaceAttribute action.


   To modify some attributes, the instance must be stopped. For more information, see Modifying Attributes of a Stopped Instance in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.ModifyInstanceAttributeRequest`

  returns: Result of the ModifyInstanceAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyInstanceAttributeResult`"
  (^com.amazonaws.services.ec2.model.ModifyInstanceAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyInstanceAttributeRequest request]
    (-> this (.modifyInstanceAttribute request))))

(defn create-spot-datafeed-subscription
  "Creates a data feed for Spot Instances, enabling you to view Spot Instance usage logs. You can create one data
   feed per AWS account. For more information, see Spot Instance Data Feed in
   the Amazon EC2 User Guide for Linux Instances.

  request - `com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionRequest`

  returns: Result of the CreateSpotDatafeedSubscription operation returned by the service. - `com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionResult`"
  (^com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionRequest request]
    (-> this (.createSpotDatafeedSubscription request))))

(defn get-transit-gateway-route-table-propagations
  "Gets information about the route table propagations for the specified transit gateway route table.

  request - `com.amazonaws.services.ec2.model.GetTransitGatewayRouteTablePropagationsRequest`

  returns: Result of the GetTransitGatewayRouteTablePropagations operation returned by the service. - `com.amazonaws.services.ec2.model.GetTransitGatewayRouteTablePropagationsResult`"
  (^com.amazonaws.services.ec2.model.GetTransitGatewayRouteTablePropagationsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.GetTransitGatewayRouteTablePropagationsRequest request]
    (-> this (.getTransitGatewayRouteTablePropagations request))))

(defn detach-classic-link-vpc
  "Unlinks (detaches) a linked EC2-Classic instance from a VPC. After the instance has been unlinked, the VPC
   security groups are no longer associated with it. An instance is automatically unlinked from a VPC when it's
   stopped.

  request - `com.amazonaws.services.ec2.model.DetachClassicLinkVpcRequest`

  returns: Result of the DetachClassicLinkVpc operation returned by the service. - `com.amazonaws.services.ec2.model.DetachClassicLinkVpcResult`"
  (^com.amazonaws.services.ec2.model.DetachClassicLinkVpcResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DetachClassicLinkVpcRequest request]
    (-> this (.detachClassicLinkVpc request))))

(defn unmonitor-instances
  "Disables detailed monitoring for a running instance. For more information, see Monitoring Your Instances and
   Volumes in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.UnmonitorInstancesRequest`

  returns: Result of the UnmonitorInstances operation returned by the service. - `com.amazonaws.services.ec2.model.UnmonitorInstancesResult`"
  (^com.amazonaws.services.ec2.model.UnmonitorInstancesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.UnmonitorInstancesRequest request]
    (-> this (.unmonitorInstances request))))

(defn create-nat-gateway
  "Creates a NAT gateway in the specified public subnet. This action creates a network interface in the specified
   subnet with a private IP address from the IP address range of the subnet. Internet-bound traffic from a private
   subnet can be routed to the NAT gateway, therefore enabling instances in the private subnet to connect to the
   internet. For more information, see NAT Gateways in the Amazon
   Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateNatGatewayRequest`

  returns: Result of the CreateNatGateway operation returned by the service. - `com.amazonaws.services.ec2.model.CreateNatGatewayResult`"
  (^com.amazonaws.services.ec2.model.CreateNatGatewayResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateNatGatewayRequest request]
    (-> this (.createNatGateway request))))

(defn describe-vpn-connections
  "Describes one or more of your VPN connections.


   For more information, see AWS Site-to-Site
   VPN in the AWS Site-to-Site VPN User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeVpnConnectionsRequest`

  returns: Result of the DescribeVpnConnections operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpnConnectionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpnConnectionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeVpnConnectionsRequest request]
    (-> this (.describeVpnConnections request)))
  (^com.amazonaws.services.ec2.model.DescribeVpnConnectionsResult [^AmazonEC2Client this]
    (-> this (.describeVpnConnections))))

(defn describe-client-vpn-routes
  "Describes the routes for the specified Client VPN endpoint.

  request - `com.amazonaws.services.ec2.model.DescribeClientVpnRoutesRequest`

  returns: Result of the DescribeClientVpnRoutes operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeClientVpnRoutesResult`"
  (^com.amazonaws.services.ec2.model.DescribeClientVpnRoutesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeClientVpnRoutesRequest request]
    (-> this (.describeClientVpnRoutes request))))

(defn import-key-pair
  "Imports the public key from an RSA key pair that you created with a third-party tool. Compare this with
   CreateKeyPair, in which AWS creates the key pair and gives the keys to you (AWS keeps a copy of the public
   key). With ImportKeyPair, you create the key pair and give AWS just the public key. The private key is never
   transferred between you and AWS.


   For more information about key pairs, see Key Pairs in the Amazon
   Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.ImportKeyPairRequest`

  returns: Result of the ImportKeyPair operation returned by the service. - `com.amazonaws.services.ec2.model.ImportKeyPairResult`"
  (^com.amazonaws.services.ec2.model.ImportKeyPairResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ImportKeyPairRequest request]
    (-> this (.importKeyPair request))))

(defn accept-transit-gateway-vpc-attachment
  "Accepts a request to attach a VPC to a transit gateway.


   The VPC attachment must be in the pendingAcceptance state. Use
   DescribeTransitGatewayVpcAttachments to view your pending VPC attachment requests. Use
   RejectTransitGatewayVpcAttachment to reject a VPC attachment request.

  request - `com.amazonaws.services.ec2.model.AcceptTransitGatewayVpcAttachmentRequest`

  returns: Result of the AcceptTransitGatewayVpcAttachment operation returned by the service. - `com.amazonaws.services.ec2.model.AcceptTransitGatewayVpcAttachmentResult`"
  (^com.amazonaws.services.ec2.model.AcceptTransitGatewayVpcAttachmentResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AcceptTransitGatewayVpcAttachmentRequest request]
    (-> this (.acceptTransitGatewayVpcAttachment request))))

(defn cancel-export-task
  "Cancels an active export task. The request removes all artifacts of the export, including any partially-created
   Amazon S3 objects. If the export task is complete or is in the process of transferring the final disk image, the
   command fails and returns an error.

  request - `com.amazonaws.services.ec2.model.CancelExportTaskRequest`

  returns: Result of the CancelExportTask operation returned by the service. - `com.amazonaws.services.ec2.model.CancelExportTaskResult`"
  (^com.amazonaws.services.ec2.model.CancelExportTaskResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CancelExportTaskRequest request]
    (-> this (.cancelExportTask request))))

(defn release-hosts
  "When you no longer want to use an On-Demand Dedicated Host it can be released. On-Demand billing is stopped and
   the host goes into released state. The host ID of Dedicated Hosts that have been released can no
   longer be specified in another request, for example, to modify the host. You must stop or terminate all instances
   on a host before it can be released.


   When Dedicated Hosts are released, it may take some time for them to stop counting toward your limit and you may
   receive capacity errors when trying to allocate new Dedicated Hosts. Wait a few minutes and then try again.


   Released hosts still appear in a DescribeHosts response.

  request - `com.amazonaws.services.ec2.model.ReleaseHostsRequest`

  returns: Result of the ReleaseHosts operation returned by the service. - `com.amazonaws.services.ec2.model.ReleaseHostsResult`"
  (^com.amazonaws.services.ec2.model.ReleaseHostsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ReleaseHostsRequest request]
    (-> this (.releaseHosts request))))

(defn modify-launch-template
  "Modifies a launch template. You can specify which version of the launch template to set as the default version.
   When launching an instance, the default version applies when a launch template version is not specified.

  request - `com.amazonaws.services.ec2.model.ModifyLaunchTemplateRequest`

  returns: Result of the ModifyLaunchTemplate operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyLaunchTemplateResult`"
  (^com.amazonaws.services.ec2.model.ModifyLaunchTemplateResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyLaunchTemplateRequest request]
    (-> this (.modifyLaunchTemplate request))))

(defn describe-security-group-references
  "[VPC only] Describes the VPCs on the other side of a VPC peering connection that are referencing the security
   groups you've specified in this request.

  request - `com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesRequest`

  returns: Result of the DescribeSecurityGroupReferences operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesResult`"
  (^com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesRequest request]
    (-> this (.describeSecurityGroupReferences request))))

(defn delete-internet-gateway
  "Deletes the specified internet gateway. You must detach the internet gateway from the VPC before you can delete
   it.

  request - `com.amazonaws.services.ec2.model.DeleteInternetGatewayRequest`

  returns: Result of the DeleteInternetGateway operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteInternetGatewayResult`"
  (^com.amazonaws.services.ec2.model.DeleteInternetGatewayResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteInternetGatewayRequest request]
    (-> this (.deleteInternetGateway request))))

(defn delete-launch-template
  "Deletes a launch template. Deleting a launch template deletes all of its versions.

  request - `com.amazonaws.services.ec2.model.DeleteLaunchTemplateRequest`

  returns: Result of the DeleteLaunchTemplate operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteLaunchTemplateResult`"
  (^com.amazonaws.services.ec2.model.DeleteLaunchTemplateResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteLaunchTemplateRequest request]
    (-> this (.deleteLaunchTemplate request))))

(defn delete-nat-gateway
  "Deletes the specified NAT gateway. Deleting a NAT gateway disassociates its Elastic IP address, but does not
   release the address from your account. Deleting a NAT gateway does not delete any NAT gateway routes in your
   route tables.

  request - `com.amazonaws.services.ec2.model.DeleteNatGatewayRequest`

  returns: Result of the DeleteNatGateway operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteNatGatewayResult`"
  (^com.amazonaws.services.ec2.model.DeleteNatGatewayResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteNatGatewayRequest request]
    (-> this (.deleteNatGateway request))))

(defn reset-network-interface-attribute
  "Resets a network interface attribute. You can specify only one attribute at a time.

  request - `com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeRequest`

  returns: Result of the ResetNetworkInterfaceAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeResult`"
  (^com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeRequest request]
    (-> this (.resetNetworkInterfaceAttribute request))))

(defn deprovision-byoip-cidr
  "Releases the specified address range that you provisioned for use with your AWS resources through bring your own
   IP addresses (BYOIP) and deletes the corresponding address pool.


   Before you can release an address range, you must stop advertising it using WithdrawByoipCidr and you must
   not have any IP addresses allocated from its address range.

  request - `com.amazonaws.services.ec2.model.DeprovisionByoipCidrRequest`

  returns: Result of the DeprovisionByoipCidr operation returned by the service. - `com.amazonaws.services.ec2.model.DeprovisionByoipCidrResult`"
  (^com.amazonaws.services.ec2.model.DeprovisionByoipCidrResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeprovisionByoipCidrRequest request]
    (-> this (.deprovisionByoipCidr request))))

(defn delete-vpn-gateway
  "Deletes the specified virtual private gateway. We recommend that before you delete a virtual private gateway, you
   detach it from the VPC and delete the VPN connection. Note that you don't need to delete the virtual private
   gateway if you plan to delete and recreate the VPN connection between your VPC and your network.

  request - `com.amazonaws.services.ec2.model.DeleteVpnGatewayRequest`

  returns: Result of the DeleteVpnGateway operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteVpnGatewayResult`"
  (^com.amazonaws.services.ec2.model.DeleteVpnGatewayResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteVpnGatewayRequest request]
    (-> this (.deleteVpnGateway request))))

(defn describe-transit-gateway-route-tables
  "Describes one or more transit gateway route tables. By default, all transit gateway route tables are described.
   Alternatively, you can filter the results.

  request - `com.amazonaws.services.ec2.model.DescribeTransitGatewayRouteTablesRequest`

  returns: Result of the DescribeTransitGatewayRouteTables operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeTransitGatewayRouteTablesResult`"
  (^com.amazonaws.services.ec2.model.DescribeTransitGatewayRouteTablesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeTransitGatewayRouteTablesRequest request]
    (-> this (.describeTransitGatewayRouteTables request))))

(defn describe-hosts
  "Describes the specified Dedicated Hosts or all your Dedicated Hosts.


   The results describe only the Dedicated Hosts in the Region you're currently using. All listed instances consume
   capacity on your Dedicated Host. Dedicated Hosts that have recently been released are listed with the state
   released.

  request - `com.amazonaws.services.ec2.model.DescribeHostsRequest`

  returns: Result of the DescribeHosts operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeHostsResult`"
  (^com.amazonaws.services.ec2.model.DescribeHostsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeHostsRequest request]
    (-> this (.describeHosts request)))
  (^com.amazonaws.services.ec2.model.DescribeHostsResult [^AmazonEC2Client this]
    (-> this (.describeHosts))))

(defn describe-conversion-tasks
  "Describes the specified conversion tasks or all your conversion tasks. For more information, see the VM Import/Export User Guide.


   For information about the import manifest referenced by this API action, see VM Import Manifest.

  request - `com.amazonaws.services.ec2.model.DescribeConversionTasksRequest`

  returns: Result of the DescribeConversionTasks operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeConversionTasksResult`"
  (^com.amazonaws.services.ec2.model.DescribeConversionTasksResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeConversionTasksRequest request]
    (-> this (.describeConversionTasks request)))
  (^com.amazonaws.services.ec2.model.DescribeConversionTasksResult [^AmazonEC2Client this]
    (-> this (.describeConversionTasks))))

(defn describe-image-attribute
  "Describes the specified attribute of the specified AMI. You can specify only one attribute at a time.

  request - `com.amazonaws.services.ec2.model.DescribeImageAttributeRequest`

  returns: Result of the DescribeImageAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeImageAttributeResult`"
  (^com.amazonaws.services.ec2.model.DescribeImageAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeImageAttributeRequest request]
    (-> this (.describeImageAttribute request))))

(defn create-dhcp-options
  "Creates a set of DHCP options for your VPC. After creating the set, you must associate it with the VPC, causing
   all existing and new instances that you launch in the VPC to use this set of DHCP options. The following are the
   individual DHCP options you can specify. For more information about the options, see RFC 2132.




   domain-name-servers - The IP addresses of up to four domain name servers, or AmazonProvidedDNS. The
   default DHCP option set specifies AmazonProvidedDNS. If specifying more than one domain name server, specify the
   IP addresses in a single parameter, separated by commas. To have your instance receive a custom DNS hostname as
   specified in domain-name, you must set domain-name-servers to a custom DNS server.




   domain-name - If you're using AmazonProvidedDNS in us-east-1, specify
   ec2.internal. If you're using AmazonProvidedDNS in another Region, specify
   region.compute.internal (for example, ap-northeast-1.compute.internal). Otherwise,
   specify a domain name (for example, MyCompany.com). This value is used to complete unqualified DNS
   hostnames. Important: Some Linux operating systems accept multiple domain names separated by spaces.
   However, Windows and other Linux operating systems treat the value as a single domain, which results in
   unexpected behavior. If your DHCP options set is associated with a VPC that has instances with multiple operating
   systems, specify only one domain name.




   ntp-servers - The IP addresses of up to four Network Time Protocol (NTP) servers.




   netbios-name-servers - The IP addresses of up to four NetBIOS name servers.




   netbios-node-type - The NetBIOS node type (1, 2, 4, or 8). We recommend that you specify 2
   (broadcast and multicast are not currently supported). For more information about these node types, see RFC 2132.




   Your VPC automatically starts out with a set of DHCP options that includes only a DNS server that we provide
   (AmazonProvidedDNS). If you create a set of options, and if your VPC has an internet gateway, make sure to set
   the domain-name-servers option either to AmazonProvidedDNS or to a domain name server
   of your choice. For more information, see DHCP Options Sets in the
   Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateDhcpOptionsRequest`

  returns: Result of the CreateDhcpOptions operation returned by the service. - `com.amazonaws.services.ec2.model.CreateDhcpOptionsResult`"
  (^com.amazonaws.services.ec2.model.CreateDhcpOptionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateDhcpOptionsRequest request]
    (-> this (.createDhcpOptions request))))

(defn delete-transit-gateway-route-table
  "Deletes the specified transit gateway route table. You must disassociate the route table from any transit gateway
   route tables before you can delete it.

  request - `com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteTableRequest`

  returns: Result of the DeleteTransitGatewayRouteTable operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteTableResult`"
  (^com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteTableResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteTableRequest request]
    (-> this (.deleteTransitGatewayRouteTable request))))

(defn purchase-scheduled-instances
  "Purchases the Scheduled Instances with the specified schedule.


   Scheduled Instances enable you to purchase Amazon EC2 compute capacity by the hour for a one-year term. Before
   you can purchase a Scheduled Instance, you must call DescribeScheduledInstanceAvailability to check for
   available schedules and obtain a purchase token. After you purchase a Scheduled Instance, you must call
   RunScheduledInstances during each scheduled time period.


   After you purchase a Scheduled Instance, you can't cancel, modify, or resell your purchase.

  request - `com.amazonaws.services.ec2.model.PurchaseScheduledInstancesRequest`

  returns: Result of the PurchaseScheduledInstances operation returned by the service. - `com.amazonaws.services.ec2.model.PurchaseScheduledInstancesResult`"
  (^com.amazonaws.services.ec2.model.PurchaseScheduledInstancesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.PurchaseScheduledInstancesRequest request]
    (-> this (.purchaseScheduledInstances request))))

(defn replace-network-acl-entry
  "Replaces an entry (rule) in a network ACL. For more information, see Network ACLs in the Amazon Virtual
   Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryRequest`

  returns: Result of the ReplaceNetworkAclEntry operation returned by the service. - `com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryResult`"
  (^com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryRequest request]
    (-> this (.replaceNetworkAclEntry request))))

(defn modify-id-format
  "Modifies the ID format for the specified resource on a per-Region basis. You can specify that resources should
   receive longer IDs (17-character IDs) when they are created.


   This request can only be used to modify longer ID settings for resource types that are within the opt-in period.
   Resources currently in their opt-in period include: bundle | conversion-task |
   customer-gateway | dhcp-options | elastic-ip-allocation |
   elastic-ip-association | export-task | flow-log | image |
   import-task | internet-gateway | network-acl |
   network-acl-association | network-interface | network-interface-attachment
   | prefix-list | route-table | route-table-association |
   security-group | subnet | subnet-cidr-block-association | vpc
   | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection |
   vpn-connection | vpn-gateway.


   This setting applies to the IAM user who makes the request; it does not apply to the entire AWS account. By
   default, an IAM user defaults to the same settings as the root user. If you're using this action as the root
   user, then these settings apply to the entire account, unless an IAM user explicitly overrides these settings for
   themselves. For more information, see Resource IDs in the Amazon
   Elastic Compute Cloud User Guide.


   Resources created with longer IDs are visible to all IAM roles and users, regardless of these settings and
   provided that they have permission to use the relevant Describe command for the resource type.

  request - `com.amazonaws.services.ec2.model.ModifyIdFormatRequest`

  returns: Result of the ModifyIdFormat operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyIdFormatResult`"
  (^com.amazonaws.services.ec2.model.ModifyIdFormatResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyIdFormatRequest request]
    (-> this (.modifyIdFormat request))))

(defn get-capacity-reservation-usage
  "request - `com.amazonaws.services.ec2.model.GetCapacityReservationUsageRequest`

  returns: Result of the GetCapacityReservationUsage operation returned by the service. - `com.amazonaws.services.ec2.model.GetCapacityReservationUsageResult`"
  (^com.amazonaws.services.ec2.model.GetCapacityReservationUsageResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.GetCapacityReservationUsageRequest request]
    (-> this (.getCapacityReservationUsage request))))

(defn cancel-import-task
  "Cancels an in-process import virtual machine or import snapshot task.

  request - `com.amazonaws.services.ec2.model.CancelImportTaskRequest`

  returns: Result of the CancelImportTask operation returned by the service. - `com.amazonaws.services.ec2.model.CancelImportTaskResult`"
  (^com.amazonaws.services.ec2.model.CancelImportTaskResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CancelImportTaskRequest request]
    (-> this (.cancelImportTask request)))
  (^com.amazonaws.services.ec2.model.CancelImportTaskResult [^AmazonEC2Client this]
    (-> this (.cancelImportTask))))

(defn describe-client-vpn-target-networks
  "Describes the target networks associated with the specified Client VPN endpoint.

  request - `com.amazonaws.services.ec2.model.DescribeClientVpnTargetNetworksRequest`

  returns: Result of the DescribeClientVpnTargetNetworks operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeClientVpnTargetNetworksResult`"
  (^com.amazonaws.services.ec2.model.DescribeClientVpnTargetNetworksResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeClientVpnTargetNetworksRequest request]
    (-> this (.describeClientVpnTargetNetworks request))))

(defn attach-vpn-gateway
  "Attaches a virtual private gateway to a VPC. You can attach one virtual private gateway to one VPC at a time.


   For more information, see AWS Site-to-Site
   VPN in the AWS Site-to-Site VPN User Guide.

  request - `com.amazonaws.services.ec2.model.AttachVpnGatewayRequest`

  returns: Result of the AttachVpnGateway operation returned by the service. - `com.amazonaws.services.ec2.model.AttachVpnGatewayResult`"
  (^com.amazonaws.services.ec2.model.AttachVpnGatewayResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AttachVpnGatewayRequest request]
    (-> this (.attachVpnGateway request))))

(defn create-traffic-mirror-target
  "Creates a target for your Traffic Mirror session.


   A Traffic Mirror target is the destination for mirrored traffic. The Traffic Mirror source and the Traffic Mirror
   target (monitoring appliances) can be in the same VPC, or in different VPCs connected via VPC peering or a
   transit gateway.


   A Traffic Mirror target can be a network interface, or a Network Load Balancer.


   To use the target in a Traffic Mirror session, use CreateTrafficMirrorSession.

  request - `com.amazonaws.services.ec2.model.CreateTrafficMirrorTargetRequest`

  returns: Result of the CreateTrafficMirrorTarget operation returned by the service. - `com.amazonaws.services.ec2.model.CreateTrafficMirrorTargetResult`"
  (^com.amazonaws.services.ec2.model.CreateTrafficMirrorTargetResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorTargetRequest request]
    (-> this (.createTrafficMirrorTarget request))))

(defn describe-instances
  "Describes the specified instances or all of AWS account's instances.


   If you specify one or more instance IDs, Amazon EC2 returns information for those instances. If you do not
   specify instance IDs, Amazon EC2 returns information for all relevant instances. If you specify an instance ID
   that is not valid, an error is returned. If you specify an instance that you do not own, it is not included in
   the returned results.


   Recently terminated instances might appear in the returned results. This interval is usually less than one hour.


   If you describe instances in the rare case where an Availability Zone is experiencing a service disruption and
   you specify instance IDs that are in the affected zone, or do not specify any instance IDs at all, the call
   fails. If you describe instances and specify only instance IDs that are in an unaffected zone, the call works
   normally.

  request - `com.amazonaws.services.ec2.model.DescribeInstancesRequest`

  returns: Result of the DescribeInstances operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeInstancesResult`"
  (^com.amazonaws.services.ec2.model.DescribeInstancesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeInstancesRequest request]
    (-> this (.describeInstances request)))
  (^com.amazonaws.services.ec2.model.DescribeInstancesResult [^AmazonEC2Client this]
    (-> this (.describeInstances))))

(defn export-transit-gateway-routes
  "Exports routes from the specified transit gateway route table to the specified S3 bucket. By default, all routes
   are exported. Alternatively, you can filter by CIDR range.

  request - `com.amazonaws.services.ec2.model.ExportTransitGatewayRoutesRequest`

  returns: Result of the ExportTransitGatewayRoutes operation returned by the service. - `com.amazonaws.services.ec2.model.ExportTransitGatewayRoutesResult`"
  (^com.amazonaws.services.ec2.model.ExportTransitGatewayRoutesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ExportTransitGatewayRoutesRequest request]
    (-> this (.exportTransitGatewayRoutes request))))

(defn enable-volume-io
  "Enables I/O operations for a volume that had I/O operations disabled because the data on the volume was
   potentially inconsistent.

  request - `com.amazonaws.services.ec2.model.EnableVolumeIORequest`

  returns: Result of the EnableVolumeIO operation returned by the service. - `com.amazonaws.services.ec2.model.EnableVolumeIOResult`"
  (^com.amazonaws.services.ec2.model.EnableVolumeIOResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.EnableVolumeIORequest request]
    (-> this (.enableVolumeIO request))))

(defn get-host-reservation-purchase-preview
  "Preview a reservation purchase with configurations that match those of your Dedicated Host. You must have active
   Dedicated Hosts in your account before you purchase a reservation.


   This is a preview of the PurchaseHostReservation action and does not result in the offering being
   purchased.

  request - `com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewRequest`

  returns: Result of the GetHostReservationPurchasePreview operation returned by the service. - `com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewResult`"
  (^com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewRequest request]
    (-> this (.getHostReservationPurchasePreview request))))

(defn create-customer-gateway
  "Provides information to AWS about your VPN customer gateway device. The customer gateway is the appliance at your
   end of the VPN connection. (The device on the AWS side of the VPN connection is the virtual private gateway.) You
   must provide the Internet-routable IP address of the customer gateway's external interface. The IP address must
   be static and may be behind a device performing network address translation (NAT).


   For devices that use Border Gateway Protocol (BGP), you can also provide the device's BGP Autonomous System
   Number (ASN). You can use an existing ASN assigned to your network. If you don't have an ASN already, you can use
   a private ASN (in the 64512 - 65534 range).



   Amazon EC2 supports all 2-byte ASN numbers in the range of 1 - 65534, with the exception of 7224, which is
   reserved in the us-east-1 Region, and 9059, which is reserved in the eu-west-1 Region.



   For more information, see AWS Site-to-Site
   VPN in the AWS Site-to-Site VPN User Guide.



   You cannot create more than one customer gateway with the same VPN type, IP address, and BGP ASN parameter
   values. If you run an identical request more than one time, the first request creates the customer gateway, and
   subsequent requests return information about the existing customer gateway. The subsequent requests do not create
   new customer gateway resources.

  request - `com.amazonaws.services.ec2.model.CreateCustomerGatewayRequest`

  returns: Result of the CreateCustomerGateway operation returned by the service. - `com.amazonaws.services.ec2.model.CreateCustomerGatewayResult`"
  (^com.amazonaws.services.ec2.model.CreateCustomerGatewayResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateCustomerGatewayRequest request]
    (-> this (.createCustomerGateway request))))

(defn modify-instance-event-start-time
  "Modifies the start time for a scheduled Amazon EC2 instance event.

  request - `com.amazonaws.services.ec2.model.ModifyInstanceEventStartTimeRequest`

  returns: Result of the ModifyInstanceEventStartTime operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyInstanceEventStartTimeResult`"
  (^com.amazonaws.services.ec2.model.ModifyInstanceEventStartTimeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyInstanceEventStartTimeRequest request]
    (-> this (.modifyInstanceEventStartTime request))))

(defn modify-vpc-attribute
  "Modifies the specified attribute of the specified VPC.

  request - `com.amazonaws.services.ec2.model.ModifyVpcAttributeRequest`

  returns: Result of the ModifyVpcAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVpcAttributeResult`"
  (^com.amazonaws.services.ec2.model.ModifyVpcAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyVpcAttributeRequest request]
    (-> this (.modifyVpcAttribute request))))

(defn delete-client-vpn-endpoint
  "Deletes the specified Client VPN endpoint. You must disassociate all target networks before you can delete a
   Client VPN endpoint.

  request - `com.amazonaws.services.ec2.model.DeleteClientVpnEndpointRequest`

  returns: Result of the DeleteClientVpnEndpoint operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteClientVpnEndpointResult`"
  (^com.amazonaws.services.ec2.model.DeleteClientVpnEndpointResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteClientVpnEndpointRequest request]
    (-> this (.deleteClientVpnEndpoint request))))

(defn revoke-security-group-ingress
  "Removes the specified ingress rules from a security group. To remove a rule, the values that you specify (for
   example, ports) must match the existing rule's values exactly.



   [EC2-Classic only] If the values you specify do not match the existing rule's values, no error is returned. Use
   DescribeSecurityGroups to verify that the rule has been removed.



   Each rule consists of the protocol and the CIDR range or source security group. For the TCP and UDP protocols,
   you must also specify the destination port or range of ports. For the ICMP protocol, you must also specify the
   ICMP type and code. If the security group rule has a description, you do not have to specify the description to
   revoke the rule.


   Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay
   might occur.

  request - `com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressRequest`

  returns: Result of the RevokeSecurityGroupIngress operation returned by the service. - `com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressResult`"
  (^com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressRequest request]
    (-> this (.revokeSecurityGroupIngress request)))
  (^com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressResult [^AmazonEC2Client this]
    (-> this (.revokeSecurityGroupIngress))))

(defn describe-flow-logs
  "Describes one or more flow logs. To view the information in your flow logs (the log streams for the network
   interfaces), you must use the CloudWatch Logs console or the CloudWatch Logs API.

  request - `com.amazonaws.services.ec2.model.DescribeFlowLogsRequest`

  returns: Result of the DescribeFlowLogs operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeFlowLogsResult`"
  (^com.amazonaws.services.ec2.model.DescribeFlowLogsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeFlowLogsRequest request]
    (-> this (.describeFlowLogs request)))
  (^com.amazonaws.services.ec2.model.DescribeFlowLogsResult [^AmazonEC2Client this]
    (-> this (.describeFlowLogs))))

(defn describe-export-tasks
  "Describes the specified export tasks or all your export tasks.

  request - `com.amazonaws.services.ec2.model.DescribeExportTasksRequest`

  returns: Result of the DescribeExportTasks operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeExportTasksResult`"
  (^com.amazonaws.services.ec2.model.DescribeExportTasksResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeExportTasksRequest request]
    (-> this (.describeExportTasks request)))
  (^com.amazonaws.services.ec2.model.DescribeExportTasksResult [^AmazonEC2Client this]
    (-> this (.describeExportTasks))))

(defn attach-internet-gateway
  "Attaches an internet gateway to a VPC, enabling connectivity between the internet and the VPC. For more
   information about your VPC and internet gateway, see the Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.AttachInternetGatewayRequest`

  returns: Result of the AttachInternetGateway operation returned by the service. - `com.amazonaws.services.ec2.model.AttachInternetGatewayResult`"
  (^com.amazonaws.services.ec2.model.AttachInternetGatewayResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AttachInternetGatewayRequest request]
    (-> this (.attachInternetGateway request))))

(defn confirm-product-instance
  "Determines whether a product code is associated with an instance. This action can only be used by the owner of
   the product code. It is useful when a product code owner must verify whether another user's instance is eligible
   for support.

  request - `com.amazonaws.services.ec2.model.ConfirmProductInstanceRequest`

  returns: Result of the ConfirmProductInstance operation returned by the service. - `com.amazonaws.services.ec2.model.ConfirmProductInstanceResult`"
  (^com.amazonaws.services.ec2.model.ConfirmProductInstanceResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ConfirmProductInstanceRequest request]
    (-> this (.confirmProductInstance request))))

(defn create-egress-only-internet-gateway
  "[IPv6 only] Creates an egress-only internet gateway for your VPC. An egress-only internet gateway is used to
   enable outbound communication over IPv6 from instances in your VPC to the internet, and prevents hosts outside of
   your VPC from initiating an IPv6 connection with your instance.

  request - `com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayRequest`

  returns: Result of the CreateEgressOnlyInternetGateway operation returned by the service. - `com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayResult`"
  (^com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayRequest request]
    (-> this (.createEgressOnlyInternetGateway request))))

(defn describe-public-ipv-4-pools
  "Describes the specified IPv4 address pools.

  request - `com.amazonaws.services.ec2.model.DescribePublicIpv4PoolsRequest`

  returns: Result of the DescribePublicIpv4Pools operation returned by the service. - `com.amazonaws.services.ec2.model.DescribePublicIpv4PoolsResult`"
  (^com.amazonaws.services.ec2.model.DescribePublicIpv4PoolsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribePublicIpv4PoolsRequest request]
    (-> this (.describePublicIpv4Pools request))))

(defn authorize-client-vpn-ingress
  "Adds an ingress authorization rule to a Client VPN endpoint. Ingress authorization rules act as firewall rules
   that grant access to networks. You must configure ingress authorization rules to enable clients to access
   resources in AWS or on-premises networks.

  request - `com.amazonaws.services.ec2.model.AuthorizeClientVpnIngressRequest`

  returns: Result of the AuthorizeClientVpnIngress operation returned by the service. - `com.amazonaws.services.ec2.model.AuthorizeClientVpnIngressResult`"
  (^com.amazonaws.services.ec2.model.AuthorizeClientVpnIngressResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AuthorizeClientVpnIngressRequest request]
    (-> this (.authorizeClientVpnIngress request))))

(defn cancel-capacity-reservation
  "Cancels the specified Capacity Reservation, releases the reserved capacity, and changes the Capacity
   Reservation's state to cancelled.


   Instances running in the reserved capacity continue running until you stop them. Stopped instances that target
   the Capacity Reservation can no longer launch. Modify these instances to either target a different Capacity
   Reservation, launch On-Demand Instance capacity, or run in any open Capacity Reservation that has matching
   attributes and sufficient capacity.

  request - `com.amazonaws.services.ec2.model.CancelCapacityReservationRequest`

  returns: Result of the CancelCapacityReservation operation returned by the service. - `com.amazonaws.services.ec2.model.CancelCapacityReservationResult`"
  (^com.amazonaws.services.ec2.model.CancelCapacityReservationResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CancelCapacityReservationRequest request]
    (-> this (.cancelCapacityReservation request))))

(defn replace-network-acl-association
  "Changes which network ACL a subnet is associated with. By default when you create a subnet, it's automatically
   associated with the default network ACL. For more information, see Network ACLs in the Amazon Virtual
   Private Cloud User Guide.


   This is an idempotent operation.

  request - `com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationRequest`

  returns: Result of the ReplaceNetworkAclAssociation operation returned by the service. - `com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationResult`"
  (^com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationRequest request]
    (-> this (.replaceNetworkAclAssociation request))))

(defn describe-regions
  "Describes the Regions that are enabled for your account, or all Regions.


   For a list of the Regions supported by Amazon EC2, see  Regions and Endpoints.


   For information about enabling and disabling Regions for your account, see Managing AWS Regions in the AWS
   General Reference.

  request - `com.amazonaws.services.ec2.model.DescribeRegionsRequest`

  returns: Result of the DescribeRegions operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeRegionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeRegionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeRegionsRequest request]
    (-> this (.describeRegions request)))
  (^com.amazonaws.services.ec2.model.DescribeRegionsResult [^AmazonEC2Client this]
    (-> this (.describeRegions))))

(defn delete-flow-logs
  "Deletes one or more flow logs.

  request - `com.amazonaws.services.ec2.model.DeleteFlowLogsRequest`

  returns: Result of the DeleteFlowLogs operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteFlowLogsResult`"
  (^com.amazonaws.services.ec2.model.DeleteFlowLogsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteFlowLogsRequest request]
    (-> this (.deleteFlowLogs request))))

(defn advertise-byoip-cidr
  "Advertises an IPv4 address range that is provisioned for use with your AWS resources through bring your own IP
   addresses (BYOIP).


   You can perform this operation at most once every 10 seconds, even if you specify different address ranges each
   time.


   We recommend that you stop advertising the BYOIP CIDR from other locations when you advertise it from AWS. To
   minimize down time, you can configure your AWS resources to use an address from a BYOIP CIDR before it is
   advertised, and then simultaneously stop advertising it from the current location and start advertising it
   through AWS.


   It can take a few minutes before traffic to the specified addresses starts routing to AWS because of BGP
   propagation delays.


   To stop advertising the BYOIP CIDR, use WithdrawByoipCidr.

  request - `com.amazonaws.services.ec2.model.AdvertiseByoipCidrRequest`

  returns: Result of the AdvertiseByoipCidr operation returned by the service. - `com.amazonaws.services.ec2.model.AdvertiseByoipCidrResult`"
  (^com.amazonaws.services.ec2.model.AdvertiseByoipCidrResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AdvertiseByoipCidrRequest request]
    (-> this (.advertiseByoipCidr request))))

(defn create-image
  "Creates an Amazon EBS-backed AMI from an Amazon EBS-backed instance that is either running or stopped.


   If you customized your instance with instance store volumes or EBS volumes in addition to the root device volume,
   the new AMI contains block device mapping information for those volumes. When you launch an instance from this
   new AMI, the instance automatically launches with those additional volumes.


   For more information, see Creating Amazon EBS-Backed
   Linux AMIs in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateImageRequest`

  returns: Result of the CreateImage operation returned by the service. - `com.amazonaws.services.ec2.model.CreateImageResult`"
  (^com.amazonaws.services.ec2.model.CreateImageResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateImageRequest request]
    (-> this (.createImage request))))

(defn delete-traffic-mirror-target
  "Deletes the specified Traffic Mirror target.


   You cannot delete a Traffic Mirror target that is in use by a Traffic Mirror session.

  request - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorTargetRequest`

  returns: Result of the DeleteTrafficMirrorTarget operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorTargetResult`"
  (^com.amazonaws.services.ec2.model.DeleteTrafficMirrorTargetResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorTargetRequest request]
    (-> this (.deleteTrafficMirrorTarget request))))

(defn authorize-security-group-egress
  "[VPC only] Adds the specified egress rules to a security group for use with a VPC.


   An outbound rule permits instances to send traffic to the specified IPv4 or IPv6 CIDR address ranges, or to the
   instances associated with the specified destination security groups.


   You specify a protocol for each rule (for example, TCP). For the TCP and UDP protocols, you must also specify the
   destination port or port range. For the ICMP protocol, you must also specify the ICMP type and code. You can use
   -1 for the type or code to mean all types or all codes.


   Rule changes are propagated to affected instances as quickly as possible. However, a small delay might occur.


   For more information about VPC security group limits, see Amazon VPC Limits.

  request - `com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressRequest`

  returns: Result of the AuthorizeSecurityGroupEgress operation returned by the service. - `com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressResult`"
  (^com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressRequest request]
    (-> this (.authorizeSecurityGroupEgress request))))

(defn describe-dhcp-options
  "Describes one or more of your DHCP options sets.


   For more information, see DHCP
   Options Sets in the Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeDhcpOptionsRequest`

  returns: Result of the DescribeDhcpOptions operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeDhcpOptionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeDhcpOptionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeDhcpOptionsRequest request]
    (-> this (.describeDhcpOptions request)))
  (^com.amazonaws.services.ec2.model.DescribeDhcpOptionsResult [^AmazonEC2Client this]
    (-> this (.describeDhcpOptions))))

(defn describe-network-interface-attribute
  "Describes a network interface attribute. You can specify only one attribute at a time.

  request - `com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeRequest`

  returns: Result of the DescribeNetworkInterfaceAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeResult`"
  (^com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeRequest request]
    (-> this (.describeNetworkInterfaceAttribute request))))

(defn modify-vpc-peering-connection-options
  "Modifies the VPC peering connection options on one side of a VPC peering connection. You can do the following:




   Enable/disable communication over the peering connection between an EC2-Classic instance that's linked to your
   VPC (using ClassicLink) and instances in the peer VPC.




   Enable/disable communication over the peering connection between instances in your VPC and an EC2-Classic
   instance that's linked to the peer VPC.




   Enable/disable the ability to resolve public DNS hostnames to private IP addresses when queried from instances in
   the peer VPC.




   If the peered VPCs are in the same AWS account, you can enable DNS resolution for queries from the local VPC.
   This ensures that queries from the local VPC resolve to private IP addresses in the peer VPC. This option is not
   available if the peered VPCs are in different AWS accounts or different Regions. For peered VPCs in different AWS
   accounts, each AWS account owner must initiate a separate request to modify the peering connection options. For
   inter-region peering connections, you must use the Region for the requester VPC to modify the requester VPC
   peering options and the Region for the accepter VPC to modify the accepter VPC peering options. To verify which
   VPCs are the accepter and the requester for a VPC peering connection, use the
   DescribeVpcPeeringConnections command.

  request - `com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsRequest`

  returns: Result of the ModifyVpcPeeringConnectionOptions operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsResult`"
  (^com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsRequest request]
    (-> this (.modifyVpcPeeringConnectionOptions request))))

(defn modify-volume-attribute
  "Modifies a volume attribute.


   By default, all I/O operations for the volume are suspended when the data on the volume is determined to be
   potentially inconsistent, to prevent undetectable, latent data corruption. The I/O access to the volume can be
   resumed by first enabling I/O access and then checking the data consistency on your volume.


   You can change the default behavior to resume I/O operations. We recommend that you change this only for boot
   volumes or for volumes that are stateless or disposable.

  request - `com.amazonaws.services.ec2.model.ModifyVolumeAttributeRequest`

  returns: Result of the ModifyVolumeAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVolumeAttributeResult`"
  (^com.amazonaws.services.ec2.model.ModifyVolumeAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyVolumeAttributeRequest request]
    (-> this (.modifyVolumeAttribute request))))

(defn attach-network-interface
  "Attaches a network interface to an instance.

  request - `com.amazonaws.services.ec2.model.AttachNetworkInterfaceRequest`

  returns: Result of the AttachNetworkInterface operation returned by the service. - `com.amazonaws.services.ec2.model.AttachNetworkInterfaceResult`"
  (^com.amazonaws.services.ec2.model.AttachNetworkInterfaceResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AttachNetworkInterfaceRequest request]
    (-> this (.attachNetworkInterface request))))

(defn request-spot-instances
  "Creates a Spot Instance request.


   For more information, see Spot
   Instance Requests in the Amazon EC2 User Guide for Linux Instances.

  request - `com.amazonaws.services.ec2.model.RequestSpotInstancesRequest`

  returns: Result of the RequestSpotInstances operation returned by the service. - `com.amazonaws.services.ec2.model.RequestSpotInstancesResult`"
  (^com.amazonaws.services.ec2.model.RequestSpotInstancesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.RequestSpotInstancesRequest request]
    (-> this (.requestSpotInstances request))))

(defn disable-ebs-encryption-by-default
  "Disables EBS encryption by default for your account in the current Region.


   After you disable encryption by default, you can still create encrypted volumes by enabling encryption when you
   create each volume.


   Disabling encryption by default does not change the encryption status of your existing volumes.


   For more information, see Amazon
   EBS Encryption in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DisableEbsEncryptionByDefaultRequest`

  returns: Result of the DisableEbsEncryptionByDefault operation returned by the service. - `com.amazonaws.services.ec2.model.DisableEbsEncryptionByDefaultResult`"
  (^com.amazonaws.services.ec2.model.DisableEbsEncryptionByDefaultResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DisableEbsEncryptionByDefaultRequest request]
    (-> this (.disableEbsEncryptionByDefault request))))

(defn restore-address-to-classic
  "Restores an Elastic IP address that was previously moved to the EC2-VPC platform back to the EC2-Classic
   platform. You cannot move an Elastic IP address that was originally allocated for use in EC2-VPC. The Elastic IP
   address must not be associated with an instance or network interface.

  request - `com.amazonaws.services.ec2.model.RestoreAddressToClassicRequest`

  returns: Result of the RestoreAddressToClassic operation returned by the service. - `com.amazonaws.services.ec2.model.RestoreAddressToClassicResult`"
  (^com.amazonaws.services.ec2.model.RestoreAddressToClassicResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.RestoreAddressToClassicRequest request]
    (-> this (.restoreAddressToClassic request))))

(defn describe-reserved-instances
  "Describes one or more of the Reserved Instances that you purchased.


   For more information about Reserved Instances, see Reserved
   Instances in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeReservedInstancesRequest`

  returns: Result of the DescribeReservedInstances operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesResult`"
  (^com.amazonaws.services.ec2.model.DescribeReservedInstancesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesRequest request]
    (-> this (.describeReservedInstances request)))
  (^com.amazonaws.services.ec2.model.DescribeReservedInstancesResult [^AmazonEC2Client this]
    (-> this (.describeReservedInstances))))

(defn describe-stale-security-groups
  "[VPC only] Describes the stale security group rules for security groups in a specified VPC. Rules are stale when
   they reference a deleted security group in a peer VPC, or a security group in a peer VPC for which the VPC
   peering connection has been deleted.

  request - `com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsRequest`

  returns: Result of the DescribeStaleSecurityGroups operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsResult`"
  (^com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsRequest request]
    (-> this (.describeStaleSecurityGroups request))))

(defn describe-host-reservations
  "Describes reservations that are associated with Dedicated Hosts in your account.

  request - `com.amazonaws.services.ec2.model.DescribeHostReservationsRequest`

  returns: Result of the DescribeHostReservations operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeHostReservationsResult`"
  (^com.amazonaws.services.ec2.model.DescribeHostReservationsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeHostReservationsRequest request]
    (-> this (.describeHostReservations request))))

(defn detach-network-interface
  "Detaches a network interface from an instance.

  request - `com.amazonaws.services.ec2.model.DetachNetworkInterfaceRequest`

  returns: Result of the DetachNetworkInterface operation returned by the service. - `com.amazonaws.services.ec2.model.DetachNetworkInterfaceResult`"
  (^com.amazonaws.services.ec2.model.DetachNetworkInterfaceResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DetachNetworkInterfaceRequest request]
    (-> this (.detachNetworkInterface request))))

(defn create-client-vpn-endpoint
  "Creates a Client VPN endpoint. A Client VPN endpoint is the resource you create and configure to enable and
   manage client VPN sessions. It is the destination endpoint at which all client VPN sessions are terminated.

  request - `com.amazonaws.services.ec2.model.CreateClientVpnEndpointRequest`

  returns: Result of the CreateClientVpnEndpoint operation returned by the service. - `com.amazonaws.services.ec2.model.CreateClientVpnEndpointResult`"
  (^com.amazonaws.services.ec2.model.CreateClientVpnEndpointResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateClientVpnEndpointRequest request]
    (-> this (.createClientVpnEndpoint request))))

(defn delete-egress-only-internet-gateway
  "Deletes an egress-only internet gateway.

  request - `com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayRequest`

  returns: Result of the DeleteEgressOnlyInternetGateway operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayResult`"
  (^com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayRequest request]
    (-> this (.deleteEgressOnlyInternetGateway request))))

(defn describe-moving-addresses
  "Describes your Elastic IP addresses that are being moved to the EC2-VPC platform, or that are being restored to
   the EC2-Classic platform. This request does not return information about any other Elastic IP addresses in your
   account.

  request - `com.amazonaws.services.ec2.model.DescribeMovingAddressesRequest`

  returns: Result of the DescribeMovingAddresses operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeMovingAddressesResult`"
  (^com.amazonaws.services.ec2.model.DescribeMovingAddressesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeMovingAddressesRequest request]
    (-> this (.describeMovingAddresses request)))
  (^com.amazonaws.services.ec2.model.DescribeMovingAddressesResult [^AmazonEC2Client this]
    (-> this (.describeMovingAddresses))))

(defn delete-network-interface-permission
  "Deletes a permission for a network interface. By default, you cannot delete the permission if the account for
   which you're removing the permission has attached the network interface to an instance. However, you can force
   delete the permission, regardless of any attachment.

  request - `com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionRequest`

  returns: Result of the DeleteNetworkInterfacePermission operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionResult`"
  (^com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionRequest request]
    (-> this (.deleteNetworkInterfacePermission request))))

(defn describe-vpc-endpoint-services
  "Describes available services to which you can create a VPC endpoint.

  request - `com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesRequest`

  returns: Result of the DescribeVpcEndpointServices operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesRequest request]
    (-> this (.describeVpcEndpointServices request)))
  (^com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesResult [^AmazonEC2Client this]
    (-> this (.describeVpcEndpointServices))))

(defn delete-transit-gateway-route
  "Deletes the specified route from the specified transit gateway route table.

  request - `com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteRequest`

  returns: Result of the DeleteTransitGatewayRoute operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteResult`"
  (^com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteRequest request]
    (-> this (.deleteTransitGatewayRoute request))))

(defn copy-fpga-image
  "Copies the specified Amazon FPGA Image (AFI) to the current Region.

  request - `com.amazonaws.services.ec2.model.CopyFpgaImageRequest`

  returns: Result of the CopyFpgaImage operation returned by the service. - `com.amazonaws.services.ec2.model.CopyFpgaImageResult`"
  (^com.amazonaws.services.ec2.model.CopyFpgaImageResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CopyFpgaImageRequest request]
    (-> this (.copyFpgaImage request))))

(defn modify-vpc-endpoint-service-configuration
  "Modifies the attributes of your VPC endpoint service configuration. You can change the Network Load Balancers for
   your service, and you can specify whether acceptance is required for requests to connect to your endpoint service
   through an interface VPC endpoint.

  request - `com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationRequest`

  returns: Result of the ModifyVpcEndpointServiceConfiguration operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationResult`"
  (^com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationRequest request]
    (-> this (.modifyVpcEndpointServiceConfiguration request))))

(defn delete-vpc-peering-connection
  "Deletes a VPC peering connection. Either the owner of the requester VPC or the owner of the accepter VPC can
   delete the VPC peering connection if it's in the active state. The owner of the requester VPC can
   delete a VPC peering connection in the pending-acceptance state. You cannot delete a VPC peering
   connection that's in the failed state.

  request - `com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionRequest`

  returns: Result of the DeleteVpcPeeringConnection operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionResult`"
  (^com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionRequest request]
    (-> this (.deleteVpcPeeringConnection request))))

(defn describe-import-image-tasks
  "Displays details about an import virtual machine or import snapshot tasks that are already created.

  request - `com.amazonaws.services.ec2.model.DescribeImportImageTasksRequest`

  returns: Result of the DescribeImportImageTasks operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeImportImageTasksResult`"
  (^com.amazonaws.services.ec2.model.DescribeImportImageTasksResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeImportImageTasksRequest request]
    (-> this (.describeImportImageTasks request)))
  (^com.amazonaws.services.ec2.model.DescribeImportImageTasksResult [^AmazonEC2Client this]
    (-> this (.describeImportImageTasks))))

(defn describe-host-reservation-offerings
  "Describes the Dedicated Host reservations that are available to purchase.


   The results describe all the Dedicated Host reservation offerings, including offerings that may not match the
   instance family and Region of your Dedicated Hosts. When purchasing an offering, ensure that the instance family
   and Region of the offering matches that of the Dedicated Hosts with which it is to be associated. For more
   information about supported instance types, see Dedicated Hosts
   Overview in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsRequest`

  returns: Result of the DescribeHostReservationOfferings operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsResult`"
  (^com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsRequest request]
    (-> this (.describeHostReservationOfferings request))))

(defn reset-fpga-image-attribute
  "Resets the specified attribute of the specified Amazon FPGA Image (AFI) to its default value. You can only reset
   the load permission attribute.

  request - `com.amazonaws.services.ec2.model.ResetFpgaImageAttributeRequest`

  returns: Result of the ResetFpgaImageAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ResetFpgaImageAttributeResult`"
  (^com.amazonaws.services.ec2.model.ResetFpgaImageAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ResetFpgaImageAttributeRequest request]
    (-> this (.resetFpgaImageAttribute request))))

(defn associate-client-vpn-target-network
  "Associates a target network with a Client VPN endpoint. A target network is a subnet in a VPC. You can associate
   multiple subnets from the same VPC with a Client VPN endpoint. You can associate only one subnet in each
   Availability Zone. We recommend that you associate at least two subnets to provide Availability Zone redundancy.

  request - `com.amazonaws.services.ec2.model.AssociateClientVpnTargetNetworkRequest`

  returns: Result of the AssociateClientVpnTargetNetwork operation returned by the service. - `com.amazonaws.services.ec2.model.AssociateClientVpnTargetNetworkResult`"
  (^com.amazonaws.services.ec2.model.AssociateClientVpnTargetNetworkResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AssociateClientVpnTargetNetworkRequest request]
    (-> this (.associateClientVpnTargetNetwork request))))

(defn disassociate-vpc-cidr-block
  "Disassociates a CIDR block from a VPC. To disassociate the CIDR block, you must specify its association ID. You
   can get the association ID by using DescribeVpcs. You must detach or delete all gateways and resources
   that are associated with the CIDR block before you can disassociate it.


   You cannot disassociate the CIDR block with which you originally created the VPC (the primary CIDR block).

  request - `com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockRequest`

  returns: Result of the DisassociateVpcCidrBlock operation returned by the service. - `com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockResult`"
  (^com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockRequest request]
    (-> this (.disassociateVpcCidrBlock request))))

(defn modify-subnet-attribute
  "Modifies a subnet attribute. You can only modify one attribute at a time.

  request - `com.amazonaws.services.ec2.model.ModifySubnetAttributeRequest`

  returns: Result of the ModifySubnetAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ModifySubnetAttributeResult`"
  (^com.amazonaws.services.ec2.model.ModifySubnetAttributeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifySubnetAttributeRequest request]
    (-> this (.modifySubnetAttribute request))))

(defn delete-key-pair
  "Deletes the specified key pair, by removing the public key from Amazon EC2.

  request - `com.amazonaws.services.ec2.model.DeleteKeyPairRequest`

  returns: Result of the DeleteKeyPair operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteKeyPairResult`"
  (^com.amazonaws.services.ec2.model.DeleteKeyPairResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteKeyPairRequest request]
    (-> this (.deleteKeyPair request))))

(defn describe-vpn-gateways
  "Describes one or more of your virtual private gateways.


   For more information, see AWS Site-to-Site
   VPN in the AWS Site-to-Site VPN User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeVpnGatewaysRequest`

  returns: Result of the DescribeVpnGateways operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpnGatewaysResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpnGatewaysResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeVpnGatewaysRequest request]
    (-> this (.describeVpnGateways request)))
  (^com.amazonaws.services.ec2.model.DescribeVpnGatewaysResult [^AmazonEC2Client this]
    (-> this (.describeVpnGateways))))

(defn delete-vpc-endpoint-connection-notifications
  "Deletes one or more VPC endpoint connection notifications.

  request - `com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsRequest`

  returns: Result of the DeleteVpcEndpointConnectionNotifications operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsResult`"
  (^com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsRequest request]
    (-> this (.deleteVpcEndpointConnectionNotifications request))))

(defn copy-image
  "Initiates the copy of an AMI from the specified source Region to the current Region. You specify the destination
   Region by using its endpoint when making the request.


   Copies of encrypted backing snapshots for the AMI are encrypted. Copies of unencrypted backing snapshots remain
   unencrypted, unless you set Encrypted during the copy operation. You cannot create an unencrypted
   copy of an encrypted backing snapshot.


   For more information about the prerequisites and limits when copying an AMI, see Copying an AMI in the Amazon
   Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CopyImageRequest`

  returns: Result of the CopyImage operation returned by the service. - `com.amazonaws.services.ec2.model.CopyImageResult`"
  (^com.amazonaws.services.ec2.model.CopyImageResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CopyImageRequest request]
    (-> this (.copyImage request))))

(defn purchase-host-reservation
  "Purchase a reservation with configurations that match those of your Dedicated Host. You must have active
   Dedicated Hosts in your account before you purchase a reservation. This action results in the specified
   reservation being purchased and charged to your account.

  request - `com.amazonaws.services.ec2.model.PurchaseHostReservationRequest`

  returns: Result of the PurchaseHostReservation operation returned by the service. - `com.amazonaws.services.ec2.model.PurchaseHostReservationResult`"
  (^com.amazonaws.services.ec2.model.PurchaseHostReservationResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.PurchaseHostReservationRequest request]
    (-> this (.purchaseHostReservation request))))

(defn disassociate-client-vpn-target-network
  "Disassociates a target network from the specified Client VPN endpoint. When you disassociate the last target
   network from a Client VPN, the following happens:




   The route that was automatically added for the VPC is deleted




   All active client connections are terminated




   New client connections are disallowed




   The Client VPN endpoint's status changes to pending-associate

  request - `com.amazonaws.services.ec2.model.DisassociateClientVpnTargetNetworkRequest`

  returns: Result of the DisassociateClientVpnTargetNetwork operation returned by the service. - `com.amazonaws.services.ec2.model.DisassociateClientVpnTargetNetworkResult`"
  (^com.amazonaws.services.ec2.model.DisassociateClientVpnTargetNetworkResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DisassociateClientVpnTargetNetworkRequest request]
    (-> this (.disassociateClientVpnTargetNetwork request))))

(defn disassociate-route-table
  "Disassociates a subnet from a route table.


   After you perform this action, the subnet no longer uses the routes in the route table. Instead, it uses the
   routes in the VPC's main route table. For more information about route tables, see Route Tables in the Amazon
   Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DisassociateRouteTableRequest`

  returns: Result of the DisassociateRouteTable operation returned by the service. - `com.amazonaws.services.ec2.model.DisassociateRouteTableResult`"
  (^com.amazonaws.services.ec2.model.DisassociateRouteTableResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DisassociateRouteTableRequest request]
    (-> this (.disassociateRouteTable request))))

(defn reboot-instances
  "Requests a reboot of the specified instances. This operation is asynchronous; it only queues a request to reboot
   the specified instances. The operation succeeds if the instances are valid and belong to you. Requests to reboot
   terminated instances are ignored.


   If an instance does not cleanly shut down within four minutes, Amazon EC2 performs a hard reboot.


   For more information about troubleshooting, see Getting Console Output and
   Rebooting Instances in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.RebootInstancesRequest`

  returns: Result of the RebootInstances operation returned by the service. - `com.amazonaws.services.ec2.model.RebootInstancesResult`"
  (^com.amazonaws.services.ec2.model.RebootInstancesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.RebootInstancesRequest request]
    (-> this (.rebootInstances request))))

(defn cancel-spot-fleet-requests
  "Cancels the specified Spot Fleet requests.


   After you cancel a Spot Fleet request, the Spot Fleet launches no new Spot Instances. You must specify whether
   the Spot Fleet should also terminate its Spot Instances. If you terminate the instances, the Spot Fleet request
   enters the cancelled_terminating state. Otherwise, the Spot Fleet request enters the
   cancelled_running state and the instances continue to run until they are interrupted or you
   terminate them manually.

  request - `com.amazonaws.services.ec2.model.CancelSpotFleetRequestsRequest`

  returns: Result of the CancelSpotFleetRequests operation returned by the service. - `com.amazonaws.services.ec2.model.CancelSpotFleetRequestsResult`"
  (^com.amazonaws.services.ec2.model.CancelSpotFleetRequestsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CancelSpotFleetRequestsRequest request]
    (-> this (.cancelSpotFleetRequests request))))

(defn disable-vpc-classic-link
  "Disables ClassicLink for a VPC. You cannot disable ClassicLink for a VPC that has EC2-Classic instances linked to
   it.

  request - `com.amazonaws.services.ec2.model.DisableVpcClassicLinkRequest`

  returns: Result of the DisableVpcClassicLink operation returned by the service. - `com.amazonaws.services.ec2.model.DisableVpcClassicLinkResult`"
  (^com.amazonaws.services.ec2.model.DisableVpcClassicLinkResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DisableVpcClassicLinkRequest request]
    (-> this (.disableVpcClassicLink request))))

(defn replace-route
  "Replaces an existing route within a route table in a VPC. You must provide only one of the following: internet
   gateway or virtual private gateway, NAT instance, NAT gateway, VPC peering connection, network interface, or
   egress-only internet gateway.


   For more information, see Route
   Tables in the Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.ReplaceRouteRequest`

  returns: Result of the ReplaceRoute operation returned by the service. - `com.amazonaws.services.ec2.model.ReplaceRouteResult`"
  (^com.amazonaws.services.ec2.model.ReplaceRouteResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ReplaceRouteRequest request]
    (-> this (.replaceRoute request))))

(defn create-network-acl-entry
  "Creates an entry (a rule) in a network ACL with the specified rule number. Each network ACL has a set of numbered
   ingress rules and a separate set of numbered egress rules. When determining whether a packet should be allowed in
   or out of a subnet associated with the ACL, we process the entries in the ACL according to the rule numbers, in
   ascending order. Each network ACL has a set of ingress rules and a separate set of egress rules.


   We recommend that you leave room between the rule numbers (for example, 100, 110, 120, ...), and not number them
   one right after the other (for example, 101, 102, 103, ...). This makes it easier to add a rule between existing
   ones without having to renumber the rules.


   After you add an entry, you can't modify it; you must either replace it, or create an entry and delete the old
   one.


   For more information about network ACLs, see Network ACLs in the Amazon Virtual
   Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateNetworkAclEntryRequest`

  returns: Result of the CreateNetworkAclEntry operation returned by the service. - `com.amazonaws.services.ec2.model.CreateNetworkAclEntryResult`"
  (^com.amazonaws.services.ec2.model.CreateNetworkAclEntryResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateNetworkAclEntryRequest request]
    (-> this (.createNetworkAclEntry request))))

(defn associate-vpc-cidr-block
  "Associates a CIDR block with your VPC. You can associate a secondary IPv4 CIDR block, or you can associate an
   Amazon-provided IPv6 CIDR block. The IPv6 CIDR block size is fixed at /56.


   For more information about associating CIDR blocks with your VPC and applicable restrictions, see VPC and Subnet Sizing in
   the Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.AssociateVpcCidrBlockRequest`

  returns: Result of the AssociateVpcCidrBlock operation returned by the service. - `com.amazonaws.services.ec2.model.AssociateVpcCidrBlockResult`"
  (^com.amazonaws.services.ec2.model.AssociateVpcCidrBlockResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AssociateVpcCidrBlockRequest request]
    (-> this (.associateVpcCidrBlock request))))

(defn delete-vpn-connection
  "Deletes the specified VPN connection.


   If you're deleting the VPC and its associated components, we recommend that you detach the virtual private
   gateway from the VPC and delete the VPC before deleting the VPN connection. If you believe that the tunnel
   credentials for your VPN connection have been compromised, you can delete the VPN connection and create a new one
   that has new keys, without needing to delete the VPC or virtual private gateway. If you create a new VPN
   connection, you must reconfigure the customer gateway using the new configuration information returned with the
   new VPN connection ID.

  request - `com.amazonaws.services.ec2.model.DeleteVpnConnectionRequest`

  returns: Result of the DeleteVpnConnection operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteVpnConnectionResult`"
  (^com.amazonaws.services.ec2.model.DeleteVpnConnectionResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteVpnConnectionRequest request]
    (-> this (.deleteVpnConnection request))))

(defn describe-availability-zones
  "Describes the Availability Zones that are available to you. The results include zones only for the Region you're
   currently using. If there is an event impacting an Availability Zone, you can use this request to view the state
   and any provided message for that Availability Zone.


   For more information, see Regions and
   Availability Zones in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeAvailabilityZonesRequest`

  returns: Result of the DescribeAvailabilityZones operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeAvailabilityZonesResult`"
  (^com.amazonaws.services.ec2.model.DescribeAvailabilityZonesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeAvailabilityZonesRequest request]
    (-> this (.describeAvailabilityZones request)))
  (^com.amazonaws.services.ec2.model.DescribeAvailabilityZonesResult [^AmazonEC2Client this]
    (-> this (.describeAvailabilityZones))))

(defn modify-vpc-tenancy
  "Modifies the instance tenancy attribute of the specified VPC. You can change the instance tenancy attribute of a
   VPC to default only. You cannot change the instance tenancy attribute to dedicated.


   After you modify the tenancy of the VPC, any new instances that you launch into the VPC have a tenancy of
   default, unless you specify otherwise during launch. The tenancy of any existing instances in the
   VPC is not affected.


   For more information, see Dedicated Instances in the
   Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.ModifyVpcTenancyRequest`

  returns: Result of the ModifyVpcTenancy operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVpcTenancyResult`"
  (^com.amazonaws.services.ec2.model.ModifyVpcTenancyResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyVpcTenancyRequest request]
    (-> this (.modifyVpcTenancy request))))

(defn delete-customer-gateway
  "Deletes the specified customer gateway. You must delete the VPN connection before you can delete the customer
   gateway.

  request - `com.amazonaws.services.ec2.model.DeleteCustomerGatewayRequest`

  returns: Result of the DeleteCustomerGateway operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteCustomerGatewayResult`"
  (^com.amazonaws.services.ec2.model.DeleteCustomerGatewayResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteCustomerGatewayRequest request]
    (-> this (.deleteCustomerGateway request))))

(defn delete-fleets
  "Deletes the specified EC2 Fleet.


   After you delete an EC2 Fleet, it launches no new instances. You must specify whether an EC2 Fleet should also
   terminate its instances. If you terminate the instances, the EC2 Fleet enters the
   deleted_terminating state. Otherwise, the EC2 Fleet enters the deleted_running state,
   and the instances continue to run until they are interrupted or you terminate them manually.

  request - `com.amazonaws.services.ec2.model.DeleteFleetsRequest`

  returns: Result of the DeleteFleets operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteFleetsResult`"
  (^com.amazonaws.services.ec2.model.DeleteFleetsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteFleetsRequest request]
    (-> this (.deleteFleets request))))

(defn delete-route
  "Deletes the specified route from the specified route table.

  request - `com.amazonaws.services.ec2.model.DeleteRouteRequest`

  returns: Result of the DeleteRoute operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteRouteResult`"
  (^com.amazonaws.services.ec2.model.DeleteRouteResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteRouteRequest request]
    (-> this (.deleteRoute request))))

(defn describe-client-vpn-connections
  "Describes active client connections and connections that have been terminated within the last 60 minutes for the
   specified Client VPN endpoint.

  request - `com.amazonaws.services.ec2.model.DescribeClientVpnConnectionsRequest`

  returns: Result of the DescribeClientVpnConnections operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeClientVpnConnectionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeClientVpnConnectionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeClientVpnConnectionsRequest request]
    (-> this (.describeClientVpnConnections request))))

(defn create-volume
  "Creates an EBS volume that can be attached to an instance in the same Availability Zone. The volume is created in
   the regional endpoint that you send the HTTP request to. For more information see Regions and Endpoints.


   You can create a new empty volume or restore a volume from an EBS snapshot. Any AWS Marketplace product codes
   from the snapshot are propagated to the volume.


   You can create encrypted volumes. Encrypted volumes must be attached to instances that support Amazon EBS
   encryption. Volumes that are created from encrypted snapshots are also automatically encrypted. For more
   information, see Amazon EBS
   Encryption in the Amazon Elastic Compute Cloud User Guide.


   You can tag your volumes during creation. For more information, see Tagging Your Amazon EC2 Resources
   in the Amazon Elastic Compute Cloud User Guide.


   For more information, see Creating an Amazon EBS
   Volume in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateVolumeRequest`

  returns: Result of the CreateVolume operation returned by the service. - `com.amazonaws.services.ec2.model.CreateVolumeResult`"
  (^com.amazonaws.services.ec2.model.CreateVolumeResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateVolumeRequest request]
    (-> this (.createVolume request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonEC2Client this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn modify-capacity-reservation
  "Modifies a Capacity Reservation's capacity and the conditions under which it is to be released. You cannot change
   a Capacity Reservation's instance type, EBS optimization, instance store settings, platform, Availability Zone,
   or instance eligibility. If you need to modify any of these attributes, we recommend that you cancel the Capacity
   Reservation, and then create a new one with the required attributes.

  request - `com.amazonaws.services.ec2.model.ModifyCapacityReservationRequest`

  returns: Result of the ModifyCapacityReservation operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyCapacityReservationResult`"
  (^com.amazonaws.services.ec2.model.ModifyCapacityReservationResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyCapacityReservationRequest request]
    (-> this (.modifyCapacityReservation request))))

(defn create-traffic-mirror-filter
  "Creates a Traffic Mirror filter.


   A Traffic Mirror filter is a set of rules that defines the traffic to mirror.


   By default, no traffic is mirrored. To mirror traffic, use CreateTrafficMirrorFilterRule to add Traffic
   Mirror rules to the filter. The rules you add define what traffic gets mirrored. You can also use
   ModifyTrafficMirrorFilterNetworkServices to mirror supported network services.

  request - `com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRequest`

  returns: Result of the CreateTrafficMirrorFilter operation returned by the service. - `com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterResult`"
  (^com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRequest request]
    (-> this (.createTrafficMirrorFilter request))))

(defn import-instance
  "Creates an import instance task using metadata from the specified disk image. ImportInstance only
   supports single-volume VMs. To import multi-volume VMs, use ImportImage. For more information, see Importing a
   Virtual Machine Using the Amazon EC2 CLI.


   For information about the import manifest referenced by this API action, see VM Import Manifest.

  request - `com.amazonaws.services.ec2.model.ImportInstanceRequest`

  returns: Result of the ImportInstance operation returned by the service. - `com.amazonaws.services.ec2.model.ImportInstanceResult`"
  (^com.amazonaws.services.ec2.model.ImportInstanceResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ImportInstanceRequest request]
    (-> this (.importInstance request))))

(defn delete-placement-group
  "Deletes the specified placement group. You must terminate all instances in the placement group before you can
   delete the placement group. For more information, see Placement Groups in the
   Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DeletePlacementGroupRequest`

  returns: Result of the DeletePlacementGroup operation returned by the service. - `com.amazonaws.services.ec2.model.DeletePlacementGroupResult`"
  (^com.amazonaws.services.ec2.model.DeletePlacementGroupResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeletePlacementGroupRequest request]
    (-> this (.deletePlacementGroup request))))

(defn associate-address
  "Associates an Elastic IP address with an instance or a network interface. Before you can use an Elastic IP
   address, you must allocate it to your account.


   An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see Elastic IP Addresses
   in the Amazon Elastic Compute Cloud User Guide.


   [EC2-Classic, VPC in an EC2-VPC-only account] If the Elastic IP address is already associated with a different
   instance, it is disassociated from that instance and associated with the specified instance. If you associate an
   Elastic IP address with an instance that has an existing Elastic IP address, the existing address is
   disassociated from the instance, but remains allocated to your account.


   [VPC in an EC2-Classic account] If you don't specify a private IP address, the Elastic IP address is associated
   with the primary IP address. If the Elastic IP address is already associated with a different instance or a
   network interface, you get an error unless you allow reassociation. You cannot associate an Elastic IP address
   with an instance or network interface that has an existing Elastic IP address.



   This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error,
   and you may be charged for each time the Elastic IP address is remapped to the same instance. For more
   information, see the Elastic IP Addresses section of Amazon
   EC2 Pricing.

  request - `com.amazonaws.services.ec2.model.AssociateAddressRequest`

  returns: Result of the AssociateAddress operation returned by the service. - `com.amazonaws.services.ec2.model.AssociateAddressResult`"
  (^com.amazonaws.services.ec2.model.AssociateAddressResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AssociateAddressRequest request]
    (-> this (.associateAddress request))))

(defn create-fpga-image
  "Creates an Amazon FPGA Image (AFI) from the specified design checkpoint (DCP).


   The create operation is asynchronous. To verify that the AFI is ready for use, check the output logs.


   An AFI contains the FPGA bitstream that is ready to download to an FPGA. You can securely deploy an AFI on
   multiple FPGA-accelerated instances. For more information, see the AWS
   FPGA Hardware Development Kit.

  request - `com.amazonaws.services.ec2.model.CreateFpgaImageRequest`

  returns: Result of the CreateFpgaImage operation returned by the service. - `com.amazonaws.services.ec2.model.CreateFpgaImageResult`"
  (^com.amazonaws.services.ec2.model.CreateFpgaImageResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateFpgaImageRequest request]
    (-> this (.createFpgaImage request))))

(defn delete-network-interface
  "Deletes the specified network interface. You must detach the network interface before you can delete it.

  request - `com.amazonaws.services.ec2.model.DeleteNetworkInterfaceRequest`

  returns: Result of the DeleteNetworkInterface operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteNetworkInterfaceResult`"
  (^com.amazonaws.services.ec2.model.DeleteNetworkInterfaceResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteNetworkInterfaceRequest request]
    (-> this (.deleteNetworkInterface request))))

(defn get-ebs-default-kms-key-id
  "Describes the default customer master key (CMK) for EBS encryption by default for your account in this Region.
   You can change the default CMK for encryption by default using ModifyEbsDefaultKmsKeyId or
   ResetEbsDefaultKmsKeyId.


   For more information, see Amazon
   EBS Encryption in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.GetEbsDefaultKmsKeyIdRequest`

  returns: Result of the GetEbsDefaultKmsKeyId operation returned by the service. - `com.amazonaws.services.ec2.model.GetEbsDefaultKmsKeyIdResult`"
  (^com.amazonaws.services.ec2.model.GetEbsDefaultKmsKeyIdResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.GetEbsDefaultKmsKeyIdRequest request]
    (-> this (.getEbsDefaultKmsKeyId request))))

(defn cancel-bundle-task
  "Cancels a bundling operation for an instance store-backed Windows instance.

  request - `com.amazonaws.services.ec2.model.CancelBundleTaskRequest`

  returns: Result of the CancelBundleTask operation returned by the service. - `com.amazonaws.services.ec2.model.CancelBundleTaskResult`"
  (^com.amazonaws.services.ec2.model.CancelBundleTaskResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CancelBundleTaskRequest request]
    (-> this (.cancelBundleTask request))))

(defn create-network-interface
  "Creates a network interface in the specified subnet.


   For more information about network interfaces, see Elastic Network Interfaces in the
   Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateNetworkInterfaceRequest`

  returns: Result of the CreateNetworkInterface operation returned by the service. - `com.amazonaws.services.ec2.model.CreateNetworkInterfaceResult`"
  (^com.amazonaws.services.ec2.model.CreateNetworkInterfaceResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateNetworkInterfaceRequest request]
    (-> this (.createNetworkInterface request))))

(defn describe-egress-only-internet-gateways
  "Describes one or more of your egress-only internet gateways.

  request - `com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysRequest`

  returns: Result of the DescribeEgressOnlyInternetGateways operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysResult`"
  (^com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysRequest request]
    (-> this (.describeEgressOnlyInternetGateways request))))

(defn create-instance-export-task
  "Exports a running or stopped instance to an S3 bucket.


   For information about the supported operating systems, image formats, and known limitations for the types of
   instances you can export, see Exporting an Instance as a VM Using
   VM Import/Export in the VM Import/Export User Guide.

  request - `com.amazonaws.services.ec2.model.CreateInstanceExportTaskRequest`

  returns: Result of the CreateInstanceExportTask operation returned by the service. - `com.amazonaws.services.ec2.model.CreateInstanceExportTaskResult`"
  (^com.amazonaws.services.ec2.model.CreateInstanceExportTaskResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateInstanceExportTaskRequest request]
    (-> this (.createInstanceExportTask request))))

(defn describe-security-groups
  "Describes the specified security groups or all of your security groups.


   A security group is for use with instances either in the EC2-Classic platform or in a specific VPC. For more
   information, see Amazon
   EC2 Security Groups in the Amazon Elastic Compute Cloud User Guide and Security Groups for Your
   VPC in the Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeSecurityGroupsRequest`

  returns: Result of the DescribeSecurityGroups operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSecurityGroupsResult`"
  (^com.amazonaws.services.ec2.model.DescribeSecurityGroupsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeSecurityGroupsRequest request]
    (-> this (.describeSecurityGroups request)))
  (^com.amazonaws.services.ec2.model.DescribeSecurityGroupsResult [^AmazonEC2Client this]
    (-> this (.describeSecurityGroups))))

(defn get-password-data
  "Retrieves the encrypted administrator password for a running Windows instance.


   The Windows password is generated at boot by the EC2Config service or EC2Launch scripts
   (Windows Server 2016 and later). This usually only happens the first time an instance is launched. For more
   information, see EC2Config and EC2Launch in the Amazon Elastic
   Compute Cloud User Guide.


   For the EC2Config service, the password is not generated for rebundled AMIs unless
   Ec2SetPassword is enabled before bundling.


   The password is encrypted using the key pair that you specified when you launched the instance. You must provide
   the corresponding key pair file.


   When you launch an instance, password generation and encryption may take a few minutes. If you try to retrieve
   the password before it's available, the output returns an empty string. We recommend that you wait up to 15
   minutes after launching an instance before trying to retrieve the generated password.

  request - `com.amazonaws.services.ec2.model.GetPasswordDataRequest`

  returns: Result of the GetPasswordData operation returned by the service. - `com.amazonaws.services.ec2.model.GetPasswordDataResult`"
  (^com.amazonaws.services.ec2.model.GetPasswordDataResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.GetPasswordDataRequest request]
    (-> this (.getPasswordData request))))

(defn delete-traffic-mirror-filter
  "Deletes the specified Traffic Mirror filter.


   You cannot delete a Traffic Mirror filter that is in use by a Traffic Mirror session.

  request - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRequest`

  returns: Result of the DeleteTrafficMirrorFilter operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterResult`"
  (^com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRequest request]
    (-> this (.deleteTrafficMirrorFilter request))))

(defn attach-classic-link-vpc
  "Links an EC2-Classic instance to a ClassicLink-enabled VPC through one or more of the VPC's security groups. You
   cannot link an EC2-Classic instance to more than one VPC at a time. You can only link an instance that's in the
   running state. An instance is automatically unlinked from a VPC when it's stopped - you can link it
   to the VPC again when you restart it.


   After you've linked an instance, you cannot change the VPC security groups that are associated with it. To change
   the security groups, you must first unlink the instance, and then link it again.


   Linking your instance to a VPC is sometimes referred to as attaching your instance.

  request - `com.amazonaws.services.ec2.model.AttachClassicLinkVpcRequest`

  returns: Result of the AttachClassicLinkVpc operation returned by the service. - `com.amazonaws.services.ec2.model.AttachClassicLinkVpcResult`"
  (^com.amazonaws.services.ec2.model.AttachClassicLinkVpcResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AttachClassicLinkVpcRequest request]
    (-> this (.attachClassicLinkVpc request))))

(defn create-network-interface-permission
  "Grants an AWS-authorized account permission to attach the specified network interface to an instance in their
   account.


   You can grant permission to a single AWS account only, and only one account at a time.

  request - `com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionRequest`

  returns: Result of the CreateNetworkInterfacePermission operation returned by the service. - `com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionResult`"
  (^com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionRequest request]
    (-> this (.createNetworkInterfacePermission request))))

(defn describe-images
  "Describes the specified images (AMIs, AKIs, and ARIs) available to you or all of the images available to you.


   The images available to you include public images, private images that you own, and private images owned by other
   AWS accounts for which you have explicit launch permissions.


   Recently deregistered images appear in the returned results for a short interval and then return empty results.
   After all instances that reference a deregistered AMI are terminated, specifying the ID of the image results in
   an error indicating that the AMI ID cannot be found.

  request - `com.amazonaws.services.ec2.model.DescribeImagesRequest`

  returns: Result of the DescribeImages operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeImagesResult`"
  (^com.amazonaws.services.ec2.model.DescribeImagesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeImagesRequest request]
    (-> this (.describeImages request)))
  (^com.amazonaws.services.ec2.model.DescribeImagesResult [^AmazonEC2Client this]
    (-> this (.describeImages))))

(defn create-vpc-endpoint-service-configuration
  "Creates a VPC endpoint service configuration to which service consumers (AWS accounts, IAM users, and IAM roles)
   can connect. Service consumers can create an interface VPC endpoint to connect to your service.


   To create an endpoint service configuration, you must first create a Network Load Balancer for your service. For
   more information, see VPC
   Endpoint Services in the Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationRequest`

  returns: Result of the CreateVpcEndpointServiceConfiguration operation returned by the service. - `com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationResult`"
  (^com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationRequest request]
    (-> this (.createVpcEndpointServiceConfiguration request))))

(defn purchase-reserved-instances-offering
  "Purchases a Reserved Instance for use with your account. With Reserved Instances, you pay a lower hourly rate
   compared to On-Demand instance pricing.


   Use DescribeReservedInstancesOfferings to get a list of Reserved Instance offerings that match your
   specifications. After you've purchased a Reserved Instance, you can check for your new Reserved Instance with
   DescribeReservedInstances.


   For more information, see Reserved
   Instances and Reserved
   Instance Marketplace in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingRequest`

  returns: Result of the PurchaseReservedInstancesOffering operation returned by the service. - `com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingResult`"
  (^com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingRequest request]
    (-> this (.purchaseReservedInstancesOffering request))))

(defn enable-transit-gateway-route-table-propagation
  "Enables the specified attachment to propagate routes to the specified propagation route table.

  request - `com.amazonaws.services.ec2.model.EnableTransitGatewayRouteTablePropagationRequest`

  returns: Result of the EnableTransitGatewayRouteTablePropagation operation returned by the service. - `com.amazonaws.services.ec2.model.EnableTransitGatewayRouteTablePropagationResult`"
  (^com.amazonaws.services.ec2.model.EnableTransitGatewayRouteTablePropagationResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.EnableTransitGatewayRouteTablePropagationRequest request]
    (-> this (.enableTransitGatewayRouteTablePropagation request))))

(defn describe-fleet-history
  "Describes the events for the specified EC2 Fleet during the specified time.

  request - `com.amazonaws.services.ec2.model.DescribeFleetHistoryRequest`

  returns: Result of the DescribeFleetHistory operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeFleetHistoryResult`"
  (^com.amazonaws.services.ec2.model.DescribeFleetHistoryResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeFleetHistoryRequest request]
    (-> this (.describeFleetHistory request))))

(defn delete-launch-template-versions
  "Deletes one or more versions of a launch template. You cannot delete the default version of a launch template;
   you must first assign a different version as the default. If the default version is the only version for the
   launch template, you must delete the entire launch template using DeleteLaunchTemplate.

  request - `com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsRequest`

  returns: Result of the DeleteLaunchTemplateVersions operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsResult`"
  (^com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsRequest request]
    (-> this (.deleteLaunchTemplateVersions request))))

(defn stop-instances
  "Stops an Amazon EBS-backed instance.


   You can use the Stop action to hibernate an instance if the instance is enabled for
   hibernation and it meets the hibernation
   prerequisites. For more information, see Hibernate Your Instance in the
   Amazon Elastic Compute Cloud User Guide.


   We don't charge usage for a stopped instance, or data transfer fees; however, your root partition Amazon EBS
   volume remains and continues to persist your data, and you are charged for Amazon EBS volume usage. Every time
   you start your Windows instance, Amazon EC2 charges you for a full instance hour. If you stop and restart your
   Windows instance, a new instance hour begins and Amazon EC2 charges you for another full instance hour even if
   you are still within the same 60-minute period when it was stopped. Every time you start your Linux instance,
   Amazon EC2 charges a one-minute minimum for instance usage, and thereafter charges per second for instance usage.


   You can't start, stop, or hibernate Spot Instances, and you can't stop or hibernate instance store-backed
   instances. For information about using hibernation for Spot Instances, see Hibernating Interrupted Spot Instances in the Amazon Elastic Compute Cloud User Guide.


   When you stop or hibernate an instance, we shut it down. You can restart your instance at any time. Before
   stopping or hibernating an instance, make sure it is in a state from which it can be restarted. Stopping an
   instance does not preserve data stored in RAM, but hibernating an instance does preserve data stored in RAM. If
   an instance cannot hibernate successfully, a normal shutdown occurs.


   Stopping and hibernating an instance is different to rebooting or terminating it. For example, when you stop or
   hibernate an instance, the root device and any other devices attached to the instance persist. When you terminate
   an instance, the root device and any other devices attached during the instance launch are automatically deleted.
   For more information about the differences between rebooting, stopping, hibernating, and terminating instances,
   see Instance
   Lifecycle in the Amazon Elastic Compute Cloud User Guide.


   When you stop an instance, we attempt to shut it down forcibly after a short while. If your instance appears
   stuck in the stopping state after a period of time, there may be an issue with the underlying host computer. For
   more information, see Troubleshooting
   Stopping Your Instance in the Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.StopInstancesRequest`

  returns: Result of the StopInstances operation returned by the service. - `com.amazonaws.services.ec2.model.StopInstancesResult`"
  (^com.amazonaws.services.ec2.model.StopInstancesResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.StopInstancesRequest request]
    (-> this (.stopInstances request))))

(defn create-vpc-endpoint
  "Creates a VPC endpoint for a specified service. An endpoint enables you to create a private connection between
   your VPC and the service. The service may be provided by AWS, an AWS Marketplace partner, or another AWS account.
   For more information, see VPC
   Endpoints in the Amazon Virtual Private Cloud User Guide.


   A gateway endpoint serves as a target for a route in your route table for traffic destined for the
   AWS service. You can specify an endpoint policy to attach to the endpoint that will control access to the service
   from your VPC. You can also specify the VPC route tables that use the endpoint.


   An interface endpoint is a network interface in your subnet that serves as an endpoint for
   communicating with the specified service. You can specify the subnets in which to create an endpoint, and the
   security groups to associate with the endpoint network interface.


   Use DescribeVpcEndpointServices to get a list of supported services.

  request - `com.amazonaws.services.ec2.model.CreateVpcEndpointRequest`

  returns: Result of the CreateVpcEndpoint operation returned by the service. - `com.amazonaws.services.ec2.model.CreateVpcEndpointResult`"
  (^com.amazonaws.services.ec2.model.CreateVpcEndpointResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateVpcEndpointRequest request]
    (-> this (.createVpcEndpoint request))))

(defn describe-vpc-classic-link
  "Describes the ClassicLink status of one or more VPCs.

  request - `com.amazonaws.services.ec2.model.DescribeVpcClassicLinkRequest`

  returns: Result of the DescribeVpcClassicLink operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcClassicLinkResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcClassicLinkResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeVpcClassicLinkRequest request]
    (-> this (.describeVpcClassicLink request)))
  (^com.amazonaws.services.ec2.model.DescribeVpcClassicLinkResult [^AmazonEC2Client this]
    (-> this (.describeVpcClassicLink))))

(defn describe-client-vpn-endpoints
  "Describes one or more Client VPN endpoints in the account.

  request - `com.amazonaws.services.ec2.model.DescribeClientVpnEndpointsRequest`

  returns: Result of the DescribeClientVpnEndpoints operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeClientVpnEndpointsResult`"
  (^com.amazonaws.services.ec2.model.DescribeClientVpnEndpointsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeClientVpnEndpointsRequest request]
    (-> this (.describeClientVpnEndpoints request))))

(defn delete-traffic-mirror-filter-rule
  "Deletes the specified Traffic Mirror rule.

  request - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRuleRequest`

  returns: Result of the DeleteTrafficMirrorFilterRule operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRuleResult`"
  (^com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRuleResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRuleRequest request]
    (-> this (.deleteTrafficMirrorFilterRule request))))

(defn delete-dhcp-options
  "Deletes the specified set of DHCP options. You must disassociate the set of DHCP options before you can delete
   it. You can disassociate the set of DHCP options by associating either a new set of options or the default set of
   options with the VPC.

  request - `com.amazonaws.services.ec2.model.DeleteDhcpOptionsRequest`

  returns: Result of the DeleteDhcpOptions operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteDhcpOptionsResult`"
  (^com.amazonaws.services.ec2.model.DeleteDhcpOptionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteDhcpOptionsRequest request]
    (-> this (.deleteDhcpOptions request))))

(defn modify-traffic-mirror-filter-rule
  "Modifies the specified Traffic Mirror rule.


   DestinationCidrBlock and SourceCidrBlock must both be an IPv4 range or an IPv6 range.

  request - `com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterRuleRequest`

  returns: Result of the ModifyTrafficMirrorFilterRule operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterRuleResult`"
  (^com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterRuleResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterRuleRequest request]
    (-> this (.modifyTrafficMirrorFilterRule request))))

(defn describe-spot-instance-requests
  "Describes the specified Spot Instance requests.


   You can use DescribeSpotInstanceRequests to find a running Spot Instance by examining the response.
   If the status of the Spot Instance is fulfilled, the instance ID appears in the response and
   contains the identifier of the instance. Alternatively, you can use DescribeInstances with a filter to
   look for instances where the instance lifecycle is spot.


   We recommend that you set MaxResults to a value between 5 and 1000 to limit the number of results
   returned. This paginates the output, which makes the list more manageable and returns the results faster. If the
   list of results exceeds your MaxResults value, then that number of results is returned along with a
   NextToken value that can be passed to a subsequent DescribeSpotInstanceRequests request
   to retrieve the remaining results.


   Spot Instance requests are deleted four hours after they are canceled and their instances are terminated.

  request - `com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsRequest`

  returns: Result of the DescribeSpotInstanceRequests operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsResult`"
  (^com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsRequest request]
    (-> this (.describeSpotInstanceRequests request)))
  (^com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsResult [^AmazonEC2Client this]
    (-> this (.describeSpotInstanceRequests))))

(defn modify-hosts
  "Modify the auto-placement setting of a Dedicated Host. When auto-placement is enabled, any instances that you
   launch with a tenancy of host but without a specific host ID are placed onto any available Dedicated
   Host in your account that has auto-placement enabled. When auto-placement is disabled, you need to provide a host
   ID to have the instance launch onto a specific host. If no host ID is provided, the instance is launched onto a
   suitable host with auto-placement enabled.

  request - `com.amazonaws.services.ec2.model.ModifyHostsRequest`

  returns: Result of the ModifyHosts operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyHostsResult`"
  (^com.amazonaws.services.ec2.model.ModifyHostsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyHostsRequest request]
    (-> this (.modifyHosts request))))

(defn create-snapshot
  "Creates a snapshot of an EBS volume and stores it in Amazon S3. You can use snapshots for backups, to make copies
   of EBS volumes, and to save data before shutting down an instance.


   When a snapshot is created, any AWS Marketplace product codes that are associated with the source volume are
   propagated to the snapshot.


   You can take a snapshot of an attached volume that is in use. However, snapshots only capture data that has been
   written to your EBS volume at the time the snapshot command is issued; this may exclude any data that has been
   cached by any applications or the operating system. If you can pause any file systems on the volume long enough
   to take a snapshot, your snapshot should be complete. However, if you cannot pause all file writes to the volume,
   you should unmount the volume from within the instance, issue the snapshot command, and then remount the volume
   to ensure a consistent and complete snapshot. You may remount and use your volume while the snapshot status is
   pending.


   To create a snapshot for EBS volumes that serve as root devices, you should stop the instance before taking the
   snapshot.


   Snapshots that are taken from encrypted volumes are automatically encrypted. Volumes that are created from
   encrypted snapshots are also automatically encrypted. Your encrypted volumes and any associated snapshots always
   remain protected.


   You can tag your snapshots during creation. For more information, see Tagging Your Amazon EC2 Resources
   in the Amazon Elastic Compute Cloud User Guide.


   For more information, see Amazon
   Elastic Block Store and Amazon EBS Encryption in the
   Amazon Elastic Compute Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.CreateSnapshotRequest`

  returns: Result of the CreateSnapshot operation returned by the service. - `com.amazonaws.services.ec2.model.CreateSnapshotResult`"
  (^com.amazonaws.services.ec2.model.CreateSnapshotResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateSnapshotRequest request]
    (-> this (.createSnapshot request))))

(defn delete-traffic-mirror-session
  "Deletes the specified Traffic Mirror session.

  request - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorSessionRequest`

  returns: Result of the DeleteTrafficMirrorSession operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorSessionResult`"
  (^com.amazonaws.services.ec2.model.DeleteTrafficMirrorSessionResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorSessionRequest request]
    (-> this (.deleteTrafficMirrorSession request))))

(defn describe-transit-gateway-attachments
  "Describes one or more attachments between resources and transit gateways. By default, all attachments are
   described. Alternatively, you can filter the results by attachment ID, attachment state, resource ID, or resource
   owner.

  request - `com.amazonaws.services.ec2.model.DescribeTransitGatewayAttachmentsRequest`

  returns: Result of the DescribeTransitGatewayAttachments operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeTransitGatewayAttachmentsResult`"
  (^com.amazonaws.services.ec2.model.DescribeTransitGatewayAttachmentsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeTransitGatewayAttachmentsRequest request]
    (-> this (.describeTransitGatewayAttachments request))))

(defn create-snapshots
  "Creates crash-consistent snapshots of multiple EBS volumes and stores the data in S3. Volumes are chosen by
   specifying an instance. Any attached volumes will produce one snapshot each that is crash-consistent across the
   instance. Boot volumes can be excluded by changing the paramaters.

  request - `com.amazonaws.services.ec2.model.CreateSnapshotsRequest`

  returns: Result of the CreateSnapshots operation returned by the service. - `com.amazonaws.services.ec2.model.CreateSnapshotsResult`"
  (^com.amazonaws.services.ec2.model.CreateSnapshotsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateSnapshotsRequest request]
    (-> this (.createSnapshots request))))

(defn describe-subnets
  "Describes one or more of your subnets.


   For more information, see Your VPC
   and Subnets in the Amazon Virtual Private Cloud User Guide.

  request - `com.amazonaws.services.ec2.model.DescribeSubnetsRequest`

  returns: Result of the DescribeSubnets operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSubnetsResult`"
  (^com.amazonaws.services.ec2.model.DescribeSubnetsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeSubnetsRequest request]
    (-> this (.describeSubnets request)))
  (^com.amazonaws.services.ec2.model.DescribeSubnetsResult [^AmazonEC2Client this]
    (-> this (.describeSubnets))))

(defn describe-import-snapshot-tasks
  "Describes your import snapshot tasks.

  request - `com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksRequest`

  returns: Result of the DescribeImportSnapshotTasks operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksResult`"
  (^com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksRequest request]
    (-> this (.describeImportSnapshotTasks request)))
  (^com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksResult [^AmazonEC2Client this]
    (-> this (.describeImportSnapshotTasks))))

(defn delete-network-acl
  "Deletes the specified network ACL. You can't delete the ACL if it's associated with any subnets. You can't delete
   the default network ACL.

  request - `com.amazonaws.services.ec2.model.DeleteNetworkAclRequest`

  returns: Result of the DeleteNetworkAcl operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteNetworkAclResult`"
  (^com.amazonaws.services.ec2.model.DeleteNetworkAclResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DeleteNetworkAclRequest request]
    (-> this (.deleteNetworkAcl request))))

(defn describe-volume-status
  "Describes the status of the specified volumes. Volume status provides the result of the checks performed on your
   volumes to determine events that can impair the performance of your volumes. The performance of a volume can be
   affected if an issue occurs on the volume's underlying host. If the volume's underlying host experiences a power
   outage or system issue, after the system is restored, there could be data inconsistencies on the volume. Volume
   events notify you if this occurs. Volume actions notify you if any action needs to be taken in response to the
   event.


   The DescribeVolumeStatus operation provides the following information about the specified volumes:


   Status: Reflects the current status of the volume. The possible values are ok,
   impaired , warning, or insufficient-data. If all checks pass, the overall
   status of the volume is ok. If the check fails, the overall status is impaired. If the
   status is insufficient-data, then the checks may still be taking place on your volume at the time.
   We recommend that you retry the request. For more information about volume status, see Monitoring the Status of
   Your Volumes in the Amazon Elastic Compute Cloud User Guide.


   Events: Reflect the cause of a volume status and may require you to take action. For example, if your
   volume returns an impaired status, then the volume event might be
   potential-data-inconsistency. This means that your volume has been affected by an issue with the
   underlying host, has all I/O operations disabled, and may have inconsistent data.


   Actions: Reflect the actions you may have to take in response to an event. For example, if the status of
   the volume is impaired and the volume event shows potential-data-inconsistency, then
   the action shows enable-volume-io. This means that you may want to enable the I/O operations for the
   volume by calling the EnableVolumeIO action and then check the volume for data consistency.


   Volume status is based on the volume status checks, and does not reflect the volume state. Therefore, volume
   status does not indicate volumes in the error state (for example, when a volume is incapable of
   accepting I/O.)

  request - `com.amazonaws.services.ec2.model.DescribeVolumeStatusRequest`

  returns: Result of the DescribeVolumeStatus operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVolumeStatusResult`"
  (^com.amazonaws.services.ec2.model.DescribeVolumeStatusResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DescribeVolumeStatusRequest request]
    (-> this (.describeVolumeStatus request)))
  (^com.amazonaws.services.ec2.model.DescribeVolumeStatusResult [^AmazonEC2Client this]
    (-> this (.describeVolumeStatus))))

(defn modify-vpc-endpoint-service-permissions
  "Modifies the permissions for your VPC endpoint service. You can
   add or remove permissions for service consumers (IAM users, IAM roles, and AWS accounts) to connect to your
   endpoint service.


   If you grant permissions to all principals, the service is public. Any users who know the name of a public
   service can send a request to attach an endpoint. If the service does not require manual approval, attachments
   are automatically approved.

  request - `com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsRequest`

  returns: Result of the ModifyVpcEndpointServicePermissions operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsResult`"
  (^com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsRequest request]
    (-> this (.modifyVpcEndpointServicePermissions request))))

(defn disassociate-iam-instance-profile
  "Disassociates an IAM instance profile from a running or stopped instance.


   Use DescribeIamInstanceProfileAssociations to get the association ID.

  request - `com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileRequest`

  returns: Result of the DisassociateIamInstanceProfile operation returned by the service. - `com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileResult`"
  (^com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileRequest request]
    (-> this (.disassociateIamInstanceProfile request))))

(defn create-transit-gateway-vpc-attachment
  "Attaches the specified VPC to the specified transit gateway.


   If you attach a VPC with a CIDR range that overlaps the CIDR range of a VPC that is already attached, the new VPC
   CIDR range is not propagated to the default propagation route table.


   To send VPC traffic to an attached transit gateway, add a route to the VPC route table using CreateRoute.

  request - `com.amazonaws.services.ec2.model.CreateTransitGatewayVpcAttachmentRequest`

  returns: Result of the CreateTransitGatewayVpcAttachment operation returned by the service. - `com.amazonaws.services.ec2.model.CreateTransitGatewayVpcAttachmentResult`"
  (^com.amazonaws.services.ec2.model.CreateTransitGatewayVpcAttachmentResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.CreateTransitGatewayVpcAttachmentRequest request]
    (-> this (.createTransitGatewayVpcAttachment request))))

(defn authorize-security-group-ingress
  "Adds the specified ingress rules to a security group.


   An inbound rule permits instances to receive traffic from the specified IPv4 or IPv6 CIDR address ranges, or from
   the instances associated with the specified destination security groups.


   You specify a protocol for each rule (for example, TCP). For TCP and UDP, you must also specify the destination
   port or port range. For ICMP/ICMPv6, you must also specify the ICMP/ICMPv6 type and code. You can use -1 to mean
   all types or all codes.


   Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay
   might occur.


   For more information about VPC security group limits, see Amazon VPC Limits.

  request - `com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressRequest`

  returns: Result of the AuthorizeSecurityGroupIngress operation returned by the service. - `com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressResult`"
  (^com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressResult [^AmazonEC2Client this ^com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressRequest request]
    (-> this (.authorizeSecurityGroupIngress request))))

