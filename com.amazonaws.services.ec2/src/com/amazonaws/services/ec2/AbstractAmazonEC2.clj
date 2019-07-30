(ns com.amazonaws.services.ec2.AbstractAmazonEC2
  "Abstract implementation of AmazonEC2. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ec2 AbstractAmazonEC2]))

(defn describe-traffic-mirror-targets
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeTrafficMirrorTargetsRequest`

  returns: Result of the DescribeTrafficMirrorTargets operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeTrafficMirrorTargetsResult`"
  (^com.amazonaws.services.ec2.model.DescribeTrafficMirrorTargetsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeTrafficMirrorTargetsRequest request]
    (-> this (.describeTrafficMirrorTargets request))))

(defn modify-fleet
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyFleetRequest`

  returns: Result of the ModifyFleet operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyFleetResult`"
  (^com.amazonaws.services.ec2.model.ModifyFleetResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyFleetRequest request]
    (-> this (.modifyFleet request))))

(defn create-vpc
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateVpcRequest`

  returns: Result of the CreateVpc operation returned by the service. - `com.amazonaws.services.ec2.model.CreateVpcResult`"
  (^com.amazonaws.services.ec2.model.CreateVpcResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateVpcRequest request]
    (-> this (.createVpc request))))

(defn describe-id-format
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeIdFormatRequest`

  returns: Result of the DescribeIdFormat operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeIdFormatResult`"
  (^com.amazonaws.services.ec2.model.DescribeIdFormatResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeIdFormatRequest request]
    (-> this (.describeIdFormat request)))
  (^com.amazonaws.services.ec2.model.DescribeIdFormatResult [^AbstractAmazonEC2 this]
    (-> this (.describeIdFormat))))

(defn delete-tags
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteTagsResult`"
  (^com.amazonaws.services.ec2.model.DeleteTagsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteTagsRequest request]
    (-> this (.deleteTags request))))

(defn create-route-table
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateRouteTableRequest`

  returns: Result of the CreateRouteTable operation returned by the service. - `com.amazonaws.services.ec2.model.CreateRouteTableResult`"
  (^com.amazonaws.services.ec2.model.CreateRouteTableResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateRouteTableRequest request]
    (-> this (.createRouteTable request))))

(defn apply-security-groups-to-client-vpn-target-network
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkRequest`

  returns: Result of the ApplySecurityGroupsToClientVpnTargetNetwork operation returned by the service. - `com.amazonaws.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkResult`"
  (^com.amazonaws.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkRequest request]
    (-> this (.applySecurityGroupsToClientVpnTargetNetwork request))))

(defn delete-route-table
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteRouteTableRequest`

  returns: Result of the DeleteRouteTable operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteRouteTableResult`"
  (^com.amazonaws.services.ec2.model.DeleteRouteTableResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteRouteTableRequest request]
    (-> this (.deleteRouteTable request))))

(defn disable-vgw-route-propagation
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DisableVgwRoutePropagation. - `com.amazonaws.services.ec2.model.DisableVgwRoutePropagationRequest`

  returns: Result of the DisableVgwRoutePropagation operation returned by the service. - `com.amazonaws.services.ec2.model.DisableVgwRoutePropagationResult`"
  (^com.amazonaws.services.ec2.model.DisableVgwRoutePropagationResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DisableVgwRoutePropagationRequest request]
    (-> this (.disableVgwRoutePropagation request))))

(defn describe-instance-status
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeInstanceStatusRequest`

  returns: Result of the DescribeInstanceStatus operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeInstanceStatusResult`"
  (^com.amazonaws.services.ec2.model.DescribeInstanceStatusResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeInstanceStatusRequest request]
    (-> this (.describeInstanceStatus request)))
  (^com.amazonaws.services.ec2.model.DescribeInstanceStatusResult [^AbstractAmazonEC2 this]
    (-> this (.describeInstanceStatus))))

(defn delete-network-acl-entry
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteNetworkAclEntryRequest`

  returns: Result of the DeleteNetworkAclEntry operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteNetworkAclEntryResult`"
  (^com.amazonaws.services.ec2.model.DeleteNetworkAclEntryResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteNetworkAclEntryRequest request]
    (-> this (.deleteNetworkAclEntry request))))

(defn modify-instance-capacity-reservation-attributes
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyInstanceCapacityReservationAttributesRequest`

  returns: Result of the ModifyInstanceCapacityReservationAttributes operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyInstanceCapacityReservationAttributesResult`"
  (^com.amazonaws.services.ec2.model.ModifyInstanceCapacityReservationAttributesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyInstanceCapacityReservationAttributesRequest request]
    (-> this (.modifyInstanceCapacityReservationAttributes request))))

(defn create-subnet
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateSubnetRequest`

  returns: Result of the CreateSubnet operation returned by the service. - `com.amazonaws.services.ec2.model.CreateSubnetResult`"
  (^com.amazonaws.services.ec2.model.CreateSubnetResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateSubnetRequest request]
    (-> this (.createSubnet request))))

(defn describe-snapshot-attribute
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeSnapshotAttribute. - `com.amazonaws.services.ec2.model.DescribeSnapshotAttributeRequest`

  returns: Result of the DescribeSnapshotAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSnapshotAttributeResult`"
  (^com.amazonaws.services.ec2.model.DescribeSnapshotAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeSnapshotAttributeRequest request]
    (-> this (.describeSnapshotAttribute request))))

(defn report-instance-status
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ReportInstanceStatusRequest`

  returns: Result of the ReportInstanceStatus operation returned by the service. - `com.amazonaws.services.ec2.model.ReportInstanceStatusResult`"
  (^com.amazonaws.services.ec2.model.ReportInstanceStatusResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ReportInstanceStatusRequest request]
    (-> this (.reportInstanceStatus request))))

(defn describe-launch-templates
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeLaunchTemplatesRequest`

  returns: Result of the DescribeLaunchTemplates operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeLaunchTemplatesResult`"
  (^com.amazonaws.services.ec2.model.DescribeLaunchTemplatesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeLaunchTemplatesRequest request]
    (-> this (.describeLaunchTemplates request))))

(defn describe-classic-link-instances
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesRequest`

  returns: Result of the DescribeClassicLinkInstances operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesResult`"
  (^com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesRequest request]
    (-> this (.describeClassicLinkInstances request)))
  (^com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesResult [^AbstractAmazonEC2 this]
    (-> this (.describeClassicLinkInstances))))

(defn describe-launch-template-versions
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsRequest`

  returns: Result of the DescribeLaunchTemplateVersions operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsRequest request]
    (-> this (.describeLaunchTemplateVersions request))))

(defn deregister-image
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DeregisterImage. - `com.amazonaws.services.ec2.model.DeregisterImageRequest`

  returns: Result of the DeregisterImage operation returned by the service. - `com.amazonaws.services.ec2.model.DeregisterImageResult`"
  (^com.amazonaws.services.ec2.model.DeregisterImageResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeregisterImageRequest request]
    (-> this (.deregisterImage request))))

(defn delete-security-group
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteSecurityGroupRequest`

  returns: Result of the DeleteSecurityGroup operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteSecurityGroupResult`"
  (^com.amazonaws.services.ec2.model.DeleteSecurityGroupResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteSecurityGroupRequest request]
    (-> this (.deleteSecurityGroup request))))

(defn describe-volumes-modifications
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeVolumesModificationsRequest`

  returns: Result of the DescribeVolumesModifications operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVolumesModificationsResult`"
  (^com.amazonaws.services.ec2.model.DescribeVolumesModificationsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeVolumesModificationsRequest request]
    (-> this (.describeVolumesModifications request))))

(defn reset-ebs-default-kms-key-id
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ResetEbsDefaultKmsKeyIdRequest`

  returns: Result of the ResetEbsDefaultKmsKeyId operation returned by the service. - `com.amazonaws.services.ec2.model.ResetEbsDefaultKmsKeyIdResult`"
  (^com.amazonaws.services.ec2.model.ResetEbsDefaultKmsKeyIdResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ResetEbsDefaultKmsKeyIdRequest request]
    (-> this (.resetEbsDefaultKmsKeyId request))))

(defn import-volume
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ImportVolumeRequest`

  returns: Result of the ImportVolume operation returned by the service. - `com.amazonaws.services.ec2.model.ImportVolumeResult`"
  (^com.amazonaws.services.ec2.model.ImportVolumeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ImportVolumeRequest request]
    (-> this (.importVolume request))))

(defn modify-client-vpn-endpoint
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyClientVpnEndpointRequest`

  returns: Result of the ModifyClientVpnEndpoint operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyClientVpnEndpointResult`"
  (^com.amazonaws.services.ec2.model.ModifyClientVpnEndpointResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyClientVpnEndpointRequest request]
    (-> this (.modifyClientVpnEndpoint request))))

(defn describe-internet-gateways
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeInternetGatewaysRequest`

  returns: Result of the DescribeInternetGateways operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeInternetGatewaysResult`"
  (^com.amazonaws.services.ec2.model.DescribeInternetGatewaysResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeInternetGatewaysRequest request]
    (-> this (.describeInternetGateways request)))
  (^com.amazonaws.services.ec2.model.DescribeInternetGatewaysResult [^AbstractAmazonEC2 this]
    (-> this (.describeInternetGateways))))

(defn withdraw-byoip-cidr
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.WithdrawByoipCidrRequest`

  returns: Result of the WithdrawByoipCidr operation returned by the service. - `com.amazonaws.services.ec2.model.WithdrawByoipCidrResult`"
  (^com.amazonaws.services.ec2.model.WithdrawByoipCidrResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.WithdrawByoipCidrRequest request]
    (-> this (.withdrawByoipCidr request))))

(defn describe-scheduled-instances
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeScheduledInstances. - `com.amazonaws.services.ec2.model.DescribeScheduledInstancesRequest`

  returns: Result of the DescribeScheduledInstances operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeScheduledInstancesResult`"
  (^com.amazonaws.services.ec2.model.DescribeScheduledInstancesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeScheduledInstancesRequest request]
    (-> this (.describeScheduledInstances request))))

(defn describe-tags
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeTagsResult`"
  (^com.amazonaws.services.ec2.model.DescribeTagsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeTagsRequest request]
    (-> this (.describeTags request)))
  (^com.amazonaws.services.ec2.model.DescribeTagsResult [^AbstractAmazonEC2 this]
    (-> this (.describeTags))))

(defn replace-transit-gateway-route
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ReplaceTransitGatewayRouteRequest`

  returns: Result of the ReplaceTransitGatewayRoute operation returned by the service. - `com.amazonaws.services.ec2.model.ReplaceTransitGatewayRouteResult`"
  (^com.amazonaws.services.ec2.model.ReplaceTransitGatewayRouteResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ReplaceTransitGatewayRouteRequest request]
    (-> this (.replaceTransitGatewayRoute request))))

(defn describe-spot-fleet-instances
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeSpotFleetInstances. - `com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesRequest`

  returns: Result of the DescribeSpotFleetInstances operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesResult`"
  (^com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesRequest request]
    (-> this (.describeSpotFleetInstances request))))

(defn import-snapshot
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ImportSnapshotRequest`

  returns: Result of the ImportSnapshot operation returned by the service. - `com.amazonaws.services.ec2.model.ImportSnapshotResult`"
  (^com.amazonaws.services.ec2.model.ImportSnapshotResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ImportSnapshotRequest request]
    (-> this (.importSnapshot request)))
  (^com.amazonaws.services.ec2.model.ImportSnapshotResult [^AbstractAmazonEC2 this]
    (-> this (.importSnapshot))))

(defn run-instances
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.RunInstancesRequest`

  returns: Result of the RunInstances operation returned by the service. - `com.amazonaws.services.ec2.model.RunInstancesResult`"
  (^com.amazonaws.services.ec2.model.RunInstancesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.RunInstancesRequest request]
    (-> this (.runInstances request))))

(defn set-region
  "Description copied from interface: AmazonEC2

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonEC2 this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-network-acls
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeNetworkAclsRequest`

  returns: Result of the DescribeNetworkAcls operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeNetworkAclsResult`"
  (^com.amazonaws.services.ec2.model.DescribeNetworkAclsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeNetworkAclsRequest request]
    (-> this (.describeNetworkAcls request)))
  (^com.amazonaws.services.ec2.model.DescribeNetworkAclsResult [^AbstractAmazonEC2 this]
    (-> this (.describeNetworkAcls))))

(defn modify-image-attribute
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for ModifyImageAttribute. - `com.amazonaws.services.ec2.model.ModifyImageAttributeRequest`

  returns: Result of the ModifyImageAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyImageAttributeResult`"
  (^com.amazonaws.services.ec2.model.ModifyImageAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyImageAttributeRequest request]
    (-> this (.modifyImageAttribute request))))

(defn describe-spot-datafeed-subscription
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeSpotDatafeedSubscription. - `com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionRequest`

  returns: Result of the DescribeSpotDatafeedSubscription operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionResult`"
  (^com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionRequest request]
    (-> this (.describeSpotDatafeedSubscription request)))
  (^com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionResult [^AbstractAmazonEC2 this]
    (-> this (.describeSpotDatafeedSubscription))))

(defn describe-nat-gateways
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeNatGatewaysRequest`

  returns: Result of the DescribeNatGateways operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeNatGatewaysResult`"
  (^com.amazonaws.services.ec2.model.DescribeNatGatewaysResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeNatGatewaysRequest request]
    (-> this (.describeNatGateways request))))

(defn create-flow-logs
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateFlowLogsRequest`

  returns: Result of the CreateFlowLogs operation returned by the service. - `com.amazonaws.services.ec2.model.CreateFlowLogsResult`"
  (^com.amazonaws.services.ec2.model.CreateFlowLogsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateFlowLogsRequest request]
    (-> this (.createFlowLogs request))))

(defn describe-volumes
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeVolumesRequest`

  returns: Result of the DescribeVolumes operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVolumesResult`"
  (^com.amazonaws.services.ec2.model.DescribeVolumesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeVolumesRequest request]
    (-> this (.describeVolumes request)))
  (^com.amazonaws.services.ec2.model.DescribeVolumesResult [^AbstractAmazonEC2 this]
    (-> this (.describeVolumes))))

(defn get-transit-gateway-attachment-propagations
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.GetTransitGatewayAttachmentPropagationsRequest`

  returns: Result of the GetTransitGatewayAttachmentPropagations operation returned by the service. - `com.amazonaws.services.ec2.model.GetTransitGatewayAttachmentPropagationsResult`"
  (^com.amazonaws.services.ec2.model.GetTransitGatewayAttachmentPropagationsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.GetTransitGatewayAttachmentPropagationsRequest request]
    (-> this (.getTransitGatewayAttachmentPropagations request))))

(defn request-spot-fleet
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for RequestSpotFleet. - `com.amazonaws.services.ec2.model.RequestSpotFleetRequest`

  returns: Result of the RequestSpotFleet operation returned by the service. - `com.amazonaws.services.ec2.model.RequestSpotFleetResult`"
  (^com.amazonaws.services.ec2.model.RequestSpotFleetResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.RequestSpotFleetRequest request]
    (-> this (.requestSpotFleet request))))

(defn describe-network-interfaces
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeNetworkInterfaces. - `com.amazonaws.services.ec2.model.DescribeNetworkInterfacesRequest`

  returns: Result of the DescribeNetworkInterfaces operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeNetworkInterfacesResult`"
  (^com.amazonaws.services.ec2.model.DescribeNetworkInterfacesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeNetworkInterfacesRequest request]
    (-> this (.describeNetworkInterfaces request)))
  (^com.amazonaws.services.ec2.model.DescribeNetworkInterfacesResult [^AbstractAmazonEC2 this]
    (-> this (.describeNetworkInterfaces))))

(defn modify-volume
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyVolumeRequest`

  returns: Result of the ModifyVolume operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVolumeResult`"
  (^com.amazonaws.services.ec2.model.ModifyVolumeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyVolumeRequest request]
    (-> this (.modifyVolume request))))

(defn create-client-vpn-route
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateClientVpnRouteRequest`

  returns: Result of the CreateClientVpnRoute operation returned by the service. - `com.amazonaws.services.ec2.model.CreateClientVpnRouteResult`"
  (^com.amazonaws.services.ec2.model.CreateClientVpnRouteResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateClientVpnRouteRequest request]
    (-> this (.createClientVpnRoute request))))

(defn describe-spot-fleet-requests
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeSpotFleetRequests. - `com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsRequest`

  returns: Result of the DescribeSpotFleetRequests operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsResult`"
  (^com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsRequest request]
    (-> this (.describeSpotFleetRequests request)))
  (^com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsResult [^AbstractAmazonEC2 this]
    (-> this (.describeSpotFleetRequests))))

(defn describe-instance-attribute
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeInstanceAttributeRequest`

  returns: Result of the DescribeInstanceAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeInstanceAttributeResult`"
  (^com.amazonaws.services.ec2.model.DescribeInstanceAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeInstanceAttributeRequest request]
    (-> this (.describeInstanceAttribute request))))

(defn waiters
  "returns: `com.amazonaws.services.ec2.waiters.AmazonEC2Waiters`"
  (^com.amazonaws.services.ec2.waiters.AmazonEC2Waiters [^AbstractAmazonEC2 this]
    (-> this (.waiters))))

(defn modify-traffic-mirror-filter-network-services
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesRequest`

  returns: Result of the ModifyTrafficMirrorFilterNetworkServices operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesResult`"
  (^com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesRequest request]
    (-> this (.modifyTrafficMirrorFilterNetworkServices request))))

(defn replace-route-table-association
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationRequest`

  returns: Result of the ReplaceRouteTableAssociation operation returned by the service. - `com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationResult`"
  (^com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationRequest request]
    (-> this (.replaceRouteTableAssociation request))))

(defn accept-reserved-instances-exchange-quote
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for accepting the quote. - `com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteRequest`

  returns: Result of the AcceptReservedInstancesExchangeQuote operation returned by the service. - `com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteResult`"
  (^com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteRequest request]
    (-> this (.acceptReservedInstancesExchangeQuote request))))

(defn delete-vpc-endpoints
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DeleteVpcEndpoints. - `com.amazonaws.services.ec2.model.DeleteVpcEndpointsRequest`

  returns: Result of the DeleteVpcEndpoints operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteVpcEndpointsResult`"
  (^com.amazonaws.services.ec2.model.DeleteVpcEndpointsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteVpcEndpointsRequest request]
    (-> this (.deleteVpcEndpoints request))))

(defn search-transit-gateway-routes
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.SearchTransitGatewayRoutesRequest`

  returns: Result of the SearchTransitGatewayRoutes operation returned by the service. - `com.amazonaws.services.ec2.model.SearchTransitGatewayRoutesResult`"
  (^com.amazonaws.services.ec2.model.SearchTransitGatewayRoutesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.SearchTransitGatewayRoutesRequest request]
    (-> this (.searchTransitGatewayRoutes request))))

(defn create-reserved-instances-listing
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for CreateReservedInstancesListing. - `com.amazonaws.services.ec2.model.CreateReservedInstancesListingRequest`

  returns: Result of the CreateReservedInstancesListing operation returned by the service. - `com.amazonaws.services.ec2.model.CreateReservedInstancesListingResult`"
  (^com.amazonaws.services.ec2.model.CreateReservedInstancesListingResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateReservedInstancesListingRequest request]
    (-> this (.createReservedInstancesListing request))))

(defn cancel-conversion-task
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CancelConversionTaskRequest`

  returns: Result of the CancelConversionTask operation returned by the service. - `com.amazonaws.services.ec2.model.CancelConversionTaskResult`"
  (^com.amazonaws.services.ec2.model.CancelConversionTaskResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CancelConversionTaskRequest request]
    (-> this (.cancelConversionTask request))))

(defn accept-vpc-endpoint-connections
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsRequest`

  returns: Result of the AcceptVpcEndpointConnections operation returned by the service. - `com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsResult`"
  (^com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsRequest request]
    (-> this (.acceptVpcEndpointConnections request))))

(defn describe-vpc-peering-connections
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsRequest`

  returns: Result of the DescribeVpcPeeringConnections operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsRequest request]
    (-> this (.describeVpcPeeringConnections request)))
  (^com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsResult [^AbstractAmazonEC2 this]
    (-> this (.describeVpcPeeringConnections))))

(defn create-transit-gateway
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateTransitGatewayRequest`

  returns: Result of the CreateTransitGateway operation returned by the service. - `com.amazonaws.services.ec2.model.CreateTransitGatewayResult`"
  (^com.amazonaws.services.ec2.model.CreateTransitGatewayResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateTransitGatewayRequest request]
    (-> this (.createTransitGateway request))))

(defn describe-key-pairs
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeKeyPairsRequest`

  returns: Result of the DescribeKeyPairs operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeKeyPairsResult`"
  (^com.amazonaws.services.ec2.model.DescribeKeyPairsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeKeyPairsRequest request]
    (-> this (.describeKeyPairs request)))
  (^com.amazonaws.services.ec2.model.DescribeKeyPairsResult [^AbstractAmazonEC2 this]
    (-> this (.describeKeyPairs))))

(defn enable-ebs-encryption-by-default
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.EnableEbsEncryptionByDefaultRequest`

  returns: Result of the EnableEbsEncryptionByDefault operation returned by the service. - `com.amazonaws.services.ec2.model.EnableEbsEncryptionByDefaultResult`"
  (^com.amazonaws.services.ec2.model.EnableEbsEncryptionByDefaultResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.EnableEbsEncryptionByDefaultRequest request]
    (-> this (.enableEbsEncryptionByDefault request))))

(defn assign-private-ip-addresses
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for AssignPrivateIpAddresses. - `com.amazonaws.services.ec2.model.AssignPrivateIpAddressesRequest`

  returns: Result of the AssignPrivateIpAddresses operation returned by the service. - `com.amazonaws.services.ec2.model.AssignPrivateIpAddressesResult`"
  (^com.amazonaws.services.ec2.model.AssignPrivateIpAddressesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AssignPrivateIpAddressesRequest request]
    (-> this (.assignPrivateIpAddresses request))))

(defn describe-identity-id-format
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeIdentityIdFormatRequest`

  returns: Result of the DescribeIdentityIdFormat operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeIdentityIdFormatResult`"
  (^com.amazonaws.services.ec2.model.DescribeIdentityIdFormatResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeIdentityIdFormatRequest request]
    (-> this (.describeIdentityIdFormat request))))

(defn delete-spot-datafeed-subscription
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DeleteSpotDatafeedSubscription. - `com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionRequest`

  returns: Result of the DeleteSpotDatafeedSubscription operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionResult`"
  (^com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionRequest request]
    (-> this (.deleteSpotDatafeedSubscription request)))
  (^com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionResult [^AbstractAmazonEC2 this]
    (-> this (.deleteSpotDatafeedSubscription))))

(defn describe-reserved-instances-offerings
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeReservedInstancesOfferings. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsRequest`

  returns: Result of the DescribeReservedInstancesOfferings operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsResult`"
  (^com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsRequest request]
    (-> this (.describeReservedInstancesOfferings request)))
  (^com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsResult [^AbstractAmazonEC2 this]
    (-> this (.describeReservedInstancesOfferings))))

(defn modify-snapshot-attribute
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for ModifySnapshotAttribute. - `com.amazonaws.services.ec2.model.ModifySnapshotAttributeRequest`

  returns: Result of the ModifySnapshotAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ModifySnapshotAttributeResult`"
  (^com.amazonaws.services.ec2.model.ModifySnapshotAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifySnapshotAttributeRequest request]
    (-> this (.modifySnapshotAttribute request))))

(defn delete-client-vpn-route
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteClientVpnRouteRequest`

  returns: Result of the DeleteClientVpnRoute operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteClientVpnRouteResult`"
  (^com.amazonaws.services.ec2.model.DeleteClientVpnRouteResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteClientVpnRouteRequest request]
    (-> this (.deleteClientVpnRoute request))))

(defn modify-transit-gateway-vpc-attachment
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequest`

  returns: Result of the ModifyTransitGatewayVpcAttachment operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyTransitGatewayVpcAttachmentResult`"
  (^com.amazonaws.services.ec2.model.ModifyTransitGatewayVpcAttachmentResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequest request]
    (-> this (.modifyTransitGatewayVpcAttachment request))))

(defn modify-vpc-endpoint
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for ModifyVpcEndpoint. - `com.amazonaws.services.ec2.model.ModifyVpcEndpointRequest`

  returns: Result of the ModifyVpcEndpoint operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVpcEndpointResult`"
  (^com.amazonaws.services.ec2.model.ModifyVpcEndpointResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointRequest request]
    (-> this (.modifyVpcEndpoint request))))

(defn detach-internet-gateway
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DetachInternetGatewayRequest`

  returns: Result of the DetachInternetGateway operation returned by the service. - `com.amazonaws.services.ec2.model.DetachInternetGatewayResult`"
  (^com.amazonaws.services.ec2.model.DetachInternetGatewayResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DetachInternetGatewayRequest request]
    (-> this (.detachInternetGateway request))))

(defn describe-addresses
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeAddressesRequest`

  returns: Result of the DescribeAddresses operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeAddressesResult`"
  (^com.amazonaws.services.ec2.model.DescribeAddressesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeAddressesRequest request]
    (-> this (.describeAddresses request)))
  (^com.amazonaws.services.ec2.model.DescribeAddressesResult [^AbstractAmazonEC2 this]
    (-> this (.describeAddresses))))

(defn copy-snapshot
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for CopySnapshot. - `com.amazonaws.services.ec2.model.CopySnapshotRequest`

  returns: Result of the CopySnapshot operation returned by the service. - `com.amazonaws.services.ec2.model.CopySnapshotResult`"
  (^com.amazonaws.services.ec2.model.CopySnapshotResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CopySnapshotRequest request]
    (-> this (.copySnapshot request))))

(defn release-address
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ReleaseAddressRequest`

  returns: Result of the ReleaseAddress operation returned by the service. - `com.amazonaws.services.ec2.model.ReleaseAddressResult`"
  (^com.amazonaws.services.ec2.model.ReleaseAddressResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ReleaseAddressRequest request]
    (-> this (.releaseAddress request))))

(defn delete-volume
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DeleteVolume. - `com.amazonaws.services.ec2.model.DeleteVolumeRequest`

  returns: Result of the DeleteVolume operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteVolumeResult`"
  (^com.amazonaws.services.ec2.model.DeleteVolumeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteVolumeRequest request]
    (-> this (.deleteVolume request))))

(defn create-vpn-connection
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for CreateVpnConnection. - `com.amazonaws.services.ec2.model.CreateVpnConnectionRequest`

  returns: Result of the CreateVpnConnection operation returned by the service. - `com.amazonaws.services.ec2.model.CreateVpnConnectionResult`"
  (^com.amazonaws.services.ec2.model.CreateVpnConnectionResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateVpnConnectionRequest request]
    (-> this (.createVpnConnection request))))

(defn describe-prefix-lists
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribePrefixListsRequest`

  returns: Result of the DescribePrefixLists operation returned by the service. - `com.amazonaws.services.ec2.model.DescribePrefixListsResult`"
  (^com.amazonaws.services.ec2.model.DescribePrefixListsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribePrefixListsRequest request]
    (-> this (.describePrefixLists request)))
  (^com.amazonaws.services.ec2.model.DescribePrefixListsResult [^AbstractAmazonEC2 this]
    (-> this (.describePrefixLists))))

(defn modify-fpga-image-attribute
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeRequest`

  returns: Result of the ModifyFpgaImageAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeResult`"
  (^com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeRequest request]
    (-> this (.modifyFpgaImageAttribute request))))

(defn disable-vpc-classic-link-dns-support
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportRequest`

  returns: Result of the DisableVpcClassicLinkDnsSupport operation returned by the service. - `com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportResult`"
  (^com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportRequest request]
    (-> this (.disableVpcClassicLinkDnsSupport request))))

(defn describe-reserved-instances-listings
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeReservedInstancesListings. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsRequest`

  returns: Result of the DescribeReservedInstancesListings operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsResult`"
  (^com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsRequest request]
    (-> this (.describeReservedInstancesListings request)))
  (^com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsResult [^AbstractAmazonEC2 this]
    (-> this (.describeReservedInstancesListings))))

(defn describe-byoip-cidrs
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeByoipCidrsRequest`

  returns: Result of the DescribeByoipCidrs operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeByoipCidrsResult`"
  (^com.amazonaws.services.ec2.model.DescribeByoipCidrsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeByoipCidrsRequest request]
    (-> this (.describeByoipCidrs request))))

(defn modify-network-interface-attribute
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for ModifyNetworkInterfaceAttribute. - `com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeRequest`

  returns: Result of the ModifyNetworkInterfaceAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeResult`"
  (^com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeRequest request]
    (-> this (.modifyNetworkInterfaceAttribute request))))

(defn describe-vpc-endpoint-connection-notifications
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsRequest`

  returns: Result of the DescribeVpcEndpointConnectionNotifications operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsRequest request]
    (-> this (.describeVpcEndpointConnectionNotifications request))))

(defn delete-fpga-image
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteFpgaImageRequest`

  returns: Result of the DeleteFpgaImage operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteFpgaImageResult`"
  (^com.amazonaws.services.ec2.model.DeleteFpgaImageResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteFpgaImageRequest request]
    (-> this (.deleteFpgaImage request))))

(defn create-vpc-endpoint-connection-notification
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationRequest`

  returns: Result of the CreateVpcEndpointConnectionNotification operation returned by the service. - `com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationResult`"
  (^com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationRequest request]
    (-> this (.createVpcEndpointConnectionNotification request))))

(defn describe-iam-instance-profile-associations
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsRequest`

  returns: Result of the DescribeIamInstanceProfileAssociations operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsResult`"
  (^com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsRequest request]
    (-> this (.describeIamInstanceProfileAssociations request))))

(defn modify-vpn-connection
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyVpnConnectionRequest`

  returns: Result of the ModifyVpnConnection operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVpnConnectionResult`"
  (^com.amazonaws.services.ec2.model.ModifyVpnConnectionResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyVpnConnectionRequest request]
    (-> this (.modifyVpnConnection request))))

(defn create-launch-template
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateLaunchTemplateRequest`

  returns: Result of the CreateLaunchTemplate operation returned by the service. - `com.amazonaws.services.ec2.model.CreateLaunchTemplateResult`"
  (^com.amazonaws.services.ec2.model.CreateLaunchTemplateResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateLaunchTemplateRequest request]
    (-> this (.createLaunchTemplate request))))

(defn assign-ipv-6-addresses
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AssignIpv6AddressesRequest`

  returns: Result of the AssignIpv6Addresses operation returned by the service. - `com.amazonaws.services.ec2.model.AssignIpv6AddressesResult`"
  (^com.amazonaws.services.ec2.model.AssignIpv6AddressesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AssignIpv6AddressesRequest request]
    (-> this (.assignIpv6Addresses request))))

(defn enable-vpc-classic-link-dns-support
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportRequest`

  returns: Result of the EnableVpcClassicLinkDnsSupport operation returned by the service. - `com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportResult`"
  (^com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportRequest request]
    (-> this (.enableVpcClassicLinkDnsSupport request))))

(defn import-client-vpn-client-certificate-revocation-list
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ImportClientVpnClientCertificateRevocationListRequest`

  returns: Result of the ImportClientVpnClientCertificateRevocationList operation returned by the service. - `com.amazonaws.services.ec2.model.ImportClientVpnClientCertificateRevocationListResult`"
  (^com.amazonaws.services.ec2.model.ImportClientVpnClientCertificateRevocationListResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ImportClientVpnClientCertificateRevocationListRequest request]
    (-> this (.importClientVpnClientCertificateRevocationList request))))

(defn describe-elastic-gpus
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeElasticGpusRequest`

  returns: Result of the DescribeElasticGpus operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeElasticGpusResult`"
  (^com.amazonaws.services.ec2.model.DescribeElasticGpusResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeElasticGpusRequest request]
    (-> this (.describeElasticGpus request))))

(defn create-vpn-gateway
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for CreateVpnGateway. - `com.amazonaws.services.ec2.model.CreateVpnGatewayRequest`

  returns: Result of the CreateVpnGateway operation returned by the service. - `com.amazonaws.services.ec2.model.CreateVpnGatewayResult`"
  (^com.amazonaws.services.ec2.model.CreateVpnGatewayResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateVpnGatewayRequest request]
    (-> this (.createVpnGateway request))))

(defn modify-reserved-instances
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for ModifyReservedInstances. - `com.amazonaws.services.ec2.model.ModifyReservedInstancesRequest`

  returns: Result of the ModifyReservedInstances operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyReservedInstancesResult`"
  (^com.amazonaws.services.ec2.model.ModifyReservedInstancesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyReservedInstancesRequest request]
    (-> this (.modifyReservedInstances request))))

(defn describe-vpc-endpoints
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeVpcEndpoints. - `com.amazonaws.services.ec2.model.DescribeVpcEndpointsRequest`

  returns: Result of the DescribeVpcEndpoints operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcEndpointsResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcEndpointsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointsRequest request]
    (-> this (.describeVpcEndpoints request)))
  (^com.amazonaws.services.ec2.model.DescribeVpcEndpointsResult [^AbstractAmazonEC2 this]
    (-> this (.describeVpcEndpoints))))

(defn get-console-screenshot
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.GetConsoleScreenshotRequest`

  returns: Result of the GetConsoleScreenshot operation returned by the service. - `com.amazonaws.services.ec2.model.GetConsoleScreenshotResult`"
  (^com.amazonaws.services.ec2.model.GetConsoleScreenshotResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.GetConsoleScreenshotRequest request]
    (-> this (.getConsoleScreenshot request))))

(defn reset-snapshot-attribute
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for ResetSnapshotAttribute. - `com.amazonaws.services.ec2.model.ResetSnapshotAttributeRequest`

  returns: Result of the ResetSnapshotAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ResetSnapshotAttributeResult`"
  (^com.amazonaws.services.ec2.model.ResetSnapshotAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ResetSnapshotAttributeRequest request]
    (-> this (.resetSnapshotAttribute request))))

(defn create-fleet
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateFleetRequest`

  returns: Result of the CreateFleet operation returned by the service. - `com.amazonaws.services.ec2.model.CreateFleetResult`"
  (^com.amazonaws.services.ec2.model.CreateFleetResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateFleetRequest request]
    (-> this (.createFleet request))))

(defn get-transit-gateway-route-table-associations
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.GetTransitGatewayRouteTableAssociationsRequest`

  returns: Result of the GetTransitGatewayRouteTableAssociations operation returned by the service. - `com.amazonaws.services.ec2.model.GetTransitGatewayRouteTableAssociationsResult`"
  (^com.amazonaws.services.ec2.model.GetTransitGatewayRouteTableAssociationsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.GetTransitGatewayRouteTableAssociationsRequest request]
    (-> this (.getTransitGatewayRouteTableAssociations request))))

(defn associate-iam-instance-profile
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AssociateIamInstanceProfileRequest`

  returns: Result of the AssociateIamInstanceProfile operation returned by the service. - `com.amazonaws.services.ec2.model.AssociateIamInstanceProfileResult`"
  (^com.amazonaws.services.ec2.model.AssociateIamInstanceProfileResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AssociateIamInstanceProfileRequest request]
    (-> this (.associateIamInstanceProfile request))))

(defn delete-vpc
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteVpcRequest`

  returns: Result of the DeleteVpc operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteVpcResult`"
  (^com.amazonaws.services.ec2.model.DeleteVpcResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteVpcRequest request]
    (-> this (.deleteVpc request))))

(defn modify-ebs-default-kms-key-id
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyEbsDefaultKmsKeyIdRequest`

  returns: Result of the ModifyEbsDefaultKmsKeyId operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyEbsDefaultKmsKeyIdResult`"
  (^com.amazonaws.services.ec2.model.ModifyEbsDefaultKmsKeyIdResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyEbsDefaultKmsKeyIdRequest request]
    (-> this (.modifyEbsDefaultKmsKeyId request))))

(defn associate-subnet-cidr-block
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockRequest`

  returns: Result of the AssociateSubnetCidrBlock operation returned by the service. - `com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockResult`"
  (^com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockRequest request]
    (-> this (.associateSubnetCidrBlock request))))

(defn revoke-security-group-egress
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressRequest`

  returns: Result of the RevokeSecurityGroupEgress operation returned by the service. - `com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressResult`"
  (^com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressRequest request]
    (-> this (.revokeSecurityGroupEgress request))))

(defn unassign-ipv-6-addresses
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.UnassignIpv6AddressesRequest`

  returns: Result of the UnassignIpv6Addresses operation returned by the service. - `com.amazonaws.services.ec2.model.UnassignIpv6AddressesResult`"
  (^com.amazonaws.services.ec2.model.UnassignIpv6AddressesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.UnassignIpv6AddressesRequest request]
    (-> this (.unassignIpv6Addresses request))))

(defn export-client-vpn-client-configuration
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ExportClientVpnClientConfigurationRequest`

  returns: Result of the ExportClientVpnClientConfiguration operation returned by the service. - `com.amazonaws.services.ec2.model.ExportClientVpnClientConfigurationResult`"
  (^com.amazonaws.services.ec2.model.ExportClientVpnClientConfigurationResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ExportClientVpnClientConfigurationRequest request]
    (-> this (.exportClientVpnClientConfiguration request))))

(defn reject-vpc-peering-connection
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionRequest`

  returns: Result of the RejectVpcPeeringConnection operation returned by the service. - `com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionResult`"
  (^com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionRequest request]
    (-> this (.rejectVpcPeeringConnection request))))

(defn create-traffic-mirror-filter-rule
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRuleRequest`

  returns: Result of the CreateTrafficMirrorFilterRule operation returned by the service. - `com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRuleResult`"
  (^com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRuleResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRuleRequest request]
    (-> this (.createTrafficMirrorFilterRule request))))

(defn update-security-group-rule-descriptions-egress
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressRequest`

  returns: Result of the UpdateSecurityGroupRuleDescriptionsEgress operation returned by the service. - `com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressResult`"
  (^com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressRequest request]
    (-> this (.updateSecurityGroupRuleDescriptionsEgress request))))

(defn delete-vpc-endpoint-service-configurations
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsRequest`

  returns: Result of the DeleteVpcEndpointServiceConfigurations operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsResult`"
  (^com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsRequest request]
    (-> this (.deleteVpcEndpointServiceConfigurations request))))

(defn describe-network-interface-permissions
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeNetworkInterfacePermissions. - `com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsRequest`

  returns: Result of the DescribeNetworkInterfacePermissions operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsRequest request]
    (-> this (.describeNetworkInterfacePermissions request))))

(defn create-security-group
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateSecurityGroupRequest`

  returns: Result of the CreateSecurityGroup operation returned by the service. - `com.amazonaws.services.ec2.model.CreateSecurityGroupResult`"
  (^com.amazonaws.services.ec2.model.CreateSecurityGroupResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateSecurityGroupRequest request]
    (-> this (.createSecurityGroup request))))

(defn describe-fpga-images
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeFpgaImagesRequest`

  returns: Result of the DescribeFpgaImages operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeFpgaImagesResult`"
  (^com.amazonaws.services.ec2.model.DescribeFpgaImagesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeFpgaImagesRequest request]
    (-> this (.describeFpgaImages request))))

(defn cancel-reserved-instances-listing
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for CancelReservedInstancesListing. - `com.amazonaws.services.ec2.model.CancelReservedInstancesListingRequest`

  returns: Result of the CancelReservedInstancesListing operation returned by the service. - `com.amazonaws.services.ec2.model.CancelReservedInstancesListingResult`"
  (^com.amazonaws.services.ec2.model.CancelReservedInstancesListingResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CancelReservedInstancesListingRequest request]
    (-> this (.cancelReservedInstancesListing request))))

(defn describe-capacity-reservations
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeCapacityReservationsRequest`

  returns: Result of the DescribeCapacityReservations operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeCapacityReservationsResult`"
  (^com.amazonaws.services.ec2.model.DescribeCapacityReservationsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeCapacityReservationsRequest request]
    (-> this (.describeCapacityReservations request))))

(defn describe-aggregate-id-format
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeAggregateIdFormatRequest`

  returns: Result of the DescribeAggregateIdFormat operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeAggregateIdFormatResult`"
  (^com.amazonaws.services.ec2.model.DescribeAggregateIdFormatResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeAggregateIdFormatRequest request]
    (-> this (.describeAggregateIdFormat request))))

(defn export-client-vpn-client-certificate-revocation-list
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ExportClientVpnClientCertificateRevocationListRequest`

  returns: Result of the ExportClientVpnClientCertificateRevocationList operation returned by the service. - `com.amazonaws.services.ec2.model.ExportClientVpnClientCertificateRevocationListResult`"
  (^com.amazonaws.services.ec2.model.ExportClientVpnClientCertificateRevocationListResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ExportClientVpnClientCertificateRevocationListRequest request]
    (-> this (.exportClientVpnClientCertificateRevocationList request))))

(defn allocate-hosts
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AllocateHostsRequest`

  returns: Result of the AllocateHosts operation returned by the service. - `com.amazonaws.services.ec2.model.AllocateHostsResult`"
  (^com.amazonaws.services.ec2.model.AllocateHostsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AllocateHostsRequest request]
    (-> this (.allocateHosts request))))

(defn describe-transit-gateways
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeTransitGatewaysRequest`

  returns: Result of the DescribeTransitGateways operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeTransitGatewaysResult`"
  (^com.amazonaws.services.ec2.model.DescribeTransitGatewaysResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeTransitGatewaysRequest request]
    (-> this (.describeTransitGateways request))))

(defn modify-instance-placement
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyInstancePlacementRequest`

  returns: Result of the ModifyInstancePlacement operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyInstancePlacementResult`"
  (^com.amazonaws.services.ec2.model.ModifyInstancePlacementResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyInstancePlacementRequest request]
    (-> this (.modifyInstancePlacement request))))

(defn describe-traffic-mirror-filters
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeTrafficMirrorFiltersRequest`

  returns: Result of the DescribeTrafficMirrorFilters operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeTrafficMirrorFiltersResult`"
  (^com.amazonaws.services.ec2.model.DescribeTrafficMirrorFiltersResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeTrafficMirrorFiltersRequest request]
    (-> this (.describeTrafficMirrorFilters request))))

(defn attach-volume
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for AttachVolume. - `com.amazonaws.services.ec2.model.AttachVolumeRequest`

  returns: Result of the AttachVolume operation returned by the service. - `com.amazonaws.services.ec2.model.AttachVolumeResult`"
  (^com.amazonaws.services.ec2.model.AttachVolumeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AttachVolumeRequest request]
    (-> this (.attachVolume request))))

(defn create-vpc-peering-connection
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionRequest`

  returns: Result of the CreateVpcPeeringConnection operation returned by the service. - `com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionResult`"
  (^com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionRequest request]
    (-> this (.createVpcPeeringConnection request)))
  (^com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionResult [^AbstractAmazonEC2 this]
    (-> this (.createVpcPeeringConnection))))

(defn describe-volume-attribute
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeVolumeAttribute. - `com.amazonaws.services.ec2.model.DescribeVolumeAttributeRequest`

  returns: Result of the DescribeVolumeAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVolumeAttributeResult`"
  (^com.amazonaws.services.ec2.model.DescribeVolumeAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeVolumeAttributeRequest request]
    (-> this (.describeVolumeAttribute request))))

(defn modify-spot-fleet-request
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for ModifySpotFleetRequest. - `com.amazonaws.services.ec2.model.ModifySpotFleetRequestRequest`

  returns: Result of the ModifySpotFleetRequest operation returned by the service. - `com.amazonaws.services.ec2.model.ModifySpotFleetRequestResult`"
  (^com.amazonaws.services.ec2.model.ModifySpotFleetRequestResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifySpotFleetRequestRequest request]
    (-> this (.modifySpotFleetRequest request))))

(defn get-ebs-encryption-by-default
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.GetEbsEncryptionByDefaultRequest`

  returns: Result of the GetEbsEncryptionByDefault operation returned by the service. - `com.amazonaws.services.ec2.model.GetEbsEncryptionByDefaultResult`"
  (^com.amazonaws.services.ec2.model.GetEbsEncryptionByDefaultResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.GetEbsEncryptionByDefaultRequest request]
    (-> this (.getEbsEncryptionByDefault request))))

(defn describe-traffic-mirror-sessions
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeTrafficMirrorSessionsRequest`

  returns: Result of the DescribeTrafficMirrorSessions operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeTrafficMirrorSessionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeTrafficMirrorSessionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeTrafficMirrorSessionsRequest request]
    (-> this (.describeTrafficMirrorSessions request))))

(defn create-capacity-reservation
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateCapacityReservationRequest`

  returns: Result of the CreateCapacityReservation operation returned by the service. - `com.amazonaws.services.ec2.model.CreateCapacityReservationResult`"
  (^com.amazonaws.services.ec2.model.CreateCapacityReservationResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateCapacityReservationRequest request]
    (-> this (.createCapacityReservation request))))

(defn describe-route-tables
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeRouteTablesRequest`

  returns: Result of the DescribeRouteTables operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeRouteTablesResult`"
  (^com.amazonaws.services.ec2.model.DescribeRouteTablesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeRouteTablesRequest request]
    (-> this (.describeRouteTables request)))
  (^com.amazonaws.services.ec2.model.DescribeRouteTablesResult [^AbstractAmazonEC2 this]
    (-> this (.describeRouteTables))))

(defn describe-vpc-endpoint-connections
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsRequest`

  returns: Result of the DescribeVpcEndpointConnections operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsRequest request]
    (-> this (.describeVpcEndpointConnections request))))

(defn describe-fleet-instances
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeFleetInstancesRequest`

  returns: Result of the DescribeFleetInstances operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeFleetInstancesResult`"
  (^com.amazonaws.services.ec2.model.DescribeFleetInstancesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeFleetInstancesRequest request]
    (-> this (.describeFleetInstances request))))

(defn describe-vpc-endpoint-service-configurations
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsRequest`

  returns: Result of the DescribeVpcEndpointServiceConfigurations operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsRequest request]
    (-> this (.describeVpcEndpointServiceConfigurations request))))

(defn reject-vpc-endpoint-connections
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsRequest`

  returns: Result of the RejectVpcEndpointConnections operation returned by the service. - `com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsResult`"
  (^com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsRequest request]
    (-> this (.rejectVpcEndpointConnections request))))

(defn enable-vpc-classic-link
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.EnableVpcClassicLinkRequest`

  returns: Result of the EnableVpcClassicLink operation returned by the service. - `com.amazonaws.services.ec2.model.EnableVpcClassicLinkResult`"
  (^com.amazonaws.services.ec2.model.EnableVpcClassicLinkResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.EnableVpcClassicLinkRequest request]
    (-> this (.enableVpcClassicLink request))))

(defn describe-vpc-endpoint-service-permissions
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsRequest`

  returns: Result of the DescribeVpcEndpointServicePermissions operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsRequest request]
    (-> this (.describeVpcEndpointServicePermissions request))))

(defn update-security-group-rule-descriptions-ingress
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressRequest`

  returns: Result of the UpdateSecurityGroupRuleDescriptionsIngress operation returned by the service. - `com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressResult`"
  (^com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressRequest request]
    (-> this (.updateSecurityGroupRuleDescriptionsIngress request))))

(defn enable-vgw-route-propagation
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for EnableVgwRoutePropagation. - `com.amazonaws.services.ec2.model.EnableVgwRoutePropagationRequest`

  returns: Result of the EnableVgwRoutePropagation operation returned by the service. - `com.amazonaws.services.ec2.model.EnableVgwRoutePropagationResult`"
  (^com.amazonaws.services.ec2.model.EnableVgwRoutePropagationResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.EnableVgwRoutePropagationRequest request]
    (-> this (.enableVgwRoutePropagation request))))

(defn describe-customer-gateways
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeCustomerGateways. - `com.amazonaws.services.ec2.model.DescribeCustomerGatewaysRequest`

  returns: Result of the DescribeCustomerGateways operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeCustomerGatewaysResult`"
  (^com.amazonaws.services.ec2.model.DescribeCustomerGatewaysResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeCustomerGatewaysRequest request]
    (-> this (.describeCustomerGateways request)))
  (^com.amazonaws.services.ec2.model.DescribeCustomerGatewaysResult [^AbstractAmazonEC2 this]
    (-> this (.describeCustomerGateways))))

(defn create-network-acl
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateNetworkAclRequest`

  returns: Result of the CreateNetworkAcl operation returned by the service. - `com.amazonaws.services.ec2.model.CreateNetworkAclResult`"
  (^com.amazonaws.services.ec2.model.CreateNetworkAclResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateNetworkAclRequest request]
    (-> this (.createNetworkAcl request))))

(defn register-image
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for RegisterImage. - `com.amazonaws.services.ec2.model.RegisterImageRequest`

  returns: Result of the RegisterImage operation returned by the service. - `com.amazonaws.services.ec2.model.RegisterImageResult`"
  (^com.amazonaws.services.ec2.model.RegisterImageResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.RegisterImageRequest request]
    (-> this (.registerImage request))))

(defn describe-spot-fleet-request-history
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeSpotFleetRequestHistory. - `com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryRequest`

  returns: Result of the DescribeSpotFleetRequestHistory operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryResult`"
  (^com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryRequest request]
    (-> this (.describeSpotFleetRequestHistory request))))

(defn run-scheduled-instances
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for RunScheduledInstances. - `com.amazonaws.services.ec2.model.RunScheduledInstancesRequest`

  returns: Result of the RunScheduledInstances operation returned by the service. - `com.amazonaws.services.ec2.model.RunScheduledInstancesResult`"
  (^com.amazonaws.services.ec2.model.RunScheduledInstancesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.RunScheduledInstancesRequest request]
    (-> this (.runScheduledInstances request))))

(defn create-internet-gateway
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateInternetGatewayRequest`

  returns: Result of the CreateInternetGateway operation returned by the service. - `com.amazonaws.services.ec2.model.CreateInternetGatewayResult`"
  (^com.amazonaws.services.ec2.model.CreateInternetGatewayResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateInternetGatewayRequest request]
    (-> this (.createInternetGateway request)))
  (^com.amazonaws.services.ec2.model.CreateInternetGatewayResult [^AbstractAmazonEC2 this]
    (-> this (.createInternetGateway))))

(defn detach-vpn-gateway
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DetachVpnGateway. - `com.amazonaws.services.ec2.model.DetachVpnGatewayRequest`

  returns: Result of the DetachVpnGateway operation returned by the service. - `com.amazonaws.services.ec2.model.DetachVpnGatewayResult`"
  (^com.amazonaws.services.ec2.model.DetachVpnGatewayResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DetachVpnGatewayRequest request]
    (-> this (.detachVpnGateway request))))

(defn create-route
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateRouteRequest`

  returns: Result of the CreateRoute operation returned by the service. - `com.amazonaws.services.ec2.model.CreateRouteResult`"
  (^com.amazonaws.services.ec2.model.CreateRouteResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateRouteRequest request]
    (-> this (.createRoute request))))

(defn delete-subnet
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteSubnetRequest`

  returns: Result of the DeleteSubnet operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteSubnetResult`"
  (^com.amazonaws.services.ec2.model.DeleteSubnetResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteSubnetRequest request]
    (-> this (.deleteSubnet request))))

(defn describe-client-vpn-authorization-rules
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeClientVpnAuthorizationRulesRequest`

  returns: Result of the DescribeClientVpnAuthorizationRules operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeClientVpnAuthorizationRulesResult`"
  (^com.amazonaws.services.ec2.model.DescribeClientVpnAuthorizationRulesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeClientVpnAuthorizationRulesRequest request]
    (-> this (.describeClientVpnAuthorizationRules request))))

(defn create-transit-gateway-route-table
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateTransitGatewayRouteTableRequest`

  returns: Result of the CreateTransitGatewayRouteTable operation returned by the service. - `com.amazonaws.services.ec2.model.CreateTransitGatewayRouteTableResult`"
  (^com.amazonaws.services.ec2.model.CreateTransitGatewayRouteTableResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateTransitGatewayRouteTableRequest request]
    (-> this (.createTransitGatewayRouteTable request))))

(defn delete-vpn-connection-route
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DeleteVpnConnectionRoute. - `com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteRequest`

  returns: Result of the DeleteVpnConnectionRoute operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteResult`"
  (^com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteRequest request]
    (-> this (.deleteVpnConnectionRoute request))))

(defn create-vpn-connection-route
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for CreateVpnConnectionRoute. - `com.amazonaws.services.ec2.model.CreateVpnConnectionRouteRequest`

  returns: Result of the CreateVpnConnectionRoute operation returned by the service. - `com.amazonaws.services.ec2.model.CreateVpnConnectionRouteResult`"
  (^com.amazonaws.services.ec2.model.CreateVpnConnectionRouteResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateVpnConnectionRouteRequest request]
    (-> this (.createVpnConnectionRoute request))))

(defn disassociate-transit-gateway-route-table
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DisassociateTransitGatewayRouteTableRequest`

  returns: Result of the DisassociateTransitGatewayRouteTable operation returned by the service. - `com.amazonaws.services.ec2.model.DisassociateTransitGatewayRouteTableResult`"
  (^com.amazonaws.services.ec2.model.DisassociateTransitGatewayRouteTableResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DisassociateTransitGatewayRouteTableRequest request]
    (-> this (.disassociateTransitGatewayRouteTable request))))

(defn monitor-instances
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.MonitorInstancesRequest`

  returns: Result of the MonitorInstances operation returned by the service. - `com.amazonaws.services.ec2.model.MonitorInstancesResult`"
  (^com.amazonaws.services.ec2.model.MonitorInstancesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.MonitorInstancesRequest request]
    (-> this (.monitorInstances request))))

(defn get-console-output
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.GetConsoleOutputRequest`

  returns: Result of the GetConsoleOutput operation returned by the service. - `com.amazonaws.services.ec2.model.GetConsoleOutputResult`"
  (^com.amazonaws.services.ec2.model.GetConsoleOutputResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.GetConsoleOutputRequest request]
    (-> this (.getConsoleOutput request))))

(defn bundle-instance
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for BundleInstance. - `com.amazonaws.services.ec2.model.BundleInstanceRequest`

  returns: Result of the BundleInstance operation returned by the service. - `com.amazonaws.services.ec2.model.BundleInstanceResult`"
  (^com.amazonaws.services.ec2.model.BundleInstanceResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.BundleInstanceRequest request]
    (-> this (.bundleInstance request))))

(defn create-transit-gateway-route
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateTransitGatewayRouteRequest`

  returns: Result of the CreateTransitGatewayRoute operation returned by the service. - `com.amazonaws.services.ec2.model.CreateTransitGatewayRouteResult`"
  (^com.amazonaws.services.ec2.model.CreateTransitGatewayRouteResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateTransitGatewayRouteRequest request]
    (-> this (.createTransitGatewayRoute request))))

(defn disable-transit-gateway-route-table-propagation
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DisableTransitGatewayRouteTablePropagationRequest`

  returns: Result of the DisableTransitGatewayRouteTablePropagation operation returned by the service. - `com.amazonaws.services.ec2.model.DisableTransitGatewayRouteTablePropagationResult`"
  (^com.amazonaws.services.ec2.model.DisableTransitGatewayRouteTablePropagationResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DisableTransitGatewayRouteTablePropagationRequest request]
    (-> this (.disableTransitGatewayRouteTablePropagation request))))

(defn provision-byoip-cidr
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ProvisionByoipCidrRequest`

  returns: Result of the ProvisionByoipCidr operation returned by the service. - `com.amazonaws.services.ec2.model.ProvisionByoipCidrResult`"
  (^com.amazonaws.services.ec2.model.ProvisionByoipCidrResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ProvisionByoipCidrRequest request]
    (-> this (.provisionByoipCidr request))))

(defn associate-transit-gateway-route-table
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AssociateTransitGatewayRouteTableRequest`

  returns: Result of the AssociateTransitGatewayRouteTable operation returned by the service. - `com.amazonaws.services.ec2.model.AssociateTransitGatewayRouteTableResult`"
  (^com.amazonaws.services.ec2.model.AssociateTransitGatewayRouteTableResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AssociateTransitGatewayRouteTableRequest request]
    (-> this (.associateTransitGatewayRouteTable request))))

(defn accept-vpc-peering-connection
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionRequest`

  returns: Result of the AcceptVpcPeeringConnection operation returned by the service. - `com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionResult`"
  (^com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionRequest request]
    (-> this (.acceptVpcPeeringConnection request)))
  (^com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionResult [^AbstractAmazonEC2 this]
    (-> this (.acceptVpcPeeringConnection))))

(defn create-key-pair
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateKeyPairRequest`

  returns: Result of the CreateKeyPair operation returned by the service. - `com.amazonaws.services.ec2.model.CreateKeyPairResult`"
  (^com.amazonaws.services.ec2.model.CreateKeyPairResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateKeyPairRequest request]
    (-> this (.createKeyPair request))))

(defn create-default-subnet
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateDefaultSubnetRequest`

  returns: Result of the CreateDefaultSubnet operation returned by the service. - `com.amazonaws.services.ec2.model.CreateDefaultSubnetResult`"
  (^com.amazonaws.services.ec2.model.CreateDefaultSubnetResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateDefaultSubnetRequest request]
    (-> this (.createDefaultSubnet request))))

(defn modify-identity-id-format
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyIdentityIdFormatRequest`

  returns: Result of the ModifyIdentityIdFormat operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyIdentityIdFormatResult`"
  (^com.amazonaws.services.ec2.model.ModifyIdentityIdFormatResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyIdentityIdFormatRequest request]
    (-> this (.modifyIdentityIdFormat request))))

(defn create-traffic-mirror-session
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateTrafficMirrorSessionRequest`

  returns: Result of the CreateTrafficMirrorSession operation returned by the service. - `com.amazonaws.services.ec2.model.CreateTrafficMirrorSessionResult`"
  (^com.amazonaws.services.ec2.model.CreateTrafficMirrorSessionResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorSessionRequest request]
    (-> this (.createTrafficMirrorSession request))))

(defn create-tags
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateTagsRequest`

  returns: Result of the CreateTags operation returned by the service. - `com.amazonaws.services.ec2.model.CreateTagsResult`"
  (^com.amazonaws.services.ec2.model.CreateTagsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateTagsRequest request]
    (-> this (.createTags request))))

(defn reset-image-attribute
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for ResetImageAttribute. - `com.amazonaws.services.ec2.model.ResetImageAttributeRequest`

  returns: Result of the ResetImageAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ResetImageAttributeResult`"
  (^com.amazonaws.services.ec2.model.ResetImageAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ResetImageAttributeRequest request]
    (-> this (.resetImageAttribute request))))

(defn describe-vpcs
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeVpcsRequest`

  returns: Result of the DescribeVpcs operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcsResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeVpcsRequest request]
    (-> this (.describeVpcs request)))
  (^com.amazonaws.services.ec2.model.DescribeVpcsResult [^AbstractAmazonEC2 this]
    (-> this (.describeVpcs))))

(defn cancel-spot-instance-requests
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for CancelSpotInstanceRequests. - `com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsRequest`

  returns: Result of the CancelSpotInstanceRequests operation returned by the service. - `com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsResult`"
  (^com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsRequest request]
    (-> this (.cancelSpotInstanceRequests request))))

(defn associate-dhcp-options
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AssociateDhcpOptionsRequest`

  returns: Result of the AssociateDhcpOptions operation returned by the service. - `com.amazonaws.services.ec2.model.AssociateDhcpOptionsResult`"
  (^com.amazonaws.services.ec2.model.AssociateDhcpOptionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AssociateDhcpOptionsRequest request]
    (-> this (.associateDhcpOptions request))))

(defn describe-principal-id-format
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribePrincipalIdFormatRequest`

  returns: Result of the DescribePrincipalIdFormat operation returned by the service. - `com.amazonaws.services.ec2.model.DescribePrincipalIdFormatResult`"
  (^com.amazonaws.services.ec2.model.DescribePrincipalIdFormatResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribePrincipalIdFormatRequest request]
    (-> this (.describePrincipalIdFormat request))))

(defn dry-run
  "Description copied from interface: AmazonEC2

  request - The request object for any Amazon EC2 operation supported with dry-run. - `com.amazonaws.services.ec2.model.DryRunSupportedRequest`

  returns: A DryRunResult object that contains the information of whether the dry-run was successful. - `<X extends com.amazonaws.AmazonWebServiceRequest> com.amazonaws.services.ec2.model.DryRunResult<X>`

  throws: com.amazonaws.AmazonServiceException - If an error response is returned by Amazon EC2 indicating either a problem with the data in the request, or a server side issue."
  ([^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DryRunSupportedRequest request]
    (-> this (.dryRun request))))

(defn replace-iam-instance-profile-association
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationRequest`

  returns: Result of the ReplaceIamInstanceProfileAssociation operation returned by the service. - `com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationResult`"
  (^com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationRequest request]
    (-> this (.replaceIamInstanceProfileAssociation request))))

(defn describe-placement-groups
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribePlacementGroupsRequest`

  returns: Result of the DescribePlacementGroups operation returned by the service. - `com.amazonaws.services.ec2.model.DescribePlacementGroupsResult`"
  (^com.amazonaws.services.ec2.model.DescribePlacementGroupsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribePlacementGroupsRequest request]
    (-> this (.describePlacementGroups request)))
  (^com.amazonaws.services.ec2.model.DescribePlacementGroupsResult [^AbstractAmazonEC2 this]
    (-> this (.describePlacementGroups))))

(defn associate-route-table
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AssociateRouteTableRequest`

  returns: Result of the AssociateRouteTable operation returned by the service. - `com.amazonaws.services.ec2.model.AssociateRouteTableResult`"
  (^com.amazonaws.services.ec2.model.AssociateRouteTableResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AssociateRouteTableRequest request]
    (-> this (.associateRouteTable request))))

(defn reject-transit-gateway-vpc-attachment
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.RejectTransitGatewayVpcAttachmentRequest`

  returns: Result of the RejectTransitGatewayVpcAttachment operation returned by the service. - `com.amazonaws.services.ec2.model.RejectTransitGatewayVpcAttachmentResult`"
  (^com.amazonaws.services.ec2.model.RejectTransitGatewayVpcAttachmentResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.RejectTransitGatewayVpcAttachmentRequest request]
    (-> this (.rejectTransitGatewayVpcAttachment request))))

(defn describe-account-attributes
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeAccountAttributesRequest`

  returns: Result of the DescribeAccountAttributes operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeAccountAttributesResult`"
  (^com.amazonaws.services.ec2.model.DescribeAccountAttributesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeAccountAttributesRequest request]
    (-> this (.describeAccountAttributes request)))
  (^com.amazonaws.services.ec2.model.DescribeAccountAttributesResult [^AbstractAmazonEC2 this]
    (-> this (.describeAccountAttributes))))

(defn shutdown
  "Description copied from interface: AmazonEC2"
  ([^AbstractAmazonEC2 this]
    (-> this (.shutdown))))

(defn reset-instance-attribute
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ResetInstanceAttributeRequest`

  returns: Result of the ResetInstanceAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ResetInstanceAttributeResult`"
  (^com.amazonaws.services.ec2.model.ResetInstanceAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ResetInstanceAttributeRequest request]
    (-> this (.resetInstanceAttribute request))))

(defn disassociate-address
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DisassociateAddressRequest`

  returns: Result of the DisassociateAddress operation returned by the service. - `com.amazonaws.services.ec2.model.DisassociateAddressResult`"
  (^com.amazonaws.services.ec2.model.DisassociateAddressResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DisassociateAddressRequest request]
    (-> this (.disassociateAddress request))))

(defn disassociate-subnet-cidr-block
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockRequest`

  returns: Result of the DisassociateSubnetCidrBlock operation returned by the service. - `com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockResult`"
  (^com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockRequest request]
    (-> this (.disassociateSubnetCidrBlock request))))

(defn delete-snapshot
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DeleteSnapshot. - `com.amazonaws.services.ec2.model.DeleteSnapshotRequest`

  returns: Result of the DeleteSnapshot operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteSnapshotResult`"
  (^com.amazonaws.services.ec2.model.DeleteSnapshotResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteSnapshotRequest request]
    (-> this (.deleteSnapshot request))))

(defn get-reserved-instances-exchange-quote
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for GetReservedInstanceExchangeQuote. - `com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteRequest`

  returns: Result of the GetReservedInstancesExchangeQuote operation returned by the service. - `com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteResult`"
  (^com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteRequest request]
    (-> this (.getReservedInstancesExchangeQuote request))))

(defn create-placement-group
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreatePlacementGroupRequest`

  returns: Result of the CreatePlacementGroup operation returned by the service. - `com.amazonaws.services.ec2.model.CreatePlacementGroupResult`"
  (^com.amazonaws.services.ec2.model.CreatePlacementGroupResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreatePlacementGroupRequest request]
    (-> this (.createPlacementGroup request))))

(defn terminate-client-vpn-connections
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.TerminateClientVpnConnectionsRequest`

  returns: Result of the TerminateClientVpnConnections operation returned by the service. - `com.amazonaws.services.ec2.model.TerminateClientVpnConnectionsResult`"
  (^com.amazonaws.services.ec2.model.TerminateClientVpnConnectionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.TerminateClientVpnConnectionsRequest request]
    (-> this (.terminateClientVpnConnections request))))

(defn modify-vpc-endpoint-connection-notification
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationRequest`

  returns: Result of the ModifyVpcEndpointConnectionNotification operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationResult`"
  (^com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationRequest request]
    (-> this (.modifyVpcEndpointConnectionNotification request))))

(defn import-image
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ImportImageRequest`

  returns: Result of the ImportImage operation returned by the service. - `com.amazonaws.services.ec2.model.ImportImageResult`"
  (^com.amazonaws.services.ec2.model.ImportImageResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ImportImageRequest request]
    (-> this (.importImage request)))
  (^com.amazonaws.services.ec2.model.ImportImageResult [^AbstractAmazonEC2 this]
    (-> this (.importImage))))

(defn describe-scheduled-instance-availability
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeScheduledInstanceAvailability. - `com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityRequest`

  returns: Result of the DescribeScheduledInstanceAvailability operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityResult`"
  (^com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityRequest request]
    (-> this (.describeScheduledInstanceAvailability request))))

(defn get-launch-template-data
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.GetLaunchTemplateDataRequest`

  returns: Result of the GetLaunchTemplateData operation returned by the service. - `com.amazonaws.services.ec2.model.GetLaunchTemplateDataResult`"
  (^com.amazonaws.services.ec2.model.GetLaunchTemplateDataResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.GetLaunchTemplateDataRequest request]
    (-> this (.getLaunchTemplateData request))))

(defn describe-transit-gateway-vpc-attachments
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeTransitGatewayVpcAttachmentsRequest`

  returns: Result of the DescribeTransitGatewayVpcAttachments operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeTransitGatewayVpcAttachmentsResult`"
  (^com.amazonaws.services.ec2.model.DescribeTransitGatewayVpcAttachmentsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeTransitGatewayVpcAttachmentsRequest request]
    (-> this (.describeTransitGatewayVpcAttachments request))))

(defn create-launch-template-version
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionRequest`

  returns: Result of the CreateLaunchTemplateVersion operation returned by the service. - `com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionResult`"
  (^com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionRequest request]
    (-> this (.createLaunchTemplateVersion request))))

(defn describe-fpga-image-attribute
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeRequest`

  returns: Result of the DescribeFpgaImageAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeResult`"
  (^com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeRequest request]
    (-> this (.describeFpgaImageAttribute request))))

(defn modify-traffic-mirror-session
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyTrafficMirrorSessionRequest`

  returns: Result of the ModifyTrafficMirrorSession operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyTrafficMirrorSessionResult`"
  (^com.amazonaws.services.ec2.model.ModifyTrafficMirrorSessionResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyTrafficMirrorSessionRequest request]
    (-> this (.modifyTrafficMirrorSession request))))

(defn create-default-vpc
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateDefaultVpcRequest`

  returns: Result of the CreateDefaultVpc operation returned by the service. - `com.amazonaws.services.ec2.model.CreateDefaultVpcResult`"
  (^com.amazonaws.services.ec2.model.CreateDefaultVpcResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateDefaultVpcRequest request]
    (-> this (.createDefaultVpc request))))

(defn delete-transit-gateway
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteTransitGatewayRequest`

  returns: Result of the DeleteTransitGateway operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteTransitGatewayResult`"
  (^com.amazonaws.services.ec2.model.DeleteTransitGatewayResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayRequest request]
    (-> this (.deleteTransitGateway request))))

(defn allocate-address
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AllocateAddressRequest`

  returns: Result of the AllocateAddress operation returned by the service. - `com.amazonaws.services.ec2.model.AllocateAddressResult`"
  (^com.amazonaws.services.ec2.model.AllocateAddressResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AllocateAddressRequest request]
    (-> this (.allocateAddress request)))
  (^com.amazonaws.services.ec2.model.AllocateAddressResult [^AbstractAmazonEC2 this]
    (-> this (.allocateAddress))))

(defn detach-volume
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DetachVolume. - `com.amazonaws.services.ec2.model.DetachVolumeRequest`

  returns: Result of the DetachVolume operation returned by the service. - `com.amazonaws.services.ec2.model.DetachVolumeResult`"
  (^com.amazonaws.services.ec2.model.DetachVolumeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DetachVolumeRequest request]
    (-> this (.detachVolume request))))

(defn delete-transit-gateway-vpc-attachment
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteTransitGatewayVpcAttachmentRequest`

  returns: Result of the DeleteTransitGatewayVpcAttachment operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteTransitGatewayVpcAttachmentResult`"
  (^com.amazonaws.services.ec2.model.DeleteTransitGatewayVpcAttachmentResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayVpcAttachmentRequest request]
    (-> this (.deleteTransitGatewayVpcAttachment request))))

(defn describe-fleets
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeFleetsRequest`

  returns: Result of the DescribeFleets operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeFleetsResult`"
  (^com.amazonaws.services.ec2.model.DescribeFleetsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeFleetsRequest request]
    (-> this (.describeFleets request))))

(defn start-instances
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.StartInstancesRequest`

  returns: Result of the StartInstances operation returned by the service. - `com.amazonaws.services.ec2.model.StartInstancesResult`"
  (^com.amazonaws.services.ec2.model.StartInstancesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.StartInstancesRequest request]
    (-> this (.startInstances request))))

(defn terminate-instances
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.TerminateInstancesRequest`

  returns: Result of the TerminateInstances operation returned by the service. - `com.amazonaws.services.ec2.model.TerminateInstancesResult`"
  (^com.amazonaws.services.ec2.model.TerminateInstancesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.TerminateInstancesRequest request]
    (-> this (.terminateInstances request))))

(defn unassign-private-ip-addresses
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for UnassignPrivateIpAddresses. - `com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesRequest`

  returns: Result of the UnassignPrivateIpAddresses operation returned by the service. - `com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesResult`"
  (^com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesRequest request]
    (-> this (.unassignPrivateIpAddresses request))))

(defn describe-reserved-instances-modifications
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeReservedInstancesModifications. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsRequest`

  returns: Result of the DescribeReservedInstancesModifications operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsResult`"
  (^com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsRequest request]
    (-> this (.describeReservedInstancesModifications request)))
  (^com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsResult [^AbstractAmazonEC2 this]
    (-> this (.describeReservedInstancesModifications))))

(defn modify-instance-credit-specification
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationRequest`

  returns: Result of the ModifyInstanceCreditSpecification operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationResult`"
  (^com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationRequest request]
    (-> this (.modifyInstanceCreditSpecification request))))

(defn describe-snapshots
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeSnapshotsRequest`

  returns: Result of the DescribeSnapshots operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSnapshotsResult`"
  (^com.amazonaws.services.ec2.model.DescribeSnapshotsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeSnapshotsRequest request]
    (-> this (.describeSnapshots request)))
  (^com.amazonaws.services.ec2.model.DescribeSnapshotsResult [^AbstractAmazonEC2 this]
    (-> this (.describeSnapshots))))

(defn move-address-to-vpc
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.MoveAddressToVpcRequest`

  returns: Result of the MoveAddressToVpc operation returned by the service. - `com.amazonaws.services.ec2.model.MoveAddressToVpcResult`"
  (^com.amazonaws.services.ec2.model.MoveAddressToVpcResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.MoveAddressToVpcRequest request]
    (-> this (.moveAddressToVpc request))))

(defn describe-instance-credit-specifications
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsRequest`

  returns: Result of the DescribeInstanceCreditSpecifications operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsResult`"
  (^com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsRequest request]
    (-> this (.describeInstanceCreditSpecifications request))))

(defn describe-vpc-attribute
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeVpcAttributeRequest`

  returns: Result of the DescribeVpcAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcAttributeResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeVpcAttributeRequest request]
    (-> this (.describeVpcAttribute request))))

(defn describe-bundle-tasks
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeBundleTasksRequest`

  returns: Result of the DescribeBundleTasks operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeBundleTasksResult`"
  (^com.amazonaws.services.ec2.model.DescribeBundleTasksResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeBundleTasksRequest request]
    (-> this (.describeBundleTasks request)))
  (^com.amazonaws.services.ec2.model.DescribeBundleTasksResult [^AbstractAmazonEC2 this]
    (-> this (.describeBundleTasks))))

(defn describe-vpc-classic-link-dns-support
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportRequest`

  returns: Result of the DescribeVpcClassicLinkDnsSupport operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportRequest request]
    (-> this (.describeVpcClassicLinkDnsSupport request))))

(defn describe-spot-price-history
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeSpotPriceHistory. - `com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryRequest`

  returns: Result of the DescribeSpotPriceHistory operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryResult`"
  (^com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryRequest request]
    (-> this (.describeSpotPriceHistory request)))
  (^com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryResult [^AbstractAmazonEC2 this]
    (-> this (.describeSpotPriceHistory))))

(defn set-endpoint
  "Description copied from interface: AmazonEC2

  endpoint - The endpoint (ex: \"ec2.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://ec2.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonEC2 this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn revoke-client-vpn-ingress
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.RevokeClientVpnIngressRequest`

  returns: Result of the RevokeClientVpnIngress operation returned by the service. - `com.amazonaws.services.ec2.model.RevokeClientVpnIngressResult`"
  (^com.amazonaws.services.ec2.model.RevokeClientVpnIngressResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.RevokeClientVpnIngressRequest request]
    (-> this (.revokeClientVpnIngress request))))

(defn modify-instance-attribute
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyInstanceAttributeRequest`

  returns: Result of the ModifyInstanceAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyInstanceAttributeResult`"
  (^com.amazonaws.services.ec2.model.ModifyInstanceAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyInstanceAttributeRequest request]
    (-> this (.modifyInstanceAttribute request))))

(defn create-spot-datafeed-subscription
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for CreateSpotDatafeedSubscription. - `com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionRequest`

  returns: Result of the CreateSpotDatafeedSubscription operation returned by the service. - `com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionResult`"
  (^com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionRequest request]
    (-> this (.createSpotDatafeedSubscription request))))

(defn get-transit-gateway-route-table-propagations
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.GetTransitGatewayRouteTablePropagationsRequest`

  returns: Result of the GetTransitGatewayRouteTablePropagations operation returned by the service. - `com.amazonaws.services.ec2.model.GetTransitGatewayRouteTablePropagationsResult`"
  (^com.amazonaws.services.ec2.model.GetTransitGatewayRouteTablePropagationsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.GetTransitGatewayRouteTablePropagationsRequest request]
    (-> this (.getTransitGatewayRouteTablePropagations request))))

(defn detach-classic-link-vpc
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DetachClassicLinkVpcRequest`

  returns: Result of the DetachClassicLinkVpc operation returned by the service. - `com.amazonaws.services.ec2.model.DetachClassicLinkVpcResult`"
  (^com.amazonaws.services.ec2.model.DetachClassicLinkVpcResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DetachClassicLinkVpcRequest request]
    (-> this (.detachClassicLinkVpc request))))

(defn unmonitor-instances
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.UnmonitorInstancesRequest`

  returns: Result of the UnmonitorInstances operation returned by the service. - `com.amazonaws.services.ec2.model.UnmonitorInstancesResult`"
  (^com.amazonaws.services.ec2.model.UnmonitorInstancesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.UnmonitorInstancesRequest request]
    (-> this (.unmonitorInstances request))))

(defn create-nat-gateway
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateNatGatewayRequest`

  returns: Result of the CreateNatGateway operation returned by the service. - `com.amazonaws.services.ec2.model.CreateNatGatewayResult`"
  (^com.amazonaws.services.ec2.model.CreateNatGatewayResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateNatGatewayRequest request]
    (-> this (.createNatGateway request))))

(defn describe-vpn-connections
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeVpnConnections. - `com.amazonaws.services.ec2.model.DescribeVpnConnectionsRequest`

  returns: Result of the DescribeVpnConnections operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpnConnectionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpnConnectionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeVpnConnectionsRequest request]
    (-> this (.describeVpnConnections request)))
  (^com.amazonaws.services.ec2.model.DescribeVpnConnectionsResult [^AbstractAmazonEC2 this]
    (-> this (.describeVpnConnections))))

(defn describe-client-vpn-routes
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeClientVpnRoutesRequest`

  returns: Result of the DescribeClientVpnRoutes operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeClientVpnRoutesResult`"
  (^com.amazonaws.services.ec2.model.DescribeClientVpnRoutesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeClientVpnRoutesRequest request]
    (-> this (.describeClientVpnRoutes request))))

(defn import-key-pair
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ImportKeyPairRequest`

  returns: Result of the ImportKeyPair operation returned by the service. - `com.amazonaws.services.ec2.model.ImportKeyPairResult`"
  (^com.amazonaws.services.ec2.model.ImportKeyPairResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ImportKeyPairRequest request]
    (-> this (.importKeyPair request))))

(defn accept-transit-gateway-vpc-attachment
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AcceptTransitGatewayVpcAttachmentRequest`

  returns: Result of the AcceptTransitGatewayVpcAttachment operation returned by the service. - `com.amazonaws.services.ec2.model.AcceptTransitGatewayVpcAttachmentResult`"
  (^com.amazonaws.services.ec2.model.AcceptTransitGatewayVpcAttachmentResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AcceptTransitGatewayVpcAttachmentRequest request]
    (-> this (.acceptTransitGatewayVpcAttachment request))))

(defn cancel-export-task
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CancelExportTaskRequest`

  returns: Result of the CancelExportTask operation returned by the service. - `com.amazonaws.services.ec2.model.CancelExportTaskResult`"
  (^com.amazonaws.services.ec2.model.CancelExportTaskResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CancelExportTaskRequest request]
    (-> this (.cancelExportTask request))))

(defn release-hosts
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ReleaseHostsRequest`

  returns: Result of the ReleaseHosts operation returned by the service. - `com.amazonaws.services.ec2.model.ReleaseHostsResult`"
  (^com.amazonaws.services.ec2.model.ReleaseHostsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ReleaseHostsRequest request]
    (-> this (.releaseHosts request))))

(defn modify-launch-template
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyLaunchTemplateRequest`

  returns: Result of the ModifyLaunchTemplate operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyLaunchTemplateResult`"
  (^com.amazonaws.services.ec2.model.ModifyLaunchTemplateResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyLaunchTemplateRequest request]
    (-> this (.modifyLaunchTemplate request))))

(defn describe-security-group-references
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesRequest`

  returns: Result of the DescribeSecurityGroupReferences operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesResult`"
  (^com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesRequest request]
    (-> this (.describeSecurityGroupReferences request))))

(defn delete-internet-gateway
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteInternetGatewayRequest`

  returns: Result of the DeleteInternetGateway operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteInternetGatewayResult`"
  (^com.amazonaws.services.ec2.model.DeleteInternetGatewayResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteInternetGatewayRequest request]
    (-> this (.deleteInternetGateway request))))

(defn delete-launch-template
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteLaunchTemplateRequest`

  returns: Result of the DeleteLaunchTemplate operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteLaunchTemplateResult`"
  (^com.amazonaws.services.ec2.model.DeleteLaunchTemplateResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteLaunchTemplateRequest request]
    (-> this (.deleteLaunchTemplate request))))

(defn delete-nat-gateway
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteNatGatewayRequest`

  returns: Result of the DeleteNatGateway operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteNatGatewayResult`"
  (^com.amazonaws.services.ec2.model.DeleteNatGatewayResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteNatGatewayRequest request]
    (-> this (.deleteNatGateway request))))

(defn reset-network-interface-attribute
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for ResetNetworkInterfaceAttribute. - `com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeRequest`

  returns: Result of the ResetNetworkInterfaceAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeResult`"
  (^com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeRequest request]
    (-> this (.resetNetworkInterfaceAttribute request))))

(defn deprovision-byoip-cidr
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeprovisionByoipCidrRequest`

  returns: Result of the DeprovisionByoipCidr operation returned by the service. - `com.amazonaws.services.ec2.model.DeprovisionByoipCidrResult`"
  (^com.amazonaws.services.ec2.model.DeprovisionByoipCidrResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeprovisionByoipCidrRequest request]
    (-> this (.deprovisionByoipCidr request))))

(defn delete-vpn-gateway
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DeleteVpnGateway. - `com.amazonaws.services.ec2.model.DeleteVpnGatewayRequest`

  returns: Result of the DeleteVpnGateway operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteVpnGatewayResult`"
  (^com.amazonaws.services.ec2.model.DeleteVpnGatewayResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteVpnGatewayRequest request]
    (-> this (.deleteVpnGateway request))))

(defn describe-transit-gateway-route-tables
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeTransitGatewayRouteTablesRequest`

  returns: Result of the DescribeTransitGatewayRouteTables operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeTransitGatewayRouteTablesResult`"
  (^com.amazonaws.services.ec2.model.DescribeTransitGatewayRouteTablesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeTransitGatewayRouteTablesRequest request]
    (-> this (.describeTransitGatewayRouteTables request))))

(defn describe-hosts
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeHostsRequest`

  returns: Result of the DescribeHosts operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeHostsResult`"
  (^com.amazonaws.services.ec2.model.DescribeHostsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeHostsRequest request]
    (-> this (.describeHosts request)))
  (^com.amazonaws.services.ec2.model.DescribeHostsResult [^AbstractAmazonEC2 this]
    (-> this (.describeHosts))))

(defn describe-conversion-tasks
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeConversionTasksRequest`

  returns: Result of the DescribeConversionTasks operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeConversionTasksResult`"
  (^com.amazonaws.services.ec2.model.DescribeConversionTasksResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeConversionTasksRequest request]
    (-> this (.describeConversionTasks request)))
  (^com.amazonaws.services.ec2.model.DescribeConversionTasksResult [^AbstractAmazonEC2 this]
    (-> this (.describeConversionTasks))))

(defn describe-image-attribute
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeImageAttribute. - `com.amazonaws.services.ec2.model.DescribeImageAttributeRequest`

  returns: Result of the DescribeImageAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeImageAttributeResult`"
  (^com.amazonaws.services.ec2.model.DescribeImageAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeImageAttributeRequest request]
    (-> this (.describeImageAttribute request))))

(defn create-dhcp-options
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateDhcpOptionsRequest`

  returns: Result of the CreateDhcpOptions operation returned by the service. - `com.amazonaws.services.ec2.model.CreateDhcpOptionsResult`"
  (^com.amazonaws.services.ec2.model.CreateDhcpOptionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateDhcpOptionsRequest request]
    (-> this (.createDhcpOptions request))))

(defn delete-transit-gateway-route-table
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteTableRequest`

  returns: Result of the DeleteTransitGatewayRouteTable operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteTableResult`"
  (^com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteTableResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteTableRequest request]
    (-> this (.deleteTransitGatewayRouteTable request))))

(defn purchase-scheduled-instances
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for PurchaseScheduledInstances. - `com.amazonaws.services.ec2.model.PurchaseScheduledInstancesRequest`

  returns: Result of the PurchaseScheduledInstances operation returned by the service. - `com.amazonaws.services.ec2.model.PurchaseScheduledInstancesResult`"
  (^com.amazonaws.services.ec2.model.PurchaseScheduledInstancesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.PurchaseScheduledInstancesRequest request]
    (-> this (.purchaseScheduledInstances request))))

(defn replace-network-acl-entry
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryRequest`

  returns: Result of the ReplaceNetworkAclEntry operation returned by the service. - `com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryResult`"
  (^com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryRequest request]
    (-> this (.replaceNetworkAclEntry request))))

(defn modify-id-format
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyIdFormatRequest`

  returns: Result of the ModifyIdFormat operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyIdFormatResult`"
  (^com.amazonaws.services.ec2.model.ModifyIdFormatResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyIdFormatRequest request]
    (-> this (.modifyIdFormat request))))

(defn get-capacity-reservation-usage
  "request - `com.amazonaws.services.ec2.model.GetCapacityReservationUsageRequest`

  returns: Result of the GetCapacityReservationUsage operation returned by the service. - `com.amazonaws.services.ec2.model.GetCapacityReservationUsageResult`"
  (^com.amazonaws.services.ec2.model.GetCapacityReservationUsageResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.GetCapacityReservationUsageRequest request]
    (-> this (.getCapacityReservationUsage request))))

(defn cancel-import-task
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CancelImportTaskRequest`

  returns: Result of the CancelImportTask operation returned by the service. - `com.amazonaws.services.ec2.model.CancelImportTaskResult`"
  (^com.amazonaws.services.ec2.model.CancelImportTaskResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CancelImportTaskRequest request]
    (-> this (.cancelImportTask request)))
  (^com.amazonaws.services.ec2.model.CancelImportTaskResult [^AbstractAmazonEC2 this]
    (-> this (.cancelImportTask))))

(defn describe-client-vpn-target-networks
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeClientVpnTargetNetworksRequest`

  returns: Result of the DescribeClientVpnTargetNetworks operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeClientVpnTargetNetworksResult`"
  (^com.amazonaws.services.ec2.model.DescribeClientVpnTargetNetworksResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeClientVpnTargetNetworksRequest request]
    (-> this (.describeClientVpnTargetNetworks request))))

(defn attach-vpn-gateway
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for AttachVpnGateway. - `com.amazonaws.services.ec2.model.AttachVpnGatewayRequest`

  returns: Result of the AttachVpnGateway operation returned by the service. - `com.amazonaws.services.ec2.model.AttachVpnGatewayResult`"
  (^com.amazonaws.services.ec2.model.AttachVpnGatewayResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AttachVpnGatewayRequest request]
    (-> this (.attachVpnGateway request))))

(defn create-traffic-mirror-target
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateTrafficMirrorTargetRequest`

  returns: Result of the CreateTrafficMirrorTarget operation returned by the service. - `com.amazonaws.services.ec2.model.CreateTrafficMirrorTargetResult`"
  (^com.amazonaws.services.ec2.model.CreateTrafficMirrorTargetResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorTargetRequest request]
    (-> this (.createTrafficMirrorTarget request))))

(defn describe-instances
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeInstancesRequest`

  returns: Result of the DescribeInstances operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeInstancesResult`"
  (^com.amazonaws.services.ec2.model.DescribeInstancesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeInstancesRequest request]
    (-> this (.describeInstances request)))
  (^com.amazonaws.services.ec2.model.DescribeInstancesResult [^AbstractAmazonEC2 this]
    (-> this (.describeInstances))))

(defn export-transit-gateway-routes
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ExportTransitGatewayRoutesRequest`

  returns: Result of the ExportTransitGatewayRoutes operation returned by the service. - `com.amazonaws.services.ec2.model.ExportTransitGatewayRoutesResult`"
  (^com.amazonaws.services.ec2.model.ExportTransitGatewayRoutesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ExportTransitGatewayRoutesRequest request]
    (-> this (.exportTransitGatewayRoutes request))))

(defn enable-volume-io
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for EnableVolumeIO. - `com.amazonaws.services.ec2.model.EnableVolumeIORequest`

  returns: Result of the EnableVolumeIO operation returned by the service. - `com.amazonaws.services.ec2.model.EnableVolumeIOResult`"
  (^com.amazonaws.services.ec2.model.EnableVolumeIOResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.EnableVolumeIORequest request]
    (-> this (.enableVolumeIO request))))

(defn get-host-reservation-purchase-preview
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewRequest`

  returns: Result of the GetHostReservationPurchasePreview operation returned by the service. - `com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewResult`"
  (^com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewRequest request]
    (-> this (.getHostReservationPurchasePreview request))))

(defn create-customer-gateway
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for CreateCustomerGateway. - `com.amazonaws.services.ec2.model.CreateCustomerGatewayRequest`

  returns: Result of the CreateCustomerGateway operation returned by the service. - `com.amazonaws.services.ec2.model.CreateCustomerGatewayResult`"
  (^com.amazonaws.services.ec2.model.CreateCustomerGatewayResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateCustomerGatewayRequest request]
    (-> this (.createCustomerGateway request))))

(defn modify-instance-event-start-time
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyInstanceEventStartTimeRequest`

  returns: Result of the ModifyInstanceEventStartTime operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyInstanceEventStartTimeResult`"
  (^com.amazonaws.services.ec2.model.ModifyInstanceEventStartTimeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyInstanceEventStartTimeRequest request]
    (-> this (.modifyInstanceEventStartTime request))))

(defn modify-vpc-attribute
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyVpcAttributeRequest`

  returns: Result of the ModifyVpcAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVpcAttributeResult`"
  (^com.amazonaws.services.ec2.model.ModifyVpcAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyVpcAttributeRequest request]
    (-> this (.modifyVpcAttribute request))))

(defn delete-client-vpn-endpoint
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteClientVpnEndpointRequest`

  returns: Result of the DeleteClientVpnEndpoint operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteClientVpnEndpointResult`"
  (^com.amazonaws.services.ec2.model.DeleteClientVpnEndpointResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteClientVpnEndpointRequest request]
    (-> this (.deleteClientVpnEndpoint request))))

(defn revoke-security-group-ingress
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressRequest`

  returns: Result of the RevokeSecurityGroupIngress operation returned by the service. - `com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressResult`"
  (^com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressRequest request]
    (-> this (.revokeSecurityGroupIngress request)))
  (^com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressResult [^AbstractAmazonEC2 this]
    (-> this (.revokeSecurityGroupIngress))))

(defn describe-flow-logs
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeFlowLogsRequest`

  returns: Result of the DescribeFlowLogs operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeFlowLogsResult`"
  (^com.amazonaws.services.ec2.model.DescribeFlowLogsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeFlowLogsRequest request]
    (-> this (.describeFlowLogs request)))
  (^com.amazonaws.services.ec2.model.DescribeFlowLogsResult [^AbstractAmazonEC2 this]
    (-> this (.describeFlowLogs))))

(defn describe-export-tasks
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeExportTasksRequest`

  returns: Result of the DescribeExportTasks operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeExportTasksResult`"
  (^com.amazonaws.services.ec2.model.DescribeExportTasksResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeExportTasksRequest request]
    (-> this (.describeExportTasks request)))
  (^com.amazonaws.services.ec2.model.DescribeExportTasksResult [^AbstractAmazonEC2 this]
    (-> this (.describeExportTasks))))

(defn attach-internet-gateway
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AttachInternetGatewayRequest`

  returns: Result of the AttachInternetGateway operation returned by the service. - `com.amazonaws.services.ec2.model.AttachInternetGatewayResult`"
  (^com.amazonaws.services.ec2.model.AttachInternetGatewayResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AttachInternetGatewayRequest request]
    (-> this (.attachInternetGateway request))))

(defn confirm-product-instance
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ConfirmProductInstanceRequest`

  returns: Result of the ConfirmProductInstance operation returned by the service. - `com.amazonaws.services.ec2.model.ConfirmProductInstanceResult`"
  (^com.amazonaws.services.ec2.model.ConfirmProductInstanceResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ConfirmProductInstanceRequest request]
    (-> this (.confirmProductInstance request))))

(defn create-egress-only-internet-gateway
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayRequest`

  returns: Result of the CreateEgressOnlyInternetGateway operation returned by the service. - `com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayResult`"
  (^com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayRequest request]
    (-> this (.createEgressOnlyInternetGateway request))))

(defn describe-public-ipv-4-pools
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribePublicIpv4PoolsRequest`

  returns: Result of the DescribePublicIpv4Pools operation returned by the service. - `com.amazonaws.services.ec2.model.DescribePublicIpv4PoolsResult`"
  (^com.amazonaws.services.ec2.model.DescribePublicIpv4PoolsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribePublicIpv4PoolsRequest request]
    (-> this (.describePublicIpv4Pools request))))

(defn authorize-client-vpn-ingress
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AuthorizeClientVpnIngressRequest`

  returns: Result of the AuthorizeClientVpnIngress operation returned by the service. - `com.amazonaws.services.ec2.model.AuthorizeClientVpnIngressResult`"
  (^com.amazonaws.services.ec2.model.AuthorizeClientVpnIngressResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AuthorizeClientVpnIngressRequest request]
    (-> this (.authorizeClientVpnIngress request))))

(defn cancel-capacity-reservation
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CancelCapacityReservationRequest`

  returns: Result of the CancelCapacityReservation operation returned by the service. - `com.amazonaws.services.ec2.model.CancelCapacityReservationResult`"
  (^com.amazonaws.services.ec2.model.CancelCapacityReservationResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CancelCapacityReservationRequest request]
    (-> this (.cancelCapacityReservation request))))

(defn replace-network-acl-association
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationRequest`

  returns: Result of the ReplaceNetworkAclAssociation operation returned by the service. - `com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationResult`"
  (^com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationRequest request]
    (-> this (.replaceNetworkAclAssociation request))))

(defn describe-regions
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeRegionsRequest`

  returns: Result of the DescribeRegions operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeRegionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeRegionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeRegionsRequest request]
    (-> this (.describeRegions request)))
  (^com.amazonaws.services.ec2.model.DescribeRegionsResult [^AbstractAmazonEC2 this]
    (-> this (.describeRegions))))

(defn delete-flow-logs
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteFlowLogsRequest`

  returns: Result of the DeleteFlowLogs operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteFlowLogsResult`"
  (^com.amazonaws.services.ec2.model.DeleteFlowLogsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteFlowLogsRequest request]
    (-> this (.deleteFlowLogs request))))

(defn advertise-byoip-cidr
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AdvertiseByoipCidrRequest`

  returns: Result of the AdvertiseByoipCidr operation returned by the service. - `com.amazonaws.services.ec2.model.AdvertiseByoipCidrResult`"
  (^com.amazonaws.services.ec2.model.AdvertiseByoipCidrResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AdvertiseByoipCidrRequest request]
    (-> this (.advertiseByoipCidr request))))

(defn create-image
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateImageRequest`

  returns: Result of the CreateImage operation returned by the service. - `com.amazonaws.services.ec2.model.CreateImageResult`"
  (^com.amazonaws.services.ec2.model.CreateImageResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateImageRequest request]
    (-> this (.createImage request))))

(defn delete-traffic-mirror-target
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorTargetRequest`

  returns: Result of the DeleteTrafficMirrorTarget operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorTargetResult`"
  (^com.amazonaws.services.ec2.model.DeleteTrafficMirrorTargetResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorTargetRequest request]
    (-> this (.deleteTrafficMirrorTarget request))))

(defn authorize-security-group-egress
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressRequest`

  returns: Result of the AuthorizeSecurityGroupEgress operation returned by the service. - `com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressResult`"
  (^com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressRequest request]
    (-> this (.authorizeSecurityGroupEgress request))))

(defn describe-dhcp-options
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeDhcpOptionsRequest`

  returns: Result of the DescribeDhcpOptions operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeDhcpOptionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeDhcpOptionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeDhcpOptionsRequest request]
    (-> this (.describeDhcpOptions request)))
  (^com.amazonaws.services.ec2.model.DescribeDhcpOptionsResult [^AbstractAmazonEC2 this]
    (-> this (.describeDhcpOptions))))

(defn describe-network-interface-attribute
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeNetworkInterfaceAttribute. - `com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeRequest`

  returns: Result of the DescribeNetworkInterfaceAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeResult`"
  (^com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeRequest request]
    (-> this (.describeNetworkInterfaceAttribute request))))

(defn modify-vpc-peering-connection-options
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsRequest`

  returns: Result of the ModifyVpcPeeringConnectionOptions operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsResult`"
  (^com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsRequest request]
    (-> this (.modifyVpcPeeringConnectionOptions request))))

(defn modify-volume-attribute
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for ModifyVolumeAttribute. - `com.amazonaws.services.ec2.model.ModifyVolumeAttributeRequest`

  returns: Result of the ModifyVolumeAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVolumeAttributeResult`"
  (^com.amazonaws.services.ec2.model.ModifyVolumeAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyVolumeAttributeRequest request]
    (-> this (.modifyVolumeAttribute request))))

(defn attach-network-interface
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for AttachNetworkInterface. - `com.amazonaws.services.ec2.model.AttachNetworkInterfaceRequest`

  returns: Result of the AttachNetworkInterface operation returned by the service. - `com.amazonaws.services.ec2.model.AttachNetworkInterfaceResult`"
  (^com.amazonaws.services.ec2.model.AttachNetworkInterfaceResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AttachNetworkInterfaceRequest request]
    (-> this (.attachNetworkInterface request))))

(defn request-spot-instances
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for RequestSpotInstances. - `com.amazonaws.services.ec2.model.RequestSpotInstancesRequest`

  returns: Result of the RequestSpotInstances operation returned by the service. - `com.amazonaws.services.ec2.model.RequestSpotInstancesResult`"
  (^com.amazonaws.services.ec2.model.RequestSpotInstancesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.RequestSpotInstancesRequest request]
    (-> this (.requestSpotInstances request))))

(defn disable-ebs-encryption-by-default
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DisableEbsEncryptionByDefaultRequest`

  returns: Result of the DisableEbsEncryptionByDefault operation returned by the service. - `com.amazonaws.services.ec2.model.DisableEbsEncryptionByDefaultResult`"
  (^com.amazonaws.services.ec2.model.DisableEbsEncryptionByDefaultResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DisableEbsEncryptionByDefaultRequest request]
    (-> this (.disableEbsEncryptionByDefault request))))

(defn restore-address-to-classic
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.RestoreAddressToClassicRequest`

  returns: Result of the RestoreAddressToClassic operation returned by the service. - `com.amazonaws.services.ec2.model.RestoreAddressToClassicResult`"
  (^com.amazonaws.services.ec2.model.RestoreAddressToClassicResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.RestoreAddressToClassicRequest request]
    (-> this (.restoreAddressToClassic request))))

(defn describe-reserved-instances
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeReservedInstances. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesRequest`

  returns: Result of the DescribeReservedInstances operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesResult`"
  (^com.amazonaws.services.ec2.model.DescribeReservedInstancesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesRequest request]
    (-> this (.describeReservedInstances request)))
  (^com.amazonaws.services.ec2.model.DescribeReservedInstancesResult [^AbstractAmazonEC2 this]
    (-> this (.describeReservedInstances))))

(defn describe-stale-security-groups
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsRequest`

  returns: Result of the DescribeStaleSecurityGroups operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsResult`"
  (^com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsRequest request]
    (-> this (.describeStaleSecurityGroups request))))

(defn describe-host-reservations
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeHostReservationsRequest`

  returns: Result of the DescribeHostReservations operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeHostReservationsResult`"
  (^com.amazonaws.services.ec2.model.DescribeHostReservationsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeHostReservationsRequest request]
    (-> this (.describeHostReservations request))))

(defn detach-network-interface
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DetachNetworkInterface. - `com.amazonaws.services.ec2.model.DetachNetworkInterfaceRequest`

  returns: Result of the DetachNetworkInterface operation returned by the service. - `com.amazonaws.services.ec2.model.DetachNetworkInterfaceResult`"
  (^com.amazonaws.services.ec2.model.DetachNetworkInterfaceResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DetachNetworkInterfaceRequest request]
    (-> this (.detachNetworkInterface request))))

(defn create-client-vpn-endpoint
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateClientVpnEndpointRequest`

  returns: Result of the CreateClientVpnEndpoint operation returned by the service. - `com.amazonaws.services.ec2.model.CreateClientVpnEndpointResult`"
  (^com.amazonaws.services.ec2.model.CreateClientVpnEndpointResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateClientVpnEndpointRequest request]
    (-> this (.createClientVpnEndpoint request))))

(defn delete-egress-only-internet-gateway
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayRequest`

  returns: Result of the DeleteEgressOnlyInternetGateway operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayResult`"
  (^com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayRequest request]
    (-> this (.deleteEgressOnlyInternetGateway request))))

(defn describe-moving-addresses
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeMovingAddressesRequest`

  returns: Result of the DescribeMovingAddresses operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeMovingAddressesResult`"
  (^com.amazonaws.services.ec2.model.DescribeMovingAddressesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeMovingAddressesRequest request]
    (-> this (.describeMovingAddresses request)))
  (^com.amazonaws.services.ec2.model.DescribeMovingAddressesResult [^AbstractAmazonEC2 this]
    (-> this (.describeMovingAddresses))))

(defn delete-network-interface-permission
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DeleteNetworkInterfacePermission. - `com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionRequest`

  returns: Result of the DeleteNetworkInterfacePermission operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionResult`"
  (^com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionRequest request]
    (-> this (.deleteNetworkInterfacePermission request))))

(defn describe-vpc-endpoint-services
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeVpcEndpointServices. - `com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesRequest`

  returns: Result of the DescribeVpcEndpointServices operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesRequest request]
    (-> this (.describeVpcEndpointServices request)))
  (^com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesResult [^AbstractAmazonEC2 this]
    (-> this (.describeVpcEndpointServices))))

(defn delete-transit-gateway-route
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteRequest`

  returns: Result of the DeleteTransitGatewayRoute operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteResult`"
  (^com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteRequest request]
    (-> this (.deleteTransitGatewayRoute request))))

(defn copy-fpga-image
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CopyFpgaImageRequest`

  returns: Result of the CopyFpgaImage operation returned by the service. - `com.amazonaws.services.ec2.model.CopyFpgaImageResult`"
  (^com.amazonaws.services.ec2.model.CopyFpgaImageResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CopyFpgaImageRequest request]
    (-> this (.copyFpgaImage request))))

(defn modify-vpc-endpoint-service-configuration
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationRequest`

  returns: Result of the ModifyVpcEndpointServiceConfiguration operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationResult`"
  (^com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationRequest request]
    (-> this (.modifyVpcEndpointServiceConfiguration request))))

(defn delete-vpc-peering-connection
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionRequest`

  returns: Result of the DeleteVpcPeeringConnection operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionResult`"
  (^com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionRequest request]
    (-> this (.deleteVpcPeeringConnection request))))

(defn describe-import-image-tasks
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeImportImageTasksRequest`

  returns: Result of the DescribeImportImageTasks operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeImportImageTasksResult`"
  (^com.amazonaws.services.ec2.model.DescribeImportImageTasksResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeImportImageTasksRequest request]
    (-> this (.describeImportImageTasks request)))
  (^com.amazonaws.services.ec2.model.DescribeImportImageTasksResult [^AbstractAmazonEC2 this]
    (-> this (.describeImportImageTasks))))

(defn describe-host-reservation-offerings
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsRequest`

  returns: Result of the DescribeHostReservationOfferings operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsResult`"
  (^com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsRequest request]
    (-> this (.describeHostReservationOfferings request))))

(defn reset-fpga-image-attribute
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ResetFpgaImageAttributeRequest`

  returns: Result of the ResetFpgaImageAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ResetFpgaImageAttributeResult`"
  (^com.amazonaws.services.ec2.model.ResetFpgaImageAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ResetFpgaImageAttributeRequest request]
    (-> this (.resetFpgaImageAttribute request))))

(defn associate-client-vpn-target-network
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AssociateClientVpnTargetNetworkRequest`

  returns: Result of the AssociateClientVpnTargetNetwork operation returned by the service. - `com.amazonaws.services.ec2.model.AssociateClientVpnTargetNetworkResult`"
  (^com.amazonaws.services.ec2.model.AssociateClientVpnTargetNetworkResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AssociateClientVpnTargetNetworkRequest request]
    (-> this (.associateClientVpnTargetNetwork request))))

(defn disassociate-vpc-cidr-block
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockRequest`

  returns: Result of the DisassociateVpcCidrBlock operation returned by the service. - `com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockResult`"
  (^com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockRequest request]
    (-> this (.disassociateVpcCidrBlock request))))

(defn modify-subnet-attribute
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifySubnetAttributeRequest`

  returns: Result of the ModifySubnetAttribute operation returned by the service. - `com.amazonaws.services.ec2.model.ModifySubnetAttributeResult`"
  (^com.amazonaws.services.ec2.model.ModifySubnetAttributeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifySubnetAttributeRequest request]
    (-> this (.modifySubnetAttribute request))))

(defn delete-key-pair
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteKeyPairRequest`

  returns: Result of the DeleteKeyPair operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteKeyPairResult`"
  (^com.amazonaws.services.ec2.model.DeleteKeyPairResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteKeyPairRequest request]
    (-> this (.deleteKeyPair request))))

(defn describe-vpn-gateways
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeVpnGateways. - `com.amazonaws.services.ec2.model.DescribeVpnGatewaysRequest`

  returns: Result of the DescribeVpnGateways operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpnGatewaysResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpnGatewaysResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeVpnGatewaysRequest request]
    (-> this (.describeVpnGateways request)))
  (^com.amazonaws.services.ec2.model.DescribeVpnGatewaysResult [^AbstractAmazonEC2 this]
    (-> this (.describeVpnGateways))))

(defn delete-vpc-endpoint-connection-notifications
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsRequest`

  returns: Result of the DeleteVpcEndpointConnectionNotifications operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsResult`"
  (^com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsRequest request]
    (-> this (.deleteVpcEndpointConnectionNotifications request))))

(defn copy-image
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for CopyImage. - `com.amazonaws.services.ec2.model.CopyImageRequest`

  returns: Result of the CopyImage operation returned by the service. - `com.amazonaws.services.ec2.model.CopyImageResult`"
  (^com.amazonaws.services.ec2.model.CopyImageResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CopyImageRequest request]
    (-> this (.copyImage request))))

(defn purchase-host-reservation
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.PurchaseHostReservationRequest`

  returns: Result of the PurchaseHostReservation operation returned by the service. - `com.amazonaws.services.ec2.model.PurchaseHostReservationResult`"
  (^com.amazonaws.services.ec2.model.PurchaseHostReservationResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.PurchaseHostReservationRequest request]
    (-> this (.purchaseHostReservation request))))

(defn disassociate-client-vpn-target-network
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DisassociateClientVpnTargetNetworkRequest`

  returns: Result of the DisassociateClientVpnTargetNetwork operation returned by the service. - `com.amazonaws.services.ec2.model.DisassociateClientVpnTargetNetworkResult`"
  (^com.amazonaws.services.ec2.model.DisassociateClientVpnTargetNetworkResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DisassociateClientVpnTargetNetworkRequest request]
    (-> this (.disassociateClientVpnTargetNetwork request))))

(defn disassociate-route-table
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DisassociateRouteTableRequest`

  returns: Result of the DisassociateRouteTable operation returned by the service. - `com.amazonaws.services.ec2.model.DisassociateRouteTableResult`"
  (^com.amazonaws.services.ec2.model.DisassociateRouteTableResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DisassociateRouteTableRequest request]
    (-> this (.disassociateRouteTable request))))

(defn reboot-instances
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.RebootInstancesRequest`

  returns: Result of the RebootInstances operation returned by the service. - `com.amazonaws.services.ec2.model.RebootInstancesResult`"
  (^com.amazonaws.services.ec2.model.RebootInstancesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.RebootInstancesRequest request]
    (-> this (.rebootInstances request))))

(defn cancel-spot-fleet-requests
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for CancelSpotFleetRequests. - `com.amazonaws.services.ec2.model.CancelSpotFleetRequestsRequest`

  returns: Result of the CancelSpotFleetRequests operation returned by the service. - `com.amazonaws.services.ec2.model.CancelSpotFleetRequestsResult`"
  (^com.amazonaws.services.ec2.model.CancelSpotFleetRequestsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CancelSpotFleetRequestsRequest request]
    (-> this (.cancelSpotFleetRequests request))))

(defn disable-vpc-classic-link
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DisableVpcClassicLinkRequest`

  returns: Result of the DisableVpcClassicLink operation returned by the service. - `com.amazonaws.services.ec2.model.DisableVpcClassicLinkResult`"
  (^com.amazonaws.services.ec2.model.DisableVpcClassicLinkResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DisableVpcClassicLinkRequest request]
    (-> this (.disableVpcClassicLink request))))

(defn replace-route
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ReplaceRouteRequest`

  returns: Result of the ReplaceRoute operation returned by the service. - `com.amazonaws.services.ec2.model.ReplaceRouteResult`"
  (^com.amazonaws.services.ec2.model.ReplaceRouteResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ReplaceRouteRequest request]
    (-> this (.replaceRoute request))))

(defn create-network-acl-entry
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateNetworkAclEntryRequest`

  returns: Result of the CreateNetworkAclEntry operation returned by the service. - `com.amazonaws.services.ec2.model.CreateNetworkAclEntryResult`"
  (^com.amazonaws.services.ec2.model.CreateNetworkAclEntryResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateNetworkAclEntryRequest request]
    (-> this (.createNetworkAclEntry request))))

(defn associate-vpc-cidr-block
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AssociateVpcCidrBlockRequest`

  returns: Result of the AssociateVpcCidrBlock operation returned by the service. - `com.amazonaws.services.ec2.model.AssociateVpcCidrBlockResult`"
  (^com.amazonaws.services.ec2.model.AssociateVpcCidrBlockResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AssociateVpcCidrBlockRequest request]
    (-> this (.associateVpcCidrBlock request))))

(defn delete-vpn-connection
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DeleteVpnConnection. - `com.amazonaws.services.ec2.model.DeleteVpnConnectionRequest`

  returns: Result of the DeleteVpnConnection operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteVpnConnectionResult`"
  (^com.amazonaws.services.ec2.model.DeleteVpnConnectionResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteVpnConnectionRequest request]
    (-> this (.deleteVpnConnection request))))

(defn describe-availability-zones
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeAvailabilityZonesRequest`

  returns: Result of the DescribeAvailabilityZones operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeAvailabilityZonesResult`"
  (^com.amazonaws.services.ec2.model.DescribeAvailabilityZonesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeAvailabilityZonesRequest request]
    (-> this (.describeAvailabilityZones request)))
  (^com.amazonaws.services.ec2.model.DescribeAvailabilityZonesResult [^AbstractAmazonEC2 this]
    (-> this (.describeAvailabilityZones))))

(defn modify-vpc-tenancy
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyVpcTenancyRequest`

  returns: Result of the ModifyVpcTenancy operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVpcTenancyResult`"
  (^com.amazonaws.services.ec2.model.ModifyVpcTenancyResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyVpcTenancyRequest request]
    (-> this (.modifyVpcTenancy request))))

(defn delete-customer-gateway
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DeleteCustomerGateway. - `com.amazonaws.services.ec2.model.DeleteCustomerGatewayRequest`

  returns: Result of the DeleteCustomerGateway operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteCustomerGatewayResult`"
  (^com.amazonaws.services.ec2.model.DeleteCustomerGatewayResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteCustomerGatewayRequest request]
    (-> this (.deleteCustomerGateway request))))

(defn delete-fleets
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteFleetsRequest`

  returns: Result of the DeleteFleets operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteFleetsResult`"
  (^com.amazonaws.services.ec2.model.DeleteFleetsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteFleetsRequest request]
    (-> this (.deleteFleets request))))

(defn delete-route
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteRouteRequest`

  returns: Result of the DeleteRoute operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteRouteResult`"
  (^com.amazonaws.services.ec2.model.DeleteRouteResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteRouteRequest request]
    (-> this (.deleteRoute request))))

(defn describe-client-vpn-connections
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeClientVpnConnectionsRequest`

  returns: Result of the DescribeClientVpnConnections operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeClientVpnConnectionsResult`"
  (^com.amazonaws.services.ec2.model.DescribeClientVpnConnectionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeClientVpnConnectionsRequest request]
    (-> this (.describeClientVpnConnections request))))

(defn create-volume
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for CreateVolume. - `com.amazonaws.services.ec2.model.CreateVolumeRequest`

  returns: Result of the CreateVolume operation returned by the service. - `com.amazonaws.services.ec2.model.CreateVolumeResult`"
  (^com.amazonaws.services.ec2.model.CreateVolumeResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateVolumeRequest request]
    (-> this (.createVolume request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonEC2

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonEC2 this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn modify-capacity-reservation
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyCapacityReservationRequest`

  returns: Result of the ModifyCapacityReservation operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyCapacityReservationResult`"
  (^com.amazonaws.services.ec2.model.ModifyCapacityReservationResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyCapacityReservationRequest request]
    (-> this (.modifyCapacityReservation request))))

(defn create-traffic-mirror-filter
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRequest`

  returns: Result of the CreateTrafficMirrorFilter operation returned by the service. - `com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterResult`"
  (^com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRequest request]
    (-> this (.createTrafficMirrorFilter request))))

(defn import-instance
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ImportInstanceRequest`

  returns: Result of the ImportInstance operation returned by the service. - `com.amazonaws.services.ec2.model.ImportInstanceResult`"
  (^com.amazonaws.services.ec2.model.ImportInstanceResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ImportInstanceRequest request]
    (-> this (.importInstance request))))

(defn delete-placement-group
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeletePlacementGroupRequest`

  returns: Result of the DeletePlacementGroup operation returned by the service. - `com.amazonaws.services.ec2.model.DeletePlacementGroupResult`"
  (^com.amazonaws.services.ec2.model.DeletePlacementGroupResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeletePlacementGroupRequest request]
    (-> this (.deletePlacementGroup request))))

(defn associate-address
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AssociateAddressRequest`

  returns: Result of the AssociateAddress operation returned by the service. - `com.amazonaws.services.ec2.model.AssociateAddressResult`"
  (^com.amazonaws.services.ec2.model.AssociateAddressResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AssociateAddressRequest request]
    (-> this (.associateAddress request))))

(defn create-fpga-image
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateFpgaImageRequest`

  returns: Result of the CreateFpgaImage operation returned by the service. - `com.amazonaws.services.ec2.model.CreateFpgaImageResult`"
  (^com.amazonaws.services.ec2.model.CreateFpgaImageResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateFpgaImageRequest request]
    (-> this (.createFpgaImage request))))

(defn delete-network-interface
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DeleteNetworkInterface. - `com.amazonaws.services.ec2.model.DeleteNetworkInterfaceRequest`

  returns: Result of the DeleteNetworkInterface operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteNetworkInterfaceResult`"
  (^com.amazonaws.services.ec2.model.DeleteNetworkInterfaceResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteNetworkInterfaceRequest request]
    (-> this (.deleteNetworkInterface request))))

(defn get-ebs-default-kms-key-id
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.GetEbsDefaultKmsKeyIdRequest`

  returns: Result of the GetEbsDefaultKmsKeyId operation returned by the service. - `com.amazonaws.services.ec2.model.GetEbsDefaultKmsKeyIdResult`"
  (^com.amazonaws.services.ec2.model.GetEbsDefaultKmsKeyIdResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.GetEbsDefaultKmsKeyIdRequest request]
    (-> this (.getEbsDefaultKmsKeyId request))))

(defn cancel-bundle-task
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for CancelBundleTask. - `com.amazonaws.services.ec2.model.CancelBundleTaskRequest`

  returns: Result of the CancelBundleTask operation returned by the service. - `com.amazonaws.services.ec2.model.CancelBundleTaskResult`"
  (^com.amazonaws.services.ec2.model.CancelBundleTaskResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CancelBundleTaskRequest request]
    (-> this (.cancelBundleTask request))))

(defn create-network-interface
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for CreateNetworkInterface. - `com.amazonaws.services.ec2.model.CreateNetworkInterfaceRequest`

  returns: Result of the CreateNetworkInterface operation returned by the service. - `com.amazonaws.services.ec2.model.CreateNetworkInterfaceResult`"
  (^com.amazonaws.services.ec2.model.CreateNetworkInterfaceResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateNetworkInterfaceRequest request]
    (-> this (.createNetworkInterface request))))

(defn describe-egress-only-internet-gateways
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysRequest`

  returns: Result of the DescribeEgressOnlyInternetGateways operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysResult`"
  (^com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysRequest request]
    (-> this (.describeEgressOnlyInternetGateways request))))

(defn create-instance-export-task
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateInstanceExportTaskRequest`

  returns: Result of the CreateInstanceExportTask operation returned by the service. - `com.amazonaws.services.ec2.model.CreateInstanceExportTaskResult`"
  (^com.amazonaws.services.ec2.model.CreateInstanceExportTaskResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateInstanceExportTaskRequest request]
    (-> this (.createInstanceExportTask request))))

(defn describe-security-groups
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeSecurityGroupsRequest`

  returns: Result of the DescribeSecurityGroups operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSecurityGroupsResult`"
  (^com.amazonaws.services.ec2.model.DescribeSecurityGroupsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeSecurityGroupsRequest request]
    (-> this (.describeSecurityGroups request)))
  (^com.amazonaws.services.ec2.model.DescribeSecurityGroupsResult [^AbstractAmazonEC2 this]
    (-> this (.describeSecurityGroups))))

(defn get-password-data
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.GetPasswordDataRequest`

  returns: Result of the GetPasswordData operation returned by the service. - `com.amazonaws.services.ec2.model.GetPasswordDataResult`"
  (^com.amazonaws.services.ec2.model.GetPasswordDataResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.GetPasswordDataRequest request]
    (-> this (.getPasswordData request))))

(defn delete-traffic-mirror-filter
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRequest`

  returns: Result of the DeleteTrafficMirrorFilter operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterResult`"
  (^com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRequest request]
    (-> this (.deleteTrafficMirrorFilter request))))

(defn attach-classic-link-vpc
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AttachClassicLinkVpcRequest`

  returns: Result of the AttachClassicLinkVpc operation returned by the service. - `com.amazonaws.services.ec2.model.AttachClassicLinkVpcResult`"
  (^com.amazonaws.services.ec2.model.AttachClassicLinkVpcResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AttachClassicLinkVpcRequest request]
    (-> this (.attachClassicLinkVpc request))))

(defn create-network-interface-permission
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for CreateNetworkInterfacePermission. - `com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionRequest`

  returns: Result of the CreateNetworkInterfacePermission operation returned by the service. - `com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionResult`"
  (^com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionRequest request]
    (-> this (.createNetworkInterfacePermission request))))

(defn describe-images
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeImagesRequest`

  returns: Result of the DescribeImages operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeImagesResult`"
  (^com.amazonaws.services.ec2.model.DescribeImagesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeImagesRequest request]
    (-> this (.describeImages request)))
  (^com.amazonaws.services.ec2.model.DescribeImagesResult [^AbstractAmazonEC2 this]
    (-> this (.describeImages))))

(defn create-vpc-endpoint-service-configuration
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationRequest`

  returns: Result of the CreateVpcEndpointServiceConfiguration operation returned by the service. - `com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationResult`"
  (^com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationRequest request]
    (-> this (.createVpcEndpointServiceConfiguration request))))

(defn purchase-reserved-instances-offering
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for PurchaseReservedInstancesOffering. - `com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingRequest`

  returns: Result of the PurchaseReservedInstancesOffering operation returned by the service. - `com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingResult`"
  (^com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingRequest request]
    (-> this (.purchaseReservedInstancesOffering request))))

(defn enable-transit-gateway-route-table-propagation
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.EnableTransitGatewayRouteTablePropagationRequest`

  returns: Result of the EnableTransitGatewayRouteTablePropagation operation returned by the service. - `com.amazonaws.services.ec2.model.EnableTransitGatewayRouteTablePropagationResult`"
  (^com.amazonaws.services.ec2.model.EnableTransitGatewayRouteTablePropagationResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.EnableTransitGatewayRouteTablePropagationRequest request]
    (-> this (.enableTransitGatewayRouteTablePropagation request))))

(defn describe-fleet-history
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeFleetHistoryRequest`

  returns: Result of the DescribeFleetHistory operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeFleetHistoryResult`"
  (^com.amazonaws.services.ec2.model.DescribeFleetHistoryResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeFleetHistoryRequest request]
    (-> this (.describeFleetHistory request))))

(defn delete-launch-template-versions
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsRequest`

  returns: Result of the DeleteLaunchTemplateVersions operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsResult`"
  (^com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsRequest request]
    (-> this (.deleteLaunchTemplateVersions request))))

(defn stop-instances
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.StopInstancesRequest`

  returns: Result of the StopInstances operation returned by the service. - `com.amazonaws.services.ec2.model.StopInstancesResult`"
  (^com.amazonaws.services.ec2.model.StopInstancesResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.StopInstancesRequest request]
    (-> this (.stopInstances request))))

(defn create-vpc-endpoint
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for CreateVpcEndpoint. - `com.amazonaws.services.ec2.model.CreateVpcEndpointRequest`

  returns: Result of the CreateVpcEndpoint operation returned by the service. - `com.amazonaws.services.ec2.model.CreateVpcEndpointResult`"
  (^com.amazonaws.services.ec2.model.CreateVpcEndpointResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateVpcEndpointRequest request]
    (-> this (.createVpcEndpoint request))))

(defn describe-vpc-classic-link
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeVpcClassicLinkRequest`

  returns: Result of the DescribeVpcClassicLink operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVpcClassicLinkResult`"
  (^com.amazonaws.services.ec2.model.DescribeVpcClassicLinkResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeVpcClassicLinkRequest request]
    (-> this (.describeVpcClassicLink request)))
  (^com.amazonaws.services.ec2.model.DescribeVpcClassicLinkResult [^AbstractAmazonEC2 this]
    (-> this (.describeVpcClassicLink))))

(defn describe-client-vpn-endpoints
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeClientVpnEndpointsRequest`

  returns: Result of the DescribeClientVpnEndpoints operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeClientVpnEndpointsResult`"
  (^com.amazonaws.services.ec2.model.DescribeClientVpnEndpointsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeClientVpnEndpointsRequest request]
    (-> this (.describeClientVpnEndpoints request))))

(defn delete-traffic-mirror-filter-rule
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRuleRequest`

  returns: Result of the DeleteTrafficMirrorFilterRule operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRuleResult`"
  (^com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRuleResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRuleRequest request]
    (-> this (.deleteTrafficMirrorFilterRule request))))

(defn delete-dhcp-options
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteDhcpOptionsRequest`

  returns: Result of the DeleteDhcpOptions operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteDhcpOptionsResult`"
  (^com.amazonaws.services.ec2.model.DeleteDhcpOptionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteDhcpOptionsRequest request]
    (-> this (.deleteDhcpOptions request))))

(defn modify-traffic-mirror-filter-rule
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterRuleRequest`

  returns: Result of the ModifyTrafficMirrorFilterRule operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterRuleResult`"
  (^com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterRuleResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterRuleRequest request]
    (-> this (.modifyTrafficMirrorFilterRule request))))

(defn describe-spot-instance-requests
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for DescribeSpotInstanceRequests. - `com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsRequest`

  returns: Result of the DescribeSpotInstanceRequests operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsResult`"
  (^com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsRequest request]
    (-> this (.describeSpotInstanceRequests request)))
  (^com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsResult [^AbstractAmazonEC2 this]
    (-> this (.describeSpotInstanceRequests))))

(defn modify-hosts
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyHostsRequest`

  returns: Result of the ModifyHosts operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyHostsResult`"
  (^com.amazonaws.services.ec2.model.ModifyHostsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyHostsRequest request]
    (-> this (.modifyHosts request))))

(defn create-snapshot
  "Description copied from interface: AmazonEC2

  request - Contains the parameters for CreateSnapshot. - `com.amazonaws.services.ec2.model.CreateSnapshotRequest`

  returns: Result of the CreateSnapshot operation returned by the service. - `com.amazonaws.services.ec2.model.CreateSnapshotResult`"
  (^com.amazonaws.services.ec2.model.CreateSnapshotResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateSnapshotRequest request]
    (-> this (.createSnapshot request))))

(defn delete-traffic-mirror-session
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorSessionRequest`

  returns: Result of the DeleteTrafficMirrorSession operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorSessionResult`"
  (^com.amazonaws.services.ec2.model.DeleteTrafficMirrorSessionResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorSessionRequest request]
    (-> this (.deleteTrafficMirrorSession request))))

(defn describe-transit-gateway-attachments
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeTransitGatewayAttachmentsRequest`

  returns: Result of the DescribeTransitGatewayAttachments operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeTransitGatewayAttachmentsResult`"
  (^com.amazonaws.services.ec2.model.DescribeTransitGatewayAttachmentsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeTransitGatewayAttachmentsRequest request]
    (-> this (.describeTransitGatewayAttachments request))))

(defn create-snapshots
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateSnapshotsRequest`

  returns: Result of the CreateSnapshots operation returned by the service. - `com.amazonaws.services.ec2.model.CreateSnapshotsResult`"
  (^com.amazonaws.services.ec2.model.CreateSnapshotsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateSnapshotsRequest request]
    (-> this (.createSnapshots request))))

(defn describe-subnets
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeSubnetsRequest`

  returns: Result of the DescribeSubnets operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeSubnetsResult`"
  (^com.amazonaws.services.ec2.model.DescribeSubnetsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeSubnetsRequest request]
    (-> this (.describeSubnets request)))
  (^com.amazonaws.services.ec2.model.DescribeSubnetsResult [^AbstractAmazonEC2 this]
    (-> this (.describeSubnets))))

(defn describe-import-snapshot-tasks
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksRequest`

  returns: Result of the DescribeImportSnapshotTasks operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksResult`"
  (^com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksRequest request]
    (-> this (.describeImportSnapshotTasks request)))
  (^com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksResult [^AbstractAmazonEC2 this]
    (-> this (.describeImportSnapshotTasks))))

(defn delete-network-acl
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DeleteNetworkAclRequest`

  returns: Result of the DeleteNetworkAcl operation returned by the service. - `com.amazonaws.services.ec2.model.DeleteNetworkAclResult`"
  (^com.amazonaws.services.ec2.model.DeleteNetworkAclResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DeleteNetworkAclRequest request]
    (-> this (.deleteNetworkAcl request))))

(defn describe-volume-status
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DescribeVolumeStatusRequest`

  returns: Result of the DescribeVolumeStatus operation returned by the service. - `com.amazonaws.services.ec2.model.DescribeVolumeStatusResult`"
  (^com.amazonaws.services.ec2.model.DescribeVolumeStatusResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DescribeVolumeStatusRequest request]
    (-> this (.describeVolumeStatus request)))
  (^com.amazonaws.services.ec2.model.DescribeVolumeStatusResult [^AbstractAmazonEC2 this]
    (-> this (.describeVolumeStatus))))

(defn modify-vpc-endpoint-service-permissions
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsRequest`

  returns: Result of the ModifyVpcEndpointServicePermissions operation returned by the service. - `com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsResult`"
  (^com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsRequest request]
    (-> this (.modifyVpcEndpointServicePermissions request))))

(defn disassociate-iam-instance-profile
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileRequest`

  returns: Result of the DisassociateIamInstanceProfile operation returned by the service. - `com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileResult`"
  (^com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileRequest request]
    (-> this (.disassociateIamInstanceProfile request))))

(defn create-transit-gateway-vpc-attachment
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.CreateTransitGatewayVpcAttachmentRequest`

  returns: Result of the CreateTransitGatewayVpcAttachment operation returned by the service. - `com.amazonaws.services.ec2.model.CreateTransitGatewayVpcAttachmentResult`"
  (^com.amazonaws.services.ec2.model.CreateTransitGatewayVpcAttachmentResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.CreateTransitGatewayVpcAttachmentRequest request]
    (-> this (.createTransitGatewayVpcAttachment request))))

(defn authorize-security-group-ingress
  "Description copied from interface: AmazonEC2

  request - `com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressRequest`

  returns: Result of the AuthorizeSecurityGroupIngress operation returned by the service. - `com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressResult`"
  (^com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressResult [^AbstractAmazonEC2 this ^com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressRequest request]
    (-> this (.authorizeSecurityGroupIngress request))))

