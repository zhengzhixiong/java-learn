#!/bin/bash
RESULT=$(curl -s -X POST "http://127.0.0.1:9090/cmd/hook" \
     -H     "Content-Type: application/json" \
     --data '{"domain":"'"$CERTBOT_DOMAIN"'","validation":"'"$CERTBOT_VALIDATION"'","token":"'"$CERTBOT_TOKEN"'","remaining":"'"$CERTBOT_REMAINING_CHALLENGES"'","allDomains":"'"$CERTBOT_ALL_DOMAINS"'"}')
#if [ "$RESULT" -eq "1111" ];
echo $RESULT >> /jmax/acme-challenge/test.log
#then
#echo "again"
#fi
# Save info for cleanup

# Sleep to make sure the change has time to propagate over to DNS
sleep 25